package com.elang.ustpersiapan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Detail Kampus"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)


        imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.poltektegal))
        textViewNamaDetail.text = intent.getStringExtra("nama")
        textViewKotaDetail.text = intent.getStringExtra("kota")
        textViewKetDetail.text = intent.getStringExtra("keterangan")

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}