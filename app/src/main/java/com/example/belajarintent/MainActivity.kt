package com.example.belajarintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.belajarintent.R.id.btn_pindah_data

private fun Nothing?.putExtra(extraText: String, value: String) {

}

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btn_intent)
        val btnIntentData = findViewById<Button>(R.id.btn_pindah_data)
        val btnIntentObjek = findViewById<Button>(R.id.btn_Pindah_Objek)

        btnIntent.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
        btnIntentObjek.setOnClickListener(this)
    }

    override fun onClick(v: View) {
       when(v.id){
           R.id.btn_intent ->{
               val intentBiasa = Intent(this@MainActivity, PindahActivity::class.java)
               startActivity(intentBiasa)
           }
           btn_pindah_data -> run{
               val intenData  = Intent(this@MainActivity, PindahDataActivity::class.java)
               val intentData = null
               val value = "Halo,ayo belajar kotlin"
               intentData.putExtra(PindahDataActivity.EXTRA_TEXT, "Halo,ayo belajar kotlin")
               startActivity(intenData)
           }
           R.id.btn_Pindah_Objek -> run {
               val cars = cars(
                 "Toyota Yaris",
                 2020,
                   "BM 2020 SAR"
               )

               val intentObjek = Intent(this@MainActivity, PindahObjekActivity::class.java)
               intentObjek.putExtra(PindahObjekActivity.EXTRA_CARS, cars)
               startActivity(intentObjek)
           }
       }
    }

    private fun cars() {

    }
}