package com.dmc.controller;

import com.dmc.domain.Comment;
import com.dmc.domain.Grid;
import com.dmc.domain.Result;
import com.dmc.domain.User;
import com.dmc.services.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xiaobian.chen
 * @version 1.0 2015/10/21
 */
@Controller
@RequestMapping(value="/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @RequestMapping(method= RequestMethod.GET)
    public String admin() {
         return "admin";
    }

    /**
     * returns list for users
     * @return
     */
    @RequestMapping(value="/listUsers",produces = "application/json;charset=utf-8")
    public @ResponseBody String listUser(HttpServletRequest request,HttpServletResponse response) {
        Integer page = Integer.valueOf(request.getParameter("page"));
        Integer rows = Integer.valueOf(request.getParameter("rows"));
        String  searchParameter = request.getParameter("searchConditions");
        List<User> userList = createPaginationData(page, rows);
        userList = getListBasedSearchParameter(searchParameter,userList);

        Grid grid = new Grid();
        grid.setTotal(userList.size());
        grid.setRows(userList);

        Gson gson = new Gson();
        String json = gson.toJson(grid);
        return json;
    }

    /**
     * add user
     * @param user
     * @return
     */
    @RequestMapping(value="/addUser",produces = "application/json;charset=utf-8")
    public void addUser(User user,HttpServletResponse response) {
        boolean success = userService.getUserByUserName(user.getUsername());
        Result result = new Result();
        result.setSuccess(success);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String registerTime = sdf.format(new Date());

        if (success) {
            result.setMessage("user is existed, please check!");
            result.setSuccess(false);
            result.writeJson(result,response);
        }else{
            user.setRegisterDate(registerTime);
            userService.insert(user);
            result.setMessage("create user successfully!");
            result.setSuccess(true);
            result.writeJson(result,response);
        }
    }

    /**
     * remove user
     * @param request
     * @param response
     */
    @RequestMapping(value="/removeUser",produces = "application/json;charset=utf-8")
    public void removeUser(HttpServletRequest request, HttpServletResponse response) {
        Result result = new Result();
        String username = request.getParameter("id");
        try {
            userService.deleteUser(username);
            result.setMessage("delete user successfully!");
            result.setSuccess(true);
            result.writeJson(result,response);
        } catch (Exception e) {
            result.setMessage("delete user failed!" + e.getMessage());
            result.writeJson(result,response);
        }
    }

    /**
     * update user
     * @param user
     * @param response
     */
    @RequestMapping(value="/updateUser")
    public void updateUser(User user,HttpServletResponse response) {
        Result result = new Result();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String registerTime = sdf.format(new Date());
        try {
        	user.setRegisterDate(registerTime);
            userService.updateUsers(user);
            result.setMessage("update user successfully!");
            result.setSuccess(true);
            result.writeJson(result,response);
        } catch (Exception e) {
            result.setMessage("update user failed" + e.getMessage());
            result.writeJson(result, response);
        }
    }

    /**
     * create pagination data
     * @param pageNumber
     * @param rows
     * @return
     */
    public List<User> createPaginationData(int pageNumber,int rows){
        List<User> userList = userService.listUsers();

        if(rows < userList.size()){
            if(pageNumber == 1){
                userList = userList.subList(0, pageNumber*rows);
            }else{
                if(pageNumber*rows <= userList.size()){
                    userList = userList.subList((pageNumber-1)*10, pageNumber*rows);
                }else{
                    userList = userList.subList((pageNumber-1)*10,userList.size());
                }
            }
        }
        return userList;
    }


    /**
     * get search data
     * @param searchParameter
     * @param userList
     * @return
     */
    public List<User> getListBasedSearchParameter(String searchParameter,List<User> userList) {
        List<User> searchList = new ArrayList<User>();
        if(null != searchParameter && !searchParameter.equals("")){
            searchList = new ArrayList<User>();
            searchParameter = searchParameter.toUpperCase();
            for(User user:userList){
                if(String.valueOf(user.getUsername()).toUpperCase().indexOf(searchParameter)!=-1
                        ||user.getPassword().toUpperCase().indexOf(searchParameter)!=-1
                        || user.getEmail().toUpperCase().indexOf(searchParameter)!=-1
                        || user.getPhone().toUpperCase().indexOf(searchParameter)!=-1){

                    searchList.add(user);
                }
            }

            userList = searchList;
            searchList = null;
        }

        return userList;
    }
}
