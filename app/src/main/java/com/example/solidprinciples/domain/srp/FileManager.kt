package com.example.solidprinciples.domain.srp

/**
 * SOLID
 * S - Single Responsibility Principle (SRP)
 * Now FileManager follow SRP because this is only what intended.
 */
class FileManager(val logger: Logger, val notificationService: NotificationService) {
    private val files = mutableListOf<String>()

    public fun openFile(fileName: String) {
        if (files.contains(fileName)) {
            println("Opening file $fileName")
            logger.logAction("Opening File $fileName")
            notificationService.sendNotification("Opening File $fileName")
        } else {
            notificationService.sendNotification("Can not open file $fileName")
        }
    }

    public fun saveFile(fileName: String) {
        println("Saving file $fileName")
        files.add(fileName)
        logger.logAction("Save $fileName")
        notificationService.sendNotification("Saved File $fileName")
    }
}