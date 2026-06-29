package com.shenmo.os

class MainActivity : android.app.Activity() {
    override fun onCreate(state: android.os.Bundle?) {
        super.onCreate(state)
        val view = android.widget.TextView(this)
        view.text = "ShenmoOS"
        setContentView(view)
    }
}
