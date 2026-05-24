package com.example.solidprinciples.solid.singleresponsblity

import com.example.solidprinciples.solid.openclose.Notification
import com.example.solidprinciples.solid.openclose.NotificationService
import kotlin.random.Random

class ThumbnailService(
    val logger: Logger,
    val notificationService: NotificationService,
    val notification: Notification
) {

    fun generateThumbnail(fileName: String) {
        println("Generating thumbnail $fileName")
        logger.logAction("Time Take for Thumbnail: ${Random.Default.nextInt(1, 10)} second for $fileName")
        notificationService.sendNotification(
            notification = notification,
            value = "Generated Thumbnail for $fileName"
        )
    }
}