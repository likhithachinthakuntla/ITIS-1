package com.example.rohith.itis

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.content_response.*

class ResponseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ss:String = intent.getStringExtra("Select")
        if(ss=="radio41")
        {
            setContentView(R.layout.activity_response)
            if(restr1.isChecked())
            {
                intent.putExtra("rest","r1")
            }
            else if(restr2.isChecked())
            {
                intent.putExtra("rest","r2")
            }
            else if(restr3.isChecked())
            {
                intent.putExtra("rest","r3")
            }
            else if(restr4.isChecked())
            {
                intent.putExtra("rest","r4")
            }
            selrest.setOnClickListener{
                val intent = Intent(this@ResponseActivity,Map2Activity::class.java)
                startActivity(intent)
            }
        }
        if(ss=="radio46")
        {
            setContentView(R.layout.hotels)
        }
        if(ss=="radio42")
        {
            setContentView(R.layout.parks)
        }
        if(ss=="radio43")
        {
            setContentView(R.layout.monuments)
        }
        if(ss=="radio44")
        {
            setContentView(R.layout.malls)
        }
        if(ss=="radio45")
        {
            setContentView(R.layout.others)
        }
    }
}

