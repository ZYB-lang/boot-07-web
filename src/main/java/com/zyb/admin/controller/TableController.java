package com.zyb.admin.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zyb.admin.bean.User;
import com.zyb.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName TableController
 * @Description TODO
 * @Author ZYB
 * @Date 2023/2/11 14:39
 * @Version 1.0
 **/
@Controller
public class TableController {
    @Autowired
    UserService userService;
    @GetMapping("/basic_table")
    public String basic_table(@RequestParam int a){
        int i = 10/0;
        return "table/basic_table";
    }
    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
        //表格内容的遍历
//        List<User> users = Arrays.asList(new User("zhangsan", "123456"),
//                new User("lisi", "322"),
//                new User("haha", "3333"),
//                new User("heeh", "12333"));
//        model.addAttribute("users",users);
        List<User> list = userService.list();
//        model.addAttribute("users",list);
        Page<User> userpage = new Page(pn, 2);
        Page<User> page = userService.page(userpage, null);
        model.addAttribute(page);


        return "table/dynamic_table";
    }
    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id,
                             @RequestParam(value = "pn",defaultValue = "1")Integer pn,
                             RedirectAttributes ra){

        userService.removeById(id);

        ra.addAttribute("pn",pn);
        return "redirect:/dynamic_table";
    }
    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }
    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }
}
