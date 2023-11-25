package com.app.meusgastos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.meusgastos.databinding.ActivityMainBinding
import com.app.meusgastos.utils.list

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        exibirMesAtual()
        binding.btnMesSeguinte.setOnClickListener {
            mostrarProximoMes()
        }
        binding.btnMesAnterior.setOnClickListener {
            mostrarMesAnterior()
        }

        binding.btnMais.setOnClickListener {
            startActivity(Intent(this@MainActivity, AddDespesasActivity::class.java))
        }
    }

    private fun exibirMesAtual(){
        val mesAtual = list.listMeses.getOrNull(list.intexAtual)
        binding.mes.text = mesAtual
    }

    private fun mostrarMesAnterior() {
        if (list.intexAtual > 0) {
            list.intexAtual--
            exibirMesAtual()
        }
    }

    private fun mostrarProximoMes() {
        if (list.intexAtual < list.listMeses.size - 1) {
            list.intexAtual++
            exibirMesAtual()
        }
    }

}