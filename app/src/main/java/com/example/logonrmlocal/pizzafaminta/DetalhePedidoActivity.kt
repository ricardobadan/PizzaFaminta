package com.example.logonrmlocal.pizzafaminta

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalhe_pedido.*
import kotlinx.android.synthetic.main.activity_pedido.*

class DetalhePedidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_pedido)
        //Recebendo o pedido enviado pela tela anterior
        val pedido = intent.getParcelableExtra<Pedido>("pedido")
//Alterar o texto de boas vindas
        tvNomeDt.text = pedido.nomeCliente
        var sabores = ""

        for ((index, sabor) in pedido.sabores.withIndex()) {
            if((index+1) == pedido.sabores.size) {
                sabores += "$sabor"
            } else {
                sabores += "$sabor, "
            }

        }

        tvPizzaDt.text = sabores
        tvTamanhoDt.text = pedido.tamanho
        tvFormaDt.text = pedido.tipoPagamento


    }
}