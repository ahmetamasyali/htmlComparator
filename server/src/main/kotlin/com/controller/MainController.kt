package com.ahmet.test.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Blog"
        return "index"
    }
}