package com.example.solidprinciples.solid.srp.init

/**
 * SRP Violation: This class has multiple responsibilities:
 * 1. Managing files
 * 2. Logging actions
 * 3. Sending notifications
 */
class FileManager {
    private val files = mutableListOf<String>()

    fun openFile(fileName: String) {
        if (files.contains(fileName)) {
            println("Opening file $fileName")
            // Direct logging (Violation)
            println("Logging: Opening File $fileName")
            // Direct notification logic (Violation)
            println("Sending Email: Opening File $fileName")
        } else {
            println("Sending Email: Can not open file $fileName")
        }
    }

    fun saveFile(fileName: String) {
        println("Saving file $fileName")
        files.add(fileName)
        // Direct logging (Violation)
        println("Logging: Save $fileName")
        // Direct notification logic (Violation)
        println("Sending Email: Saved File $fileName")
    }
}
