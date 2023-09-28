package com.example.sportsnews.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.sportsnews.R
import com.example.sportsnews.model.SportNews


class NewsDetailFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewRoot = inflater.inflate(R.layout.fragment_news_detail, container, false)

        val sportNews = requireArguments().getParcelable<SportNews>("newsDetail")

        val titleTextView: TextView = viewRoot.findViewById(R.id.tv_title)
        val descriptionTextView: TextView = viewRoot.findViewById(R.id.tv_description)
        val dateTextView: TextView = viewRoot.findViewById(R.id.tv_date)

        if (sportNews!= null){
            titleTextView.text = sportNews.title
            descriptionTextView.text = sportNews.description
            dateTextView.text = sportNews.date
        }

        return viewRoot
    }
}