package com.example.jeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by PC on 05.11.2017.
 */

@Controller
@RestController
public class HomeController {

    @RequestMapping("/")
    public String getString() {
        return "asdasd";
    }
}
