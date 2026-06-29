package com.shenmo.os

class MainActivity : android.app.Activity() {
    override fun onCreate(state: android.os.Bundle?) {
        super.onCreate(state)
        setContentView(com.shenmo.os.R.layout.activity_main)

        val status = findViewById<android.widget.TextView>(com.shenmo.os.R.id.statusText)
        val chat = findViewById<android.widget.Button>(com.shenmo.os.R.id.chatButton)
        val bills = findViewById<android.widget.Button>(com.shenmo.os.R.id.billsButton)
        val focus = findViewById<android.widget.Button>(com.shenmo.os.R.id.focusButton)

        chat.setOnClickListener { status.text = "Chat module selected." }
        bills.setOnClickListener { status.text = "Bills module selected." }
        focus.setOnClickListener { status.text = "Focus module selected." }
    }
}
