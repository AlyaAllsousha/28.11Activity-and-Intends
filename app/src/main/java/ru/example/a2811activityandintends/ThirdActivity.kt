package ru.example.a2811activityandintends

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import ru.example.a2811activityandintends.databinding.ThirdactivityBinding

class ThirdActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ThirdactivityBinding = DataBindingUtil.setContentView(this, R.layout.thirdactivity)
        setContentView(binding.root)
        binding.Btn3.setOnClickListener{
            val intent = Intent()
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}