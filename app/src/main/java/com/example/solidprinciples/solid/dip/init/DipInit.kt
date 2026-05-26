package com.example.solidprinciples.solid.dip.init

/**
 * DIP Violation: UserController (High-level) directly depends on 
 * SqlDatabase (Low-level). We cannot easily switch to another database.
 */

class SqlDatabase {
    fun saveUser(user: String) = println("Saving $user to SQL")
}

class UserController {
    private val database = SqlDatabase() // Tight coupling (Violation)

    fun saveUser(user: String) {
        database.saveUser(user)
    }
}
