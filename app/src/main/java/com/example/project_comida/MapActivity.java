package com.example.project_comida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.project_comida.databinding.ActivityMapBinding;
import com.example.project_comida.databinding.ActivityMenuBinding;

public class MapActivity extends AppCompatActivity {
    private ActivityMapBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMapBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}