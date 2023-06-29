package com.example.project_comida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.project_comida.databinding.ActivityMainBinding;
import com.example.project_comida.databinding.ActivityMenuBinding;

public class MenuActivity extends AppCompatActivity {
    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
