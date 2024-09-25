package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var nameEdit: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        nameEdit = findViewById(R.id.nameEditText)



        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            if (nameEdit.text.isEmpty()) {
                nameEdit.error = "Please enter name"
            } else {
                displayTextView.text = "Hello, ${nameEdit.text}"
            }


        }
    }
}