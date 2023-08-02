package com.samra.landmarkbookkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridLayout
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.samra.landmarkbookkotlin.databinding.ActivityDetailsBinding
import com.samra.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        val view = binding.root
        setContentView(view);

        landmarkList = ArrayList<Landmark>()

        var pisa = Landmark("pisa" , "italy ", R.drawable.pisa)
        var colosseum = Landmark("colosseum" , "italy ", R.drawable.collesium)
        var eiffel = Landmark("eiffel" , "france ", R.drawable.eiffeltower)
        var londonBridge = Landmark("london bridge" , "uk ", R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)

        // rEecyler view
        var landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = landmarkAdapter

        // LIST VIEW
        /*
        //Adapter -  layout ve data ni bir birine bagliyir
        //Mapping transform edir
        var adapter = ArrayAdapter(this , android.R.layout.simple_list_item_1 ,landmarkList.map { landmark -> landmark.name })
        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(MainActivity@this , DetailsActivity::class.java)
            intent.putExtra("Landmark", landmarkList.get(i))
            startActivity(intent)
        }

         */


    }
}