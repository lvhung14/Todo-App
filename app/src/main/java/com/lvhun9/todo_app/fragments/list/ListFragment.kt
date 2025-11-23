package com.lvhun9.todo_app.fragments.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.lvhun9.todo_app.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.lvhun9.todo_app.databinding.FragmentListBinding

class ListFragment : Fragment() {
    lateinit var binding: FragmentListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(inflater)

        val fab = binding.floatingActionButton
        fab.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_addFragment)
        }

        binding.recyclerView.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_updateFragment)
        }
        return binding.root
    }
}
