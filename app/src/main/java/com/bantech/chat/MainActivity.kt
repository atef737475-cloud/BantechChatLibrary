package com.bantech.chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Test the library
        val config = BantechChatLibrary.config(
            customerId = "test_customer_id",
            customerToken = "test_customer_token"
        )

        val chatView = BantechChatLibrary.createChatView(this, config)

        // Add to layout
        val container = findViewById<android.widget.FrameLayout>(R.id.container)
        container?.addView(chatView)
    }
}