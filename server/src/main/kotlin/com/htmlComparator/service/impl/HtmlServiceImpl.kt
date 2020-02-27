package com.htmlComparator.service.impl

import com.htmlComparator.comparator.HtmlComparator
import com.htmlComparator.model.CompareRequest
import com.htmlComparator.model.CompareResponse
import com.htmlComparator.service.HtmlService
import org.apache.commons.text.StringEscapeUtils
import org.apache.commons.text.diff.StringsComparator
import org.springframework.stereotype.Service

@Service
class HtmlServiceImpl : HtmlService {


    override fun compareHtmls(compareRequest: CompareRequest): CompareResponse {
        val comparator = StringsComparator(StringEscapeUtils.unescapeHtml4(compareRequest.firstHtml),
                StringEscapeUtils.unescapeHtml4(compareRequest.secondHtml))

        val htmlComparator = HtmlComparator()

        comparator.script.visit(htmlComparator)

        return CompareResponse(htmlComparator.getResult())
    }


}