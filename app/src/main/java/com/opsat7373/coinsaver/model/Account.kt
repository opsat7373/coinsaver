package com.opsat7373.coinsaver.model

class Account {
    var accountId : Long? = null
    var name : String? = null
    var transactions : List<Transaction> = emptyList()

    fun addTransaction(transaction : Transaction) {

    }

    fun getValue() : Long {
        return 0
    }
}
