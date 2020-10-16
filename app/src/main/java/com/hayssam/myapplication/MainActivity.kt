package com.hayssam.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.olive.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var c = SpanCollection(this)
        c.addColored("test", R.color.purple_200)
        c.addStyled("testt",
            SpanString.STRIKE_THROUGH
        )
        c.addStyled("testt",
            SpanString.UNDER_LINE
        )
        c.addBoth("testtt",
            R.color.purple_700,
            SpanString.BOLD
        )
        var textView:TextView = findViewById<TextView>(R.id.tv_text)
        textView.text = c.print()
    }
}