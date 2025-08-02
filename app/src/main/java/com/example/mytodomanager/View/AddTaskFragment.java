package com.example.mytodomanager.View;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mytodomanager.R;
import com.example.mytodomanager.databinding.FragmentAddTaskBinding;



public class AddTaskFragment extends Fragment {

   private FragmentAddTaskBinding binding;

   public AddTaskFragment(){
       super(R.layout.fragment_add_task);
   }

   @Override
   public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
       binding = FragmentAddTaskBinding.bind(view);

       binding.buttonAddTask.setOnClickListener(v -> {
           String input = binding.taskTitle.getText().toString().trim();

//           if (!input.isEmpty()) {
//               Task task = new Task(input);
//               TaskController.getInstance().addTask(task);
//               Toast.makeText(getContext(), "Aufgabe gespeichert", Toast.LENGTH_SHORT).show();
//               binding.taskTitle.setText(""); // Eingabe zurücksetzen
//           } else {
//               Toast.makeText(getContext(), "Bitte Text eingeben", Toast.LENGTH_SHORT).show();
//           }
       });
   }
}