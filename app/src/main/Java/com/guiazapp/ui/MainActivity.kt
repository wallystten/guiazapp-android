package com.guiazapp.ui

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = "GuiaZapp abriu com sucesso 🚀"
        textView.textSize = 20f

        setContentView(textView)
    }
}
