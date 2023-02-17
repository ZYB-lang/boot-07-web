package com.zyb.admin.controller;

import com.zyb.admin.bean.Dept;
import com.zyb.admin.bean.User;
import com.zyb.admin.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author ZYB
 * @Date 2023/2/11 13:28
 * @Version 1.0
 **/
@Controller
public class IndexController {
    @Autowired
    DeptService deptService;
    @GetMapping({"/","/login"})
    public String loginPage(){
        return "login";
    }
    @ResponseBody
    @GetMapping("/dept")
    public Dept getDeptById(@RequestParam("deptId") Integer deptId){
        return deptService.getDeptById(deptId);
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUserName())&&"123456".equals(user.getPassWord())){
            session.setAttribute("loginUser",user);
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
    }
    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){
//        Object loginUser = session.getAttribute("loginUser");
//        if(loginUser!=null){
//            return "main";
//        }else {
//            //回到登录页
//            model.addAttribute("msg","请重新登录");
//            return  "login";
//        }
        return "main";
    }
}
