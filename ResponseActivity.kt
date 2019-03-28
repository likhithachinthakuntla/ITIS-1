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
            if(hotelsr1.isChecked())
            {
                intent.putExtra("hotels","r1")
            }
            else if(hotelsr2.isChecked())
            {
                intent.putExtra("hotels","r2")
            }
            else if(hotelsr3.isChecked())
            {
                intent.putExtra("hotels","r3")
            }
            else if(hotelsr4.isChecked())
            {
                intent.putExtra("hotels","r4")
            }
            selhotels.setOnClickListener{
                val intent = Intent(this@ResponseActivity,Map2Activity::class.java)
                startActivity(intent)
        }
        if(ss=="radio42")
        {
            setContentView(R.layout.parks)
            if(parksr1.isChecked())
            {
                intent.putExtra("parks","r1")
            }
            else if(parksr2.isChecked())
            {
                intent.putExtra("parks","r2")
            }
            else if(parksr3.isChecked())
            {
                intent.putExtra("parks","r3")
            }
            else if(parksr4.isChecked())
            {
                intent.putExtra("parks","r4")
            }
            selparks.setOnClickListener{
                val intent = Intent(this@ResponseActivity,Map2Activity::class.java)
                startActivity(intent)
        }
        if(ss=="radio43")
        {
            setContentView(R.layout.monuments)
            if(hmr1.isChecked())
            {
                intent.putExtra("hm","r1")
            }
            else if(hmr2.isChecked())
            {
                intent.putExtra("hm","r2")
            }
            else if(hmr3.isChecked())
            {
                intent.putExtra("hm","r3")
            }
            else if(hmr4.isChecked())
            {
                intent.putExtra("hm","r4")
            }
            selhm.setOnClickListener{
                val intent = Intent(this@ResponseActivity,Map2Activity::class.java)
                startActivity(intent)
        }
        if(ss=="radio44")
        {
            setContentView(R.layout.malls)
            if(mallr1.isChecked())
            {
                intent.putExtra("mall","r1")
            }
            else if(mallr2.isChecked())
            {
                intent.putExtra("mall","r2")
            }
            else if(mallr3.isChecked())
            {
                intent.putExtra("mall","r3")
            }
            else if(mallr4.isChecked())
            {
                intent.putExtra("mall","r4")
            }
            selmall.setOnClickListener{
                val intent = Intent(this@ResponseActivity,Map2Activity::class.java)
                startActivity(intent)
        }
        if(ss=="radio45")
        {
            setContentView(R.layout.others)
            if(otherr1.isChecked())
            {
                intent.putExtra("other","r1")
            }
            else if(otherr2.isChecked())
            {
                intent.putExtra("other","r2")
            }
            else if(otherr3.isChecked())
            {
                intent.putExtra("other","r3")
            }
            else if(otherr4.isChecked())
            {
                intent.putExtra("other","r4")
            }
            selother.setOnClickListener{
                val intent = Intent(this@ResponseActivity,Map2Activity::class.java)
                startActivity(intent)
        }
    }
}

