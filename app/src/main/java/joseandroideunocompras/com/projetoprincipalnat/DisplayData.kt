package joseandroideunocompras.com.projetoprincipalnat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_data)

        val nameTextView: TextView = findViewById(R.id.nameTextView)
        val name = intent.getStringExtra("name")
        nameTextView.text = name
    }
}