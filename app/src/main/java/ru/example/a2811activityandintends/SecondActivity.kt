package ru.example.a2811activityandintends

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import ru.example.a2811activityandintends.databinding.SecondactivityBinding

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: SecondactivityBinding =
            DataBindingUtil.setContentView(this, R.layout.secondactivity)
        setContentView(binding.root)
        if (intent.hasExtra("Text"))
            binding.TV2.text = intent.getStringExtra("Text").toString()
        intent.getStringExtra("Text")
        binding.Return22.setOnClickListener{
            val intent = Intent()
            intent.putExtra("MyName", "Albina")
            setResult(0, intent)
            finish()
        }
        binding.Click2.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            launcher.launch(intent)

        }
    }
    val launcher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult(),
        ActivityResultCallback {
            if(it.resultCode == RESULT_OK){
                Toast.makeText(this, "You're back from 3 activity", Toast.LENGTH_SHORT).show()
            }
        }
    )
}