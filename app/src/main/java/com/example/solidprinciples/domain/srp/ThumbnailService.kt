package com.example.solidprinciples.domain.srp

import kotlin.random.Random

class ThumbnailService(val logger: Logger, val notificationService: NotificationService) {

    fun generateThumbnail(fileName: String) {
        println("Generating thumbnail $fileName")
        logger.logAction("Time Take for Thumbnail: ${Random.nextInt(1, 10)} second for $fileName")
        notificationService.sendNotification(
            type = NotificationType.WHATSAPP,
            value = "Generated Thumbnail for $fileName"
        )
    }
}
