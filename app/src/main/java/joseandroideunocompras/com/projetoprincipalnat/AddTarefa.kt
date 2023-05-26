package joseandroideunocompras.com.projetoprincipalnat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AddTarefa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_tarefa)

        val btSalvarTarefa: Button = findViewById(R.id.btSalvarTarefa)
        val addTarefaTexto: EditText = findViewById(R.id.addTarefaTexto)

        btSalvarTarefa.setOnClickListener {
            val name = addTarefaTexto.text.toString()

            val intent = Intent()
            intent.putExtra("name", name)

            setResult(RESULT_OK, intent)

            finish()
        }
        }
    }
