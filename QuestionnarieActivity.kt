package com.example.rohith.itis

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_questionnarie.*

class QuestionnarieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionnarie)

        questionariebutton.setOnClickListener {
            val intent = Intent(this@QuestionnarieActivity,LocationActivity::class.java)
            startActivity(intent)
        }
    }
}
