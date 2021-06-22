package com.opsat7373.coinsaver

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TransactionsListAdapter : RecyclerView.Adapter<TransactionViewHolder>() {

    private val transactions = listOf("one4", "two", "three")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.transaction_item, parent, false)

        return TransactionViewHolder(view)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val textView = holder.itemView.findViewById<TextView>(R.id.transaction_data)
        textView.text = transactions[position]
    }

    override fun getItemCount(): Int {
        return transactions.size
    }
}

class TransactionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}