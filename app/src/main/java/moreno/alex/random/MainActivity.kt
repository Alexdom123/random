package moreno.alex.random

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnComprobar.setOnClickListener {

            abstract class Random
            val numero = etNumero.text.toString()
            val numeroRandom = (0..10).random()
            if (numero.isEmpty()){
                mensajote("El campo esta vacío")
            }else{
            if (Integer.parseInt(numero) != numeroRandom){
                val loser = Intent(this,perdiste::class.java)
                startActivity(loser)
            }
            else{
                val winner = Intent(this,ganaste::class.java)
                startActivity(winner)
            }
            }
        }

    }
    fun mensajote(mensaje: String) {
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
    }
}
