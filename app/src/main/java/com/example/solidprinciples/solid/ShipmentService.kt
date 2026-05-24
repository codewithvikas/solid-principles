package com.example.solidprinciples.solid

class ShipmentService {

    val shipments: MutableList<ShippingMethod> = mutableListOf()

    fun addShipment(shipment: ShippingMethod) {
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