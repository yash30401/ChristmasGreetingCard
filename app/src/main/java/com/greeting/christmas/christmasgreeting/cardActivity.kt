package com.greeting.christmas.christmasgreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.greeting.christmas.christmasgreeting.databinding.ActivityCardBinding

class cardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var name=intent.getStringExtra("name")
        var card=intent.getStringExtra("card")


        binding.name.text="Merry Christmas\n"+name.toString()

        if(card=="santa"){

           binding.imageView.setBackgroundResource(R.drawable.santa)

        }else if(card=="poster"){

            binding.imageView.setBackgroundResource(R.drawable.poster)

        }else if(card=="tree"){

            binding.imageView.setBackgroundResource(R.drawable.tree)

        }else if(card=="deer"){

            binding.imageView.setBackgroundResource(R.drawable.deer)

        }

    }
}