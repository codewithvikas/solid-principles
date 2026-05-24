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
        bank.withdraw()

        val savingsAccount: SavingsAccount = SavingsAccount(15.0)
        savingsAccount.balance()
        savingsAccount.withdraw()

        val fdAccount : BankAccount = FixedDepositAccount(20.0)
        fdAccount.balance()
        fdAccount.withdraw() // does not follow liskov substitution principle as it behave differently then parent class method.
    }
}