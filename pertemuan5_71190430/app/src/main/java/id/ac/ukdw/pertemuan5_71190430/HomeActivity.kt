package id.ac.ukdw.pertemuan5_71190430

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_home)

                val nama = intent.getStringExtra("nama")

                val txtHasil = findViewById<TextView>(R.id.txtHasil)
                txtHasil.text = "Selamat Datang ...\n${nama}"
        }
}