package com.example.socialsparks

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val exit = findViewById<Button>(R.id.button4)
        val enter = findViewById<Button>(R.id.button2)
        val reset = findViewById<Button>(R.id.button3)
        val output = findViewById<TextView>(R.id.textView)
        val inputLayout = findViewById<TextInputLayout>(R.id.textInputLayout)
        val inputText = findViewById<TextInputEditText>(R.id.editTextInput)


        reset.setOnClickListener {

            inputText?.setText("")
            output.setText("")
            inputLayout.error = null
        }

        enter.setOnClickListener {
            val userInput = inputText?.text.toString().trim().lowercase()

            if (userInput.isEmpty()) {
                Toast.makeText(this, "Please enter a time of day ", Toast.LENGTH_SHORT).show()
                output.text = ""
                return@setOnClickListener
            }

            if (userInput.any { it.isDigit() }) {
                Toast.makeText(this, "Numbers are not allowed ", Toast.LENGTH_SHORT).show()
                output.text = ""
                return@setOnClickListener
            }

            if (userInput == "morning") {
                output.text = "Send a 'Good morning' text to a family member."
                inputLayout.error = null

            } else if (userInput == "mid-morning") {
                output.text = "Reach out to a colleague with a quick 'Thank you.'"
                inputLayout.error = null

            } else if (userInput == "afternoon") {
                output.text = "Share a funny meme or interesting link with a friend."
                inputLayout.error = null

            } else if (userInput == "snack" || userInput == "afternoon snack" || userInput == "snack time") {
                output.text = "Send a quick 'thinking of you' message."
                inputLayout.error = null

            } else if (userInput == "dinner") {
                output.text = "Call a friend or relative for a 5-minute catch-up."
                inputLayout.error = null

            } else if (userInput == "night" || userInput == "after dinner") {
                output.text = "Leave a thoughtful comment on a friend's post."
                inputLayout.error = null

            } else {
                inputLayout.error = "Invalid input! Try Morning, Afternoon, Dinner..."
                output.text = ""
            }
        }

        exit.setOnClickListener {
            finishAffinity()
        }



    }
}