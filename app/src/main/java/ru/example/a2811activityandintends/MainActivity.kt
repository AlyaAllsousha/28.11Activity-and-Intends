package ru.example.a2811activityandintends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import ru.example.a2811activityandintends.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding  = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)
        binding.TV1.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivityForResult(intent, 123)
        }
    }
    val
}