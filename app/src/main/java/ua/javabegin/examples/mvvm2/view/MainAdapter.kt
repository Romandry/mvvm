package ua.javabegin.examples.mvvm2.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ua.javabegin.examples.mvvm2.MainViewHolder
import ua.javabegin.examples.mvvm2.databinding.AdapterEventBinding
import ua.javabegin.examples.mvvm2.model.SmoothResponse

class MainAdapter: RecyclerView.Adapter<MainViewHolder>() {

    var events = mutableListOf<SmoothResponse>()

    fun setEventList(events: List<SmoothResponse>) {
        this.events = events.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding = AdapterEventBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val event = events[position]
        holder.binding.name.text = "Reeettttteeeerrr"
//        holder.binding.name.text = event.foo.response.bar.get(1).name
//        holder.binding.name.text = event.name
//        Glide.with(holder.itemView.context).load(event.imageUrl).into(holder.binding.imageview)
    }

    override fun getItemCount(): Int {
        return events.size
    }
}