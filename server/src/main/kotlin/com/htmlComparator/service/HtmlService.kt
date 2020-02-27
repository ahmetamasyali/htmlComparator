package com.htmlComparator.service

import com.htmlComparator.model.CompareRequest
import com.htmlComparator.model.CompareResponse

interface HtmlService {

    fun compareHtmls(compareRequest: CompareRequest):CompareResponse
}