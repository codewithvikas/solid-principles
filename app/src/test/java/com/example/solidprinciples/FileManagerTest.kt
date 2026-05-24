package com.example.solidprinciples

import com.example.solidprinciples.domain.srp.FileManager
import com.example.solidprinciples.domain.srp.Logger
import com.example.solidprinciples.domain.srp.NotificationService
import com.example.solidprinciples.domain.srp.ThumbnailService
import org.junit.Test

class FileManagerTest {

    @Test
    fun `verify all message printed`() {
        val logger = Logger()
        val notificationService = NotificationService()
        val thumbnailService = ThumbnailService(logger, notificationService)
        val fileManager = FileManager(logger, notificationService)
        val fileName = "ChatSheet.docx"
        fileManager.openFile(fileName)
        fileManager.saveFile(fileName)
        thumbnailService.generateThumbnail(fileName)
    }
}