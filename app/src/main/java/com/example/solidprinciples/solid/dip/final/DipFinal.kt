package com.example.solidprinciples.solid.dip.final

/**
 * DIP Followed: Both modules depend on the 'Database' abstraction.
 */

interface Database {
    fun save(data: String)
}

class SqlDatabase : Database {
    override fun save(data: String) = println("Saving $data to SQL")
}

class FirebaseDatabase : Database {
    override fun save(data: String) = println("Saving $data to Firebase")
}

class UserController(private val database: Database) { // Injection (Follows DIP)
    fun saveUser(user: String) {
        database.save(user)
    }
}
