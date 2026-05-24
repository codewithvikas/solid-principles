package com.example.solidprinciples.domain.srp

class WhatsappNotification : Notification {
    override fun notify(value: String) {
        println("Sending Whatsapp message $value")
    }
}