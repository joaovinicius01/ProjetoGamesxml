package com.example.myapplication777.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication777.R
import com.example.myapplication777.model.Console

class AdapterConsole(private val context: Context, private val produtos: List<Console>) : RecyclerView.Adapter<AdapterConsole.ConsoleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConsoleViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.console_item, parent, false)
        return ConsoleViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: ConsoleViewHolder, position: Int) {
        val console = produtos[position]
        holder.foto.setImageResource(console.foto)
        holder.nome.text = console.nome
        holder.descricao.text = console.descricao
        holder.preco.text = console.preco.toString()
    }

    override fun getItemCount(): Int = produtos.size

    inner class ConsoleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto: ImageView = itemView.findViewById(R.id.console_image)
        val nome: TextView = itemView.findViewById(R.id.console_name)
        val descricao: TextView = itemView.findViewById(R.id.console_description)
        val preco: TextView = itemView.findViewById(R.id.console_price)
    }
}
