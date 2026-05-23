package com.example.solidprinciples

import com.example.solidprinciples.domain.ExpressShipping
import com.example.solidprinciples.domain.ShipmentService
import com.example.solidprinciples.domain.StandardShipping
import com.example.solidprinciples.domain.StorePickup
import org.junit.Assert.assertEquals
import org.junit.Test

class ShipmentTest {

    val shipmentService = ShipmentService()

    @Test
    fun `verify standard shipping cost`() {
        shipmentService.addShipment(standardShipping1)
        shipmentService.addShipment(standardShipping2)
        shipmentService.addShipment(standardShipping3)
        val totalCost = shipmentService.calculateTotalCost()
        shipmentService.displayAllShipments()

        assertEquals(360.0, totalCost, 0.0)
    }

    @Test
    fun `verify express shipping cost`() {
        shipmentService.addShipment(expressShipping1)
        shipmentService.addShipment(expressShipping2)
        shipmentService.addShipment(expressShipping3)
        val totalCost = shipmentService.calculateTotalCost()
        shipmentService.displayAllShipments()

        assertEquals(720.0, totalCost, 0.0)
    }

    @Test
    fun `verify store pickup`() {
        shipmentService.addShipment(StorePickup("Gurugram", 10.0))
        val totalCost = shipmentService.calculateTotalCost()
        shipmentService.displayAllShipments()
        assertEquals(0.0, totalCost, 0.0)
    }

    companion object {
        val standardShipping1: StandardShipping = StandardShipping("Delhi", 12.0)
        val standardShipping2: StandardShipping = StandardShipping("Bangalore", 7.0)
        val standardShipping3: StandardShipping = StandardShipping("Patna", 5.0)

        val expressShipping1: ExpressShipping = ExpressShipping("Delhi", 12.0)
        val expressShipping2: ExpressShipping = ExpressShipping("Bangalore", 7.0)
        val expressShipping3: ExpressShipping = ExpressShipping("Patna", 5.0)
    }
}