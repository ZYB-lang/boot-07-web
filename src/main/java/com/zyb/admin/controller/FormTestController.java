package com.zyb.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName FormTestController
 * @Description TODO
 * @Author ZYB
 * @Date 2023/2/12 13:11
 * @Version 1.0
 **/
@Controller
public class FormTestController {
    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }
}
