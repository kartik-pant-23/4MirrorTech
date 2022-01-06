package com.example.mirrortech.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mirrortech.databinding.FragmentMonitorBinding

class MonitorFragment: Fragment() {

    private var binding: FragmentMonitorBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMonitorBinding.inflate(inflater, container, false)

        // TODO: Implement Monitor Fragment

        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}