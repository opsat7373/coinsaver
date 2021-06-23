package com.opsat7373.coinsaver.model

import java.util.*

data class Transaction(
    val id : Long,
    val accountId : Long,
    val amount : Float,
    val date : Date
    ) {

}