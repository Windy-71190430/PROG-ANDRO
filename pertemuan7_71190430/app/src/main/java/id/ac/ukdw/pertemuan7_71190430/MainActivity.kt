package id.ac.ukdw.pertemuan7_71190430

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listKontak = arrayListOf<Kontak>()
        listKontak.add(Kontak("Andro", "082191179037", R.mipmap.androo))
        listKontak.add(Kontak("Anca", "082198306710", R.mipmap.anca))
        listKontak.add(Kontak("Anjel", "087709102459", R.mipmap.anjel))
        listKontak.add(Kontak("Dita", "082293457012", R.mipmap.dita))
        listKontak.add(Kontak("Ella", "087755237066", R.mipmap.ela))
        listKontak.add(Kontak("Fifi", "082329594322", R.mipmap.fifi))
        listKontak.add(Kontak("Fira", "082192318299", R.mipmap.fira))
        listKontak.add(Kontak("Leo", "081263333602", R.mipmap.leo))
        listKontak.add(Kontak("Windy", "085241046416", R.mipmap.windy))

        val rcyKontak = findViewById<RecyclerView>(R.id.rcykontak)
        rcyKontak.layoutManager = LinearLayoutManager(this)
        val adapter = KontakAdapter(listKontak, this)
        rcyKontak.adapter = adapter

        val nama = findViewById<TextView>(R.id.txtNama)

        rcyKontak.setOnClickListener{
            val i = Intent(this, SecondPageActivity::class.java)
            i.putExtra( "nama", nama.text.toString())
            startActivity(i)
        }

    }
}