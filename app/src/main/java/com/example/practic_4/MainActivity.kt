package com.example.practic_4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private var size: Int = 20
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val redButton : Button = findViewById(R.id.redButton)
        val greenButton : Button = findViewById(R.id.greenButton)
        val blueButton : Button = findViewById(R.id.pinkButton)

        val upButton : Button = findViewById(R.id.size_up)
        val downButton : Button = findViewById(R.id.downButton)

        val textView : TextView = findViewById(R.id.textView)
        val rLayout : ConstraintLayout = findViewById(R.id.root_layout)

        redButton.setOnClickListener{
            textView.text = "Красный"
            rLayout.setBackgroundColor(resources.getColor(R.color.redColor, null))
        }
        greenButton.setOnClickListener {
            textView.text = "Зеленый"
            rLayout.setBackgroundColor(resources.getColor(R.color.greenColor, null))
        }
        blueButton.setOnClickListener {
            textView.text = "Розовый"
            rLayout.setBackgroundColor(resources.getColor(R.color.pinkColor, null))
        }

        upButton.setOnClickListener{
            size = size + 5
            textView.setTextSize(size.toFloat())
        }

        downButton.setOnClickListener{
            size = size - 5
            textView.setTextSize(size.toFloat())
        }

    }

}
