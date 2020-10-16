package com.hayssamsoussi.spanit

import android.content.Context
import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.text.style.StrikethroughSpan
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import androidx.core.content.ContextCompat
import java.util.*

class SpanCollection(context: Context) {
    private var testList: MutableList<SpanString> = ArrayList()
    private var spannableStringBuilder: SpannableStringBuilder = SpannableStringBuilder()
    private var context: Context = context

    fun addColored(text: String?, color: Int) {
        testList.add(SpanString(text, null, color))
    }

    fun addStyled(text: String?, type: Int) {
        testList.add(SpanString(text, type, null))
    }

    fun addBoth(text: String?, color: Int, type: Int) {
        testList.add(SpanString(text, type, color))
    }

    fun print(): SpannableStringBuilder? {
        testList.forEach { addSpan(it.text, it.color, it.type) }
        return spannableStringBuilder
    }

    private fun addSpan(text: String?, color: Int?, type: Int?) {
        val start = spannableStringBuilder.length
        if (text != null) { spannableStringBuilder.append(text) }
        if (color != null) { spannableStringBuilder.setSpan(ForegroundColorSpan(ContextCompat.getColor(context, color)), start, spannableStringBuilder.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE) }
        if (type != null) {
            when (type) {
                1 -> spannableStringBuilder!!.setSpan(StyleSpan(Typeface.BOLD), start, spannableStringBuilder.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
                2 -> spannableStringBuilder!!.setSpan(StyleSpan(Typeface.NORMAL), start, spannableStringBuilder.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
                3 -> spannableStringBuilder!!.setSpan(StyleSpan(Typeface.ITALIC), start, spannableStringBuilder.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
                4 -> spannableStringBuilder!!.setSpan(StyleSpan(Typeface.BOLD_ITALIC), start, spannableStringBuilder.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
                5 -> spannableStringBuilder.append("\n")
                6 -> spannableStringBuilder.setSpan(UnderlineSpan(), start, spannableStringBuilder.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
                7 -> spannableStringBuilder.setSpan(StrikethroughSpan(), start, spannableStringBuilder.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
                else -> { }
            }
        }
    }
}