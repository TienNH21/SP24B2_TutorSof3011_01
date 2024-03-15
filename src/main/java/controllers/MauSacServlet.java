package controllers;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({
    "/mau-sac/index",
    "/mau-sac/create",
    "/mau-sac/store",
    "/mau-sac/edit",
    "/mau-sac/update",
    "/mau-sac/delete",
})
public class MauSacServlet extends HttpServlet {
    protected void doGet(
        HttpServletRequest req,
        HttpServletResponse resp
    ) {
        String uri = req.getRequestURI();
        if (uri.contains("create")) {
            this.create(req, resp);
        } else if (uri.contains("edit")) {
            this.edit(req, resp);
        } else if (uri.contains("delete")) {
            this.delete(req, resp);
        } else {
            this.index(req, resp);
        }
    }

    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse resp
    ) {
        String uri = req.getRequestURI();
        if (uri.contains("store")) {
            this.store(req, resp);
        } else if (uri.contains("update")) {
            this.update(req, resp);
        } else {
        }
    }

    protected void index(
            HttpServletRequest req,
            HttpServletResponse resp
    ) {

    }

    protected void create(
            HttpServletRequest req,
            HttpServletResponse resp
    ) {

    }

    protected void store(
            HttpServletRequest req,
            HttpServletResponse resp
    ) {

    }

    protected void edit(
            HttpServletRequest req,
            HttpServletResponse resp
    ) {

    }

    protected void update(
            HttpServletRequest req,
            HttpServletResponse resp
    ) {

    }

    protected void delete(
            HttpServletRequest req,
            HttpServletResponse resp
    ) {

    }
}
