package com.example.solidprinciples.solid.lsp.final

/**
 * LSP Followed: We separated the 'Withdrawable' behavior into an interface.
 * Now FixedDepositAccount only inherits what it can actually do.
 */

interface Withdrawable {
    fun withdraw(amount: Double)
}

open class BankAccount(var balance: Double) {
    fun showBalance() = println("Balance: $balance")
}

class SavingsAccount(balance: Double) : BankAccount(balance), Withdrawable {
    override fun withdraw(amount: Double) {
        balance -= amount
        println("Savings withdrawn $amount. New balance: $balance")
    }
}

class FixedDepositAccount(balance: Double) : BankAccount(balance) {
    // No withdraw method here, so no contract is broken.
}
