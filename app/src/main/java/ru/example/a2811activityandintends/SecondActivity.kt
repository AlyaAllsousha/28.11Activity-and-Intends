package ru.example.a2811activityandintends

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import ru.example.a2811activityandintends.databinding.SecondactivityBinding

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: SecondactivityBinding = DataBindingUtil.setContentView(this, R.layout.secondactivity)
        setContentView(binding.root)
        binding.Click2.setOnClickListener{
            val intent = Intent()
            intent.putExtra("Myname", "Albina")
            setResult(0, intent)
            finish()
        }
    }
}