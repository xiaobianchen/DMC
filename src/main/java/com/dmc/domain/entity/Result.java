package com.dmc.domain.entity;

import com.google.gson.Gson;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 * @author xiaobian.chen
 * @version 1.0 2015/10/21
 *
 * returns result for the response
 */
public class Result implements Serializable {
	private static final long serialVersionUID = 1L;
	private boolean success;
    private String  message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * convert an object to json, return to front-end
     * @param object
     * @throws IOException
     */
    public void writeJson(Object object ,HttpServletResponse response) {
        Gson gson = new Gson();
        String json = gson.toJson(object);

        PrintWriter out = null;
        response.setContentType("application/json");

        try {
            out = response.getWriter();
            out.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
