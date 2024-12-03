package ru.example.a2811activityandintends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.databinding.DataBindingUtil
import ru.example.a2811activityandintends.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding  = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)
        binding.TV1.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java).apply {
                putExtra("Text", "aaaa")
            }
            launcher.launch(intent)
        }
        binding.Return1.setOnClickListener {
            finish()
        }
    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode==123 && resultCode==0){
//            val string = data?.getStringExtra("MyName")
//            Toast.makeText(this, string, Toast.LENGTH_SHORT).show()
//        }
//    }

    val launcher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult(),
        ActivityResultCallback {
            if (it.resultCode==0){
                val string = it.data?.getStringExtra("MyName")
                Toast.makeText(this, string, Toast.LENGTH_SHORT).show()
            }
        }
    )
}