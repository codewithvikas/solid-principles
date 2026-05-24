package com.example.solidprinciples.solid.openclose

class WhatsappNotification : Notification {
    override fun notify(value: String) {
        println("Sending Whatsapp message $value")
    }
}