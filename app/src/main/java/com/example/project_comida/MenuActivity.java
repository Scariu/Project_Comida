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
        listaMenu.add("Pizza");
        listaMenu.add("Porotos con riendas");
        listaMenu.add("Lentejas");
        listaMenu.add("Pan con queso");
        listaMenu.add("Leche con chocolate");
        listaMenu.add("Café cortado");
        listaMenu.add("Coca cola");
        listaMenu.add("Ensalada Cesar");
        listaMenu.add("Puré de calabacín");
        listaMenu.add("Tortilla de patatas");
        listaMenu.add("Albóndigas de pollo");
        listaMenu.add("Ensalada de tomate");
        listaMenu.add("Leche, pan con aceite y fruta");
        listaMenu.add("Lentejas vegetales");
        listaMenu.add("Croquetas de atún");
        listaMenu.add("Menestra de verduras");
        listaMenu.add("Sardinas al horno");
        listaMenu.add("Leche, pan con aceite y fruta");
        listaMenu.add("Macarrones con verduras");
        listaMenu.add("Pollo a la cerveza");
        listaMenu.add("Sopa juliana");
        listaMenu.add("Corvina al ajillo");
        listaMenu.add("Leche, pan con aceite y fruta");

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaMenu);
        binding.lista.setAdapter(adapter);
    }
}
