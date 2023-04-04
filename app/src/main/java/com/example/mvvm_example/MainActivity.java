package com.example.mvvm_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.mvvm_example.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        viewModel.getUser().observe(this, user -> {
            binding.mainName.setText(user.name);
            binding.mainNumber.setText(user.memberNum);
        });

        binding.mainBtn.setOnClickListener(v ->
                viewModel.changeUser()
        );

        binding.setViewModel(viewModel);
    }
}