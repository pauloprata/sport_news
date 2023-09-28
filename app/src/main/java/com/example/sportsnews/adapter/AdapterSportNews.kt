package com.example.sportsnews.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sportsnews.R
import com.example.sportsnews.model.SportNews

class AdapterSportNews(
    private val newsList: List<SportNews>,
    private val itemClickListener: OnItemClickListener
) :
    RecyclerView.Adapter<AdapterSportNews.NewsViewHolder>() {
    inner class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.title)
        val descriptionTextView: TextView = itemView.findViewById(R.id.description)
        val dateTextView: TextView = itemView.findViewById(R.id.date)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news_adapter, parent, false)
        return NewsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = newsList[position]
        holder.titleTextView.text = news.title
        holder.descriptionTextView.text = news.description
        holder.dateTextView.text = news.date

        holder.itemView.setOnClickListener {
            itemClickListener.onItemClick(news)
        }
    }
}

interface OnItemClickListener {
    fun onItemClick(sportNews: SportNews)
}