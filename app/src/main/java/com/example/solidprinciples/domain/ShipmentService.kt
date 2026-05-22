package com.example.solidprinciples.domain

const val TAG = "ShipmentService"

class ShipmentService {

    val shipments: MutableList<StandardShipping> = mutableListOf()

    fun addShipment(shipment: StandardShipping) {
        shipments.add(shipment)
    }

    fun displayAllShipments() {
        for (shipment in shipments) {
            println(shipment.details())
        }
    }

    fun calculateTotalCost(): Double {
        return shipments.sumOf { shipment -> shipment.calculateCost() }
    }
}