package com.htmlComparator.controller

import com.htmlComparator.model.CompareRequest
import com.htmlComparator.service.HtmlService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
class MainController {

    @Autowired
    private lateinit var htmlService:HtmlService

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/compare", consumes = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun blog(@RequestBody compareRequest: CompareRequest): String {
        return htmlService.compareHtmls(compareRequest)
    }
}