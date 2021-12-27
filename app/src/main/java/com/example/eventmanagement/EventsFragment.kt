package com.example.eventmanagement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.eventmanagement.databinding.FragmentEventsBinding


class EventsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:FragmentEventsBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_events, container, false)
         return binding.root
    }

}