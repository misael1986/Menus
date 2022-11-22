package com.example.menus

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add -> {
               val count = findViewById<TextView>(R.id.textView)
                count.text="Add was clicked"
                return true
            }
            R.id.reset -> {
                val count = findViewById<TextView>(R.id.textView)
                count.text="Reset was clicked"
                return true
            }
            R.id.about -> {
                Toast.makeText(this, "About this APP...", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.exit -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}