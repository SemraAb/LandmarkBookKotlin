package com.samra.landmarkbookkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.samra.landmarkbookkotlin.databinding.RecyclerRowBinding

class LandmarkAdapter (val landmarkList: ArrayList<Landmark>) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {
    class LandmarkHolder (val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        // layout ile baglama hissesi viewbindingle
        // nece ki main activity de view bindingi qosanda edirdik , burda da row u burda qosuruq layouta
        var binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context
        ) , parent , false)
        return LandmarkHolder(binding)
    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.recyclerRowTextView.text = landmarkList.get(position).name

        holder.itemView.setOnClickListener{
            var intent = Intent(holder.itemView.context , DetailsActivity::class.java)
            intent.putExtra("landmark" ,landmarkList.get(position) )
            holder.itemView.context.startActivity(intent)
//            holder.binding.recyclerRowTextView.context.startActivity(intent)
        }
    }
}