package com.example.project_comida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.project_comida.databinding.ActivityMainBinding;
import com.example.project_comida.databinding.ActivityMenuBinding;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {
    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initList();
    }

    private void initList() {
        List<String> listaMenu = new ArrayList<>();
        listaMenu.add("Papas fritas");
        listaMenu.add("Completo italiano");
        listaMenu.add("Churrasco italiano");
        listaMenu.add("Chacarero");
        listaMenu.add("Porotos con riendas");
        listaMenu.add("Lentejas");
        listaMenu.add("Pan con queso");
        listaMenu.add("Leche con chocolate");

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaMenu);
        binding.lista.setAdapter(adapter);
    }
}
