package com.example.agrisphere.fragments.shopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.agrisphere.R
import com.example.agrisphere.adapters.HomeViewpagerAdapter
import com.example.agrisphere.databinding.FragmentHomeBinding
import com.example.agrisphere.fragments.categories.AnimalFeedsFragment
import com.example.agrisphere.fragments.categories.FarmEquipmentFragment
import com.example.agrisphere.fragments.categories.FertilizersFragment
import com.example.agrisphere.fragments.categories.MainCategory
import com.example.agrisphere.fragments.categories.PlantingSeedsFragment
import com.example.agrisphere.fragments.categories.VeterinarySuppliesFragment
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment: Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoriesFragment = arrayListOf<Fragment>(
            MainCategory(),
            FarmEquipmentFragment(),
            FertilizersFragment(),
            AnimalFeedsFragment(),
            PlantingSeedsFragment(),
            VeterinarySuppliesFragment(),

        )

        val viewPager2Adapter =
            HomeViewpagerAdapter(categoriesFragment, childFragmentManager, lifecycle)
        binding.viewpagerHome.adapter = viewPager2Adapter
        TabLayoutMediator(binding.tabLayout, binding.viewpagerHome) {tab, position ->
            when (position) {
                0 -> tab.text = "Home"
                1 -> tab.text = "Farm Equipment"
                2 -> tab.text = "Fertilizers"
                3 -> tab.text = "Animal Feeds"
                4 -> tab.text = "Planting Seeds"
                5 -> tab.text = "Veterinary Supplies"

            }
        }.attach()
    }
}