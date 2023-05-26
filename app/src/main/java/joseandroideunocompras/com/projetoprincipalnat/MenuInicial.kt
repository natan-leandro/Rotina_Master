package joseandroideunocompras.com.projetoprincipalnat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MenuInicial : AppCompatActivity() {
    private lateinit var btAdicionarTarefa: Button
    private lateinit var Tarefas: TextView

    private val dataList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_inicial)

        btAdicionarTarefa = findViewById(R.id.btAdicionarTarefa)
        Tarefas = findViewById(R.id.Tarefas)

        btAdicionarTarefa.setOnClickListener {
            val intent = Intent(this, AddTarefa::class.java)
            startActivityForResult(intent, ADD_DATA_REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == ADD_DATA_REQUEST_CODE && resultCode == RESULT_OK) {
            val name = data?.getStringExtra("name")
            name?.let {
                dataList.add(it)
                updateTarefas()
            }
        }
    }
    private fun updateTarefas() {
        val dataText = dataList.joinToString("\n")
        Tarefas.text = dataText
    }
    companion object {
        private const val ADD_DATA_REQUEST_CODE = 5
    }
}

