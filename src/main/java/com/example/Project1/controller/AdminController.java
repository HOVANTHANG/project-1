package com.example.Project1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class AdminController {


    @RequestMapping(value = {"/addblog"}, method = RequestMethod.GET)
    public String addblog() {
        return "admin/addblog";
    }

    @RequestMapping(value = {"/addproduct"}, method = RequestMethod.GET)
    public String addproduct() {
        return "admin/addproduct";
    }

    @RequestMapping(value = {"/addvoucher"}, method = RequestMethod.GET)
    public String addvoucher() {
        return "admin/addvoucher";
    }

    @RequestMapping(value = {"/banner"}, method = RequestMethod.GET)
    public String banner() {
        return "admin/banner";
    }

    @RequestMapping(value = {"/blog"}, method = RequestMethod.GET)
    public String blog() {
        return "admin/blog";
    }

    @RequestMapping(value = {"/chat"}, method = RequestMethod.GET)
    public String chat() {
        return "admin/chat";
    }

    @RequestMapping(value = {"/danhmuc"}, method = RequestMethod.GET)
    public String danhmuc() {
        return "admin/danhmuc";
    }

    @RequestMapping(value = {"/doanhthu"}, method = RequestMethod.GET)
    public String doanhthu() {
        return "admin/doanhthu";
    }

    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public String index() {
        return "admin/index";
    }


    @RequestMapping(value = {"/addimportproduct"}, method = RequestMethod.GET)
    public String addimportproduct() {
        return "admin/addimportproduct";
    }

    @RequestMapping(value = {"/importproduct"}, method = RequestMethod.GET)
    public String importproduct() {
        return "admin/importproduct";
    }
}
