package com.shenmo.os

class MainActivity : android.app.Activity() {
    override fun onCreate(state: android.os.Bundle?) {
        super.onCreate(state)

        val root = android.widget.LinearLayout(this)
        root.orientation = android.widget.LinearLayout.VERTICAL
        root.gravity = android.view.Gravity.CENTER_HORIZONTAL
        root.setPadding(36, 48, 36, 36)

        val title = android.widget.TextView(this)
        title.text = "ShenmoOS"
        title.textSize = 32f
        title.gravity = android.view.Gravity.CENTER
        root.addView(title)

        val subtitle = android.widget.TextView(this)
        subtitle.text = "Native starter is online."
        subtitle.textSize = 16f
        subtitle.gravity = android.view.Gravity.CENTER
        subtitle.setPadding(0, 12, 0, 24)
        root.addView(subtitle)

        setContentView(root)
    }
}
