package com.example.solidprinciples.solid

class StorePickup(private val destination: String, weight: Double) :
    ShippingMethod(destination, weight) {
    override fun calculateCost(): Double {
        return 0.0
    }

    override fun details(): String {
        return "Store pickup $destination"
    }

}