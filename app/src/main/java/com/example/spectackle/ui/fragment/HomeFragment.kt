package com.example.spectackle.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spectackle.R
import com.example.spectackle.adapter.HomeProductsAdapter
import com.example.spectackle.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    lateinit var recyclerView: RecyclerView

    private var imageList = ArrayList<Int>()
    private var nameList = ArrayList<String>()
    private var priceList = ArrayList<String>()
    private lateinit var adapter: HomeProductsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState) // Call super method

        // Initialize your lists

        imageList.add(R.drawable.asus)
        imageList.add(R.drawable.surface)
        imageList.add(R.drawable.macbook)



        nameList.add("Asus zephyrus")
        nameList.add("Surface pro")
        nameList.add("Macbook pro")




        priceList.add("Rs 2,00,000")
        priceList.add("Rs 2,50,000")
        priceList.add("Rs 3,50,000")



        adapter = HomeProductsAdapter(
            requireContext(),
            imageList,
            nameList,
            priceList
        )

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
//        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(),0)


    }
}