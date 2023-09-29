package com.example.sportsnews.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sportsnews.R
import com.example.sportsnews.adapter.AdapterSportNews
import com.example.sportsnews.adapter.OnItemClickListener
import com.example.sportsnews.model.SportNews
import com.example.sportsnews.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class NewsListFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModel()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_news_list, container, false)



        val recyclerViewNews: RecyclerView = rootView.findViewById(R.id.rv_news_sports)
        recyclerViewNews.layoutManager = LinearLayoutManager(requireContext())

        //val newsAdapter = AdapterSportNews(viewModel.getListNews())
        val newsAdapter = AdapterSportNews(viewModel.getListNews(), object : OnItemClickListener {
            override fun onItemClick(sportNews: SportNews) {
                val action = NewsDetailFragmentDirections.actionGlobalNewsDetailFragment(sportNews)
                findNavController().navigate(action)
            }
        })
        recyclerViewNews.adapter = newsAdapter
        return rootView
    }
}