package com.samra.landmarkbookkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.samra.landmarkbookkotlin.databinding.ActivityDetailsBinding

@Suppress("DEPRECATION")
class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater);
        val view = binding.root
        setContentView(view);

        var intent = intent
        var selectedLandmark =  intent.getSerializableExtra("landmark") as Landmark

        binding.nameText.text = selectedLandmark.name
        binding.countryText.text = selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)
    }
}