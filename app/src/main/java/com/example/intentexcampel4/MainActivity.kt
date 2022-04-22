package com.example.intentexcampel4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add("web")
        menu?.add("map")
        menu?.add("phone number")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var m_uri: Uri
        var m_intent: Intent = Intent()
        when (item?.toString()){
            "web" -> {
                m_uri =Uri.parse("https://ww.apress.com")
                m_intent= Intent(Intent.ACTION_VIEW, m_uri)
            }
            "map"->{
                m_uri = Uri.parse("geo:40.7113399,-74.0263469")
                //this vould have vorkedas velli
                //m-uri  = Uri.parse("https://maps.google.com/maps?q = 40.7113399, -74.0263469")
                m_intent = Intent(Intent.ACTION_VIEW, m_uri)
            }
            "phone number " ->{
                m_uri = Uri.parse("tel:6282288427105")
                m_intent = Intent(Intent.ACTION_DIAL, m_uri)
            }

        }
        startActivity(m_intent)
        return true
    }
}