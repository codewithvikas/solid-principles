package com.example.solidprinciples

import com.example.solidprinciples.domain.srp.FileManager
import org.junit.Test

class FileManagerTest {

    @Test
    fun `verify all message printed`() {
        val fileManager = FileManager()
        val fileName = "ChatSheet.docx"
        fileManager.openFile(fileName)
        fileManager.saveFile(fileName)
        fileManager.generateThumbnail(fileName)
    }
}