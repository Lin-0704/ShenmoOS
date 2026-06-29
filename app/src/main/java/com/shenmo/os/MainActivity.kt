package com.shenmo.os

class MainActivity : android.app.Activity() {
    override fun onCreate(state: android.os.Bundle?) {
        super.onCreate(state)
        setContentView(com.shenmo.os.R.layout.activity_main)

        val status = findViewById<android.widget.TextView>(com.shenmo.os.R.id.statusText)
        val chat = findViewById<android.widget.Button>(com.shenmo.os.R.id.chatButton)
        chat.setOnClickListener {
            status.text = "Chat module selected."
        }
    }
}
