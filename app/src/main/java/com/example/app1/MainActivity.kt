package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app1.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //injecter le fragment dans notre boite
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, HomeFragment())
        transaction.addToBackStack(null)
        transaction.commit()

    }
}