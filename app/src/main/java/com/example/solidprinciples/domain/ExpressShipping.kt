package com.example.solidprinciples.domain

class ExpressShipping(private val destination: String, private val weight: Double) :
    ShippingMethod(destination, weight) {
    override fun calculateCost(): Double {
        return weight * 30
    }

    override fun details(): String {
        return "Express Shipping to $destination for weight $weight kg"
    }
}