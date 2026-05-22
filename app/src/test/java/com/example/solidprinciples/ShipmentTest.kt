package com.example.solidprinciples

import com.example.solidprinciples.domain.ShipmentService
import com.example.solidprinciples.domain.StandardShipping
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ShipmentTest {

    val shipmentService = ShipmentService()

    @Before
    fun initShipmentService() {
        shipmentService.addShipment(standardShipping1)
        shipmentService.addShipment(standardShipping2)
        shipmentService.addShipment(standardShipping3)
    }

    @Test
    fun `verify standard shipping cost`() {
        val totalCost = shipmentService.calculateTotalCost()
        assertEquals(360.0, totalCost, 0.0)
    }

    companion object {
        val standardShipping1: StandardShipping = StandardShipping("Delhi", 12.0)
        val standardShipping2: StandardShipping = StandardShipping("Bangalore", 7.0)
        val standardShipping3: StandardShipping = StandardShipping("Patna", 5.0)
    }
}