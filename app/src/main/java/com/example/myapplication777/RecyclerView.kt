package com.example.myapplication777


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication777.Adapter.AdapterConsole
import com.example.myapplication777.model.Console

class RecyclerView : AppCompatActivity() {

    /*lateinit var rvContato : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.console_item)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        rvContato = findViewById(R.id.rvTeste)

        // val contatos = listOf("Roger", "Stephany", "Marilda", "Jorge")

        val Console = listOf(
            Console(    "ps5", "Fala Ai!", "5:40", "-"),
            Console("Stephany", "Oiiiiiii...", "9:49", "-"),
            Console("Marilda", "Aqui é da Claro...", "16:40", "-"),
            Console("Jorge", "Salve", "15:43", "-"),
        )

        rvContato.adapter = AdapterConsole(Console)

        rvContato.layoutManager = LinearLayoutManager(this)


    }*/
}
