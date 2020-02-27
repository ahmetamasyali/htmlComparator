package com.htmlComparator.comparator

import org.apache.commons.text.diff.CommandVisitor

class HtmlComparator : CommandVisitor<Char> {
    private var result = ""
    private var isInsideHtmlTag = false

    override fun visitKeepCommand(c: Char) {
        isHtmlTagStarted(c)
        result += c
    }

    override fun visitInsertCommand(c: Char) {
        if (isHtmlTagStarted(c)) {
            result += c
        } else {
            result = "$result<span style=\"background-color: green\">$c</span>"
        }
    }

    override fun visitDeleteCommand(c: Char) {
        if (isHtmlTagStarted(c)) {
            result += c
        } else {
            result = "$result<span style=\"background-color: red\">$c</span>"
        }
    }

    private fun isHtmlTagStarted(c: Char): Boolean {
        if (c == '<') isInsideHtmlTag = true
        if (c == '>') isInsideHtmlTag = false
        return isInsideHtmlTag || c == '>'
    }

    fun getResult():String {
        return this.result
    }
}