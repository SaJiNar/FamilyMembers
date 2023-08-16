package com.example.familymembers;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.SearchView;

public class MenuFamiliares extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menufamiliares);

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Configura el adaptador del RecyclerView (reemplaza MyAdapter con tu propio adaptador)
        adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);

        searchView = findViewById(R.id.txtsearch);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Maneja la búsqueda cuando se envía
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Maneja la búsqueda mientras se escribe
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main_hasnonameyet, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings_hasnonameyet) {
            // Maneja la acción de configuración
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
