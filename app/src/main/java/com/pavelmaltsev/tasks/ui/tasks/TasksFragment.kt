package com.pavelmaltsev.tasks.ui.tasks

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.pavelmaltsev.tasks.R
import com.pavelmaltsev.tasks.databinding.FragmentNewTaskBinding
import com.pavelmaltsev.tasks.databinding.FragmentTasksBinding


class TasksFragment : Fragment() {

    private var _binding: FragmentTasksBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTasksBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tasksFab.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_tasksFragment_to_newTaskFragment)
        }
    }

}