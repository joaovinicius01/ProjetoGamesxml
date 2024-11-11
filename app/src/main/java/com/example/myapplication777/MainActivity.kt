package com.example.myapplication777

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttonHome: Button
    private lateinit var buttonConsoles: Button

    private lateinit var homeFragment: HomeFragment
    private lateinit var consoleFragment: ConsoleFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializa os botões e os fragmentos
        buttonHome = findViewById(R.id.button_home)
        buttonHome.setOnClickListener(this)

        buttonConsoles = findViewById(R.id.button_consoles)
        buttonConsoles.setOnClickListener(this)

        homeFragment = HomeFragment()
        consoleFragment = ConsoleFragment()

        // Definindo o fragment inicial
        setFragment(homeFragment)
    }

    private fun setFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_fragments, fragment)
        fragmentTransaction.commit()
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button_home -> {
                setFragment(homeFragment)
            }
            R.id.button_consoles -> {
                setFragment(consoleFragment)
            }
        }
    }
}
