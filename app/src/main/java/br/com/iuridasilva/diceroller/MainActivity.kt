package br.com.iuridasilva.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button);
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultado: TextView = findViewById(R.id.textView)
        resultado.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

/**
 * CODIGO QUE EXIBE MENSAGEM E ALTERA VALOR DO TEXT
val rollButton: Button = findViewById(R.id.button);
rollButton.setOnClickListener {
val toast = Toast.makeText(this, "Dado jogado!", Toast.LENGTH_SHORT)
toast.show()
val resultado: TextView = findViewById(R.id.textView)
resultado.text ="6"
}*/
