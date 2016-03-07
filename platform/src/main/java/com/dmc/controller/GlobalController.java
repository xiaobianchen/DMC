package com.dmc.controller;

import com.dmc.domain.FormatModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/6
 */
@Controller
@RequestMapping(value="/global")
public class GlobalController {

    @RequestMapping(value = "/locale",method = RequestMethod.GET,produces = {"text/plain;charset=UTF-8"})
    public String locale(HttpServletRequest request,Model model){
        if(!model.containsAttribute("contentModel")) {
            RequestContext requestContext = new RequestContext(request);
            model.addAttribute("money", requestContext.getMessage("money"));
            model.addAttribute("date", requestContext.getMessage("date"));

            FormatModel formatModel = new FormatModel();
            formatModel.setMoney(1234.23);
            formatModel.setDate(new Date());

            model.addAttribute("contentModel", formatModel);
        }

        return "global";
    }
}
