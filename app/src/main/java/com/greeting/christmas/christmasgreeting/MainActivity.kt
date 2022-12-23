package com.greeting.christmas.christmasgreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.greeting.christmas.christmasgreeting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.santa.setOnClickListener {

            if(binding.name.text.isNullOrEmpty()){
                Toast.makeText(applicationContext, "Please Type Name ", Toast.LENGTH_SHORT).show()
            }else{
                var name=binding.name.text.toString()

                val intent=Intent(this,cardActivity::class.java)
                intent.putExtra("santa",R.drawable.santa)
                intent.putExtra("name",name)
                startActivity(intent)
            }

        }

    }
}