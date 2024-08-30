/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author isharaLakshitha
 */
@WebServlet(name = "X", urlPatterns = {"/X"})
public class X extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Gson gson = new Gson();
        JsonObject jsonObject1 = gson.fromJson(request.getReader(), JsonObject.class);

        System.out.println(jsonObject1.get("id").getAsInt());
        System.out.println(jsonObject1.get("name").getAsString());
        System.out.println(jsonObject1.get("age").getAsInt());
        System.out.println(jsonObject1.get("country").getAsString());

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("message", "Success");

        response.setContentType("application/json");
        response.getWriter().write(gson.toJson(jsonObject));
    }

}
