package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DashboardController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String rootView(){
        return "index";
    }

}
