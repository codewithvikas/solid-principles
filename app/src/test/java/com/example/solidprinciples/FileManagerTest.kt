package com.example.solidprinciples

import com.example.solidprinciples.domain.srp.EmailNotification
import com.example.solidprinciples.domain.srp.FileManager
import com.example.solidprinciples.domain.srp.Logger
import com.example.solidprinciples.domain.srp.NotificationService
import com.example.solidprinciples.domain.srp.ThumbnailService
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

class FileManagerTest {

    @Test
    fun `verify all message printed`() {
        val logger = Logger()
        val notificationService = NotificationService()
        val notification = EmailNotification()
        val thumbnailService = ThumbnailService(logger, notificationService, notification)
        val fileManager = FileManager(logger, notificationService, notification)
        val fileName = "ChatSheet.docx"
        fileManager.openFile(fileName)
        fileManager.saveFile(fileName)
        thumbnailService.generateThumbnail(fileName)
    }

    @Test
    fun `verify email notification`() {
        val logger = Logger()
        val notificationService: NotificationService = mockk(relaxed = true)
        val notification = EmailNotification()
        val thumbnailService = ThumbnailService(logger, notificationService, notification)
        val fileManager = FileManager(logger, notificationService, notification)
        val fileName = "ChatSheet.docx"
        val value = "Opening File $fileName"
        fileManager.saveFile(fileName)
        fileManager.openFile(fileName)
        thumbnailService.generateThumbnail(fileName)

        verify { notificationService.sendNotification(notification, value) }
    }
}