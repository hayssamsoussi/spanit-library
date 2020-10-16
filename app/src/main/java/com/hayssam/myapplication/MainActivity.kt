package com.hayssam.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.hayssamsoussi.spanit.SpanString
import com.hayssamsoussi.spanit.SpanText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var c = SpanText(this)
        c.addColoredText("test", R.color.purple_200)
        c.addStyledText("testt", SpanString.STRIKE_THROUGH)
        c.addStyledText("testt", SpanString.NEW_LINE)
        c.addColoredStyledText("testtt", R.color.purple_700, SpanString.BOLD)
        var textView:TextView = findViewById<TextView>(R.id.tv_text)
        textView.text = c.toText()
    }
}