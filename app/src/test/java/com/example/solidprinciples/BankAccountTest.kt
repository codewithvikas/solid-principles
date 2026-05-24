package com.example.solidprinciples

import com.example.solidprinciples.solid.liskovsubstitution.BankAccount
import com.example.solidprinciples.solid.liskovsubstitution.FixedDepositAccount
import com.example.solidprinciples.solid.liskovsubstitution.SavingsAccount
import org.junit.Test

class BankAccountTest {

    @Test
    fun `run bank operations`() {
        val bank: BankAccount = BankAccount(10.0)
        bank.balance()

        val savingsAccount: SavingsAccount = SavingsAccount(15.0)
        savingsAccount.balance()
        savingsAccount.withdraw(10.0)

        val fdAccount: BankAccount = FixedDepositAccount(20.0)
        fdAccount.balance() // behave same as parent
    }
}