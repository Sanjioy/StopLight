package com.stingach.dm.stoplight

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val arr = listOf(
        R.id.button2, R.id.button3, R.id.button4, R.id.button3, R.id.button2
    )
    val colors = listOf(
        Color.RED, Color.YELLOW, Color.GREEN, Color.YELLOW, Color.RED
    )
    var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (j in 0..2) {
            val btn = findViewById<Button>(arr[j])
            btn.setBackgroundColor(Color.GRAY)
        }

        val ligthBtn = findViewById<Button>(R.id.button)
        ligthBtn.setOnClickListener {
            showDeleteDialog()
        }
    }

    private fun showDeleteDialog() {
        for (j in 0..2) {
            val btn = findViewById<Button>(arr[j])
            btn.setBackgroundColor(Color.GRAY)
        }
        val btn = findViewById<Button>(arr[i % 5])
        btn.setBackgroundColor(colors[i % 5])
        i++
    }
}
