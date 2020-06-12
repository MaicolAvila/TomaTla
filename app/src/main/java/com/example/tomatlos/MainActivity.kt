package com.example.tomatlos

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        try { Thread.sleep(2000)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this@MainActivity, "Bienvenidos a tomaTlas, con este juego te divertiras y emborracharas de una forma diferente", Toast.LENGTH_LONG).show()
        Toast.makeText(this@MainActivity, "El juego tiene 10 minijuegos, y seran asignados de forma aleatorea. ", Toast.LENGTH_LONG).show()
        Toast.makeText(this@MainActivity, "Cada persona tendra que dar PLAY en un orden que ustedes daran. ", Toast.LENGTH_LONG).show()
        //val button:Button = findViewById(R.id.play)
        val button:Button = findViewById(R.id.play)
        button.setOnClickListener(View.OnClickListener {
        changeNumber()
        })

    }
    private fun changeNumber(){
        val numberG:TextView = findViewById(R.id.number)
        var game:TextView =findViewById(R.id.game)
        val randomValues =   Random.nextInt(0, 9)
        numberG.setText("$randomValues")
        when (randomValues) {
            0 -> {game.setText("Pregunta")
            Toast.makeText(this@MainActivity, "Mira a los ojos a la persona que quieras y preguntale lo que quieras, pierde la persona que no conteste o no sepa que preguntar", Toast.LENGTH_SHORT).show()}
            1 -> {game.setText("Cultura Chupistica")
                Toast.makeText(this@MainActivity, "", Toast.LENGTH_SHORT).show()}
            2 -> {game.setText("Mi parte intima")
                Toast.makeText(this@MainActivity, "", Toast.LENGTH_SHORT).show()}
            3 -> {game.setText("Threeman")
                Toast.makeText(this@MainActivity, "", Toast.LENGTH_SHORT).show()}
            4 -> {game.setText("JOH")
                Toast.makeText(this@MainActivity, "", Toast.LENGTH_SHORT).show()}
            5 -> {game.setText("Yo nunca eh")
                Toast.makeText(this@MainActivity, "", Toast.LENGTH_SHORT).show()}
            6 -> {game.setText("Memoria")
                Toast.makeText(this@MainActivity, "", Toast.LENGTH_SHORT).show()}
            7 -> {game.setText("Numero")
                Toast.makeText(this@MainActivity, "", Toast.LENGTH_SHORT).show()}
            8-> {game.setText("Vikingo")
                Toast.makeText(this@MainActivity, " ", Toast.LENGTH_SHORT).show()}
            9 -> {game.setText("Silaba")
                Toast.makeText(this@MainActivity, "", Toast.LENGTH_SHORT).show()}

        }
    }
}