package controllers;

import entities.MauSac;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repositories.MauSacRepository;

import java.io.IOException;

@WebServlet({
    "/mau-sac/index",
    "/mau-sac/create",
    "/mau-sac/store",
    "/mau-sac/edit",
    "/mau-sac/update",
    "/mau-sac/delete",
})
public class MauSacServlet extends HttpServlet {
    private MauSacRepository msRepo = new MauSacRepository();
    protected void doGet(
        HttpServletRequest req,
        HttpServletResponse resp
    ) throws ServletException, IOException {
        String uri = req.getRequestURI();
        System.out.println("URL:" + req.getRequestURL().toString());
        System.out.println("URI:" + req.getRequestURI());
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
    ) throws IOException {
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
    ) throws ServletException, IOException {
        req.setAttribute("data", msRepo.getListMS());
        req.getRequestDispatcher("/views/mau_sac/index.jsp")
            .forward(req, resp);
    }

    protected void create(
            HttpServletRequest req,
            HttpServletResponse resp
    ) throws ServletException, IOException {
        req.getRequestDispatcher("/views/mau_sac/create.jsp")
                .forward(req, resp);
    }

    protected void store(
            HttpServletRequest req,
            HttpServletResponse resp
    ) throws IOException {
        String ma = req.getParameter("ma");
        String ten = req.getParameter("ten");
        int trangThai = Integer.parseInt(req.getParameter("trangThai"));
        MauSac ms = new MauSac(null, ma, ten, trangThai);
        this.msRepo.create(ms);
        resp.sendRedirect("/mau-sac/index");
    }

    protected void edit(
            HttpServletRequest req,
            HttpServletResponse resp
    ) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        MauSac ms = this.msRepo.findById(id);
        req.setAttribute("data", ms);
        req.getRequestDispatcher("/views/mau_sac/edit.jsp")
                .forward(req, resp);
    }

    protected void update(
            HttpServletRequest req,
            HttpServletResponse resp
    ) throws IOException {
        // int id = ?
        String ma = req.getParameter("ma");
        String ten = req.getParameter("ten");
        int trangThai = Integer.parseInt(req.getParameter("trangThai"));
//        MauSac ms = new MauSac(id, ma, ten, trangThai);
//        this.msRepo.update(ms);
        resp.sendRedirect("/mau-sac/index");
    }

    protected void delete(
            HttpServletRequest req,
            HttpServletResponse resp
    ) throws IOException {
        int id = Integer.parseInt(req.getParameter("id") );
        MauSac ms = this.msRepo.findById(id);
        this.msRepo.delete(ms);

        resp.sendRedirect("/mau-sac/index");
    }
}
