package com.example.solidprinciples.domain

class StandardShipping(private val destination: String, private val weight: Double) {
    fun calculateCost(): Double {
        return weight * 15
    }

    fun details(): String {
        return "Standard Shipping to $destination for weight $weight kg"
    }
}