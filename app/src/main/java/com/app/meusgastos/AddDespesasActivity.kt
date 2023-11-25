package com.app.meusgastos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.meusgastos.databinding.ActivityAddDespesasBinding
import com.app.meusgastos.utils.hide
import com.app.meusgastos.utils.show

class AddDespesasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddDespesasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddDespesasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backMain.setOnClickListener {
            startActivity(Intent(this@AddDespesasActivity, MainActivity::class.java))
        }
        radioButtomRepetirNaoReptir()
        radioButtonParcelas()
    }

    private fun radioButtomRepetirNaoReptir(){
        val radioButtom = binding.radioGroupNaorepetirRepetir
        radioButtom.setOnCheckedChangeListener{group, checkedId->
            when(checkedId){
                R.id.nao_repetir -> {binding.radioGroupFixoParcelado.hide()}
                R.id.repetir  -> {binding.radioGroupFixoParcelado.show()}
            }
        }
    }

    private fun radioButtonParcelas(){
        val radioButtomParcelas = binding.radioGroupFixoParcelado
        radioButtomParcelas.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.fixo ->{binding.llNumeroDeParcelas.hide()}
                R.id.parcelado ->{binding.llNumeroDeParcelas.show()}
            }
        }
    }
}