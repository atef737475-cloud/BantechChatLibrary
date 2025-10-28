package com.bantech.chat

import android.content.Context

object BantechChatLibrary {
    fun createChatView(
        context: Context,
        config: BantechChatConfig
    ): BantechChatView {
        return BantechChatView(context).apply {
            initialize(config)
        }
    }

    fun config(
        customerId: String,
        customerToken: String,
        init: BantechChatConfigBuilder.() -> Unit = {}
    ): BantechChatConfig {
        return BantechChatConfigBuilder(customerId, customerToken)
            .apply(init)
            .build()
    }
}