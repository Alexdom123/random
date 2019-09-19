package moreno.alex.random

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_perdiste.*

class perdiste : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perdiste)

        btnTryAgainLose.setOnClickListener {
            val main = Intent(this,MainActivity::class.java)
            startActivity(main)
        }
    }
}
