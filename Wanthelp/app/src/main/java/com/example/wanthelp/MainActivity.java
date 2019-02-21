package com.example.wanthelp;

import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import java.util.ArrayList;
import java.util.List;

import ru.maxfad.mysplashscreen.R;

public class MainActivity extends AppCompatActivity {

    private List<CategoryEntity> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        DataAdapter adapter = new DataAdapter(this, names);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);

        }
    }



    private void setInitialData(){

        names.add(new CategoryEntity("Дети", R.drawable.icon_kids));
        names.add(new CategoryEntity("Взрослые", R.drawable.invalid_name));
        names.add(new CategoryEntity("Животные", R.drawable.invalid_nameee));
        names.add(new CategoryEntity("Пожилые", R.drawable.invalid_namee));
        names.add(new CategoryEntity("Мероприятия", R.drawable.invalid_nameeee));
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}