package com.htmlComparator.service

import com.htmlComparator.model.CompareRequest

interface HtmlService {

    fun compareHtmls(compareRequest: CompareRequest):String
}