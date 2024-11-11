package com.example.myapplication777

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication777.Adapter.AdapterConsole
import com.example.myapplication777.model.Console

class ConsoleFragment : Fragment() {

    private lateinit var recyclerViewConsole: RecyclerView
    private lateinit var adapterConsole: AdapterConsole



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val listaConsoles: MutableList<Console> = mutableListOf()

        val view = inflater.inflate(R.layout.fragment_console, container, false)

        // Inicializa RecyclerView e Adapter
        recyclerViewConsole = view.findViewById(R.id.recyclerView_console)
        // recyclerViewConsole.layoutManager = LinearLayoutManager(requireContext())
        // recyclerViewConsole.setHasFixedSize(true)


        val console1 = Console(
            R.drawable.ps5,  // A imagem do PS5
            "Ps5",
            "Disponivel",
            "R$ 4500"
        )
        val console2 = Console(
            R.drawable.download,  // A imagem do PS5
            "Controle Gamer Ps5",
            "Vendido",
            "R$ 3600"
        )
        val console3 = Console(
            R.drawable.nintendo,  // A imagem do PS5
            "nintendo",
            "Disponivel",
            "R$ 1500"
        )
        val console4 = Console(
            R.drawable.remote,  // A imagem do PS5
            " PlayStation Portal™",
            "Disponivel 3",
            "R$ 7000"
        )
        val console5 = Console(
            R.drawable.xbox,  // A imagem do PS5
            "Xbox Series X",
            "Disponivel",
            "R$ 5159"
        )

        listaConsoles.add(console1)
        listaConsoles.add(console2)
        listaConsoles.add(console3)
        listaConsoles.add(console4)
        listaConsoles.add(console5)

        // Inicializa o Adapter com a lista de consoles
        adapterConsole = AdapterConsole(requireContext(), listaConsoles)

        recyclerViewConsole.adapter = adapterConsole

        recyclerViewConsole.layoutManager = LinearLayoutManager(requireContext())

        return view
    }


}
