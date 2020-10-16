package com.olive.myapplication

class SpanString(var text: String?, var type: Int?, var color: Int?) {

    companion object {
        val BOLD = 1
        val REGULAR = 2
        val ITALIC = 3
        val BOLD_ITALIC = 4
        val NEW_LINE = 5
        val UNDER_LINE = 6
        val STRIKE_THROUGH = 7
    }
}