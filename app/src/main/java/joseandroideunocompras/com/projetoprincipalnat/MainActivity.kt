package joseandroideunocompras.com.projetoprincipalnat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btcriarconta = findViewById<Button>(R.id.Criar_conta)

        btcriarconta.setOnClickListener {
            IrParaCriarConta()
        }
        val btesqueceusenha = findViewById<Button>(R.id.Esqueceu_Senha)
        btesqueceusenha.setOnClickListener {
            IrParaEsqueceuSenha()
        }
        val btlogin = findViewById<Button>(R.id.Login)
        btlogin.setOnClickListener {
            IrParaLogin()
        }
    }

    private fun IrParaCriarConta() {
        val MainActivity2 = Intent(this,MainActivity2::class.java)
        startActivity(MainActivity2)
    }
    private fun IrParaEsqueceuSenha() {
        val Esqueceu_Senha = Intent(this,Esqueceu_Senha::class.java)
        startActivity(Esqueceu_Senha)
    }
    private fun IrParaLogin() {
        val MenuInicial = Intent(this,MenuInicial::class.java)
        startActivity(MenuInicial)
    }
}
