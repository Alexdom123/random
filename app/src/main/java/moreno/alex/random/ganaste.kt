package moreno.alex.random

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ganaste.*

class ganaste : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ganaste)

        btnTryAgainWin.setOnClickListener {
            val main2 = Intent(this,MainActivity::class.java)
            startActivity(main2)
        }
    }
}
