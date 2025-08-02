package com.example.mytodomanager.View;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mytodomanager.Controller.TaskController;
import com.example.mytodomanager.R;
import com.example.mytodomanager.databinding.FragmentTaskListBinding;

public class TaskListFragment extends Fragment {

    private FragmentTaskListBinding binding;

    public TaskListFragment(){
        super(R.layout.fragment_task_list);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding = FragmentTaskListBinding.bind(view);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recyclerView.setAdapter(new TaskAdapter(TaskController.getInstance().getTasks()));
    }
}