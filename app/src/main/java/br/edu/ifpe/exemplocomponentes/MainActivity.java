package br.edu.ifpe.exemplocomponentes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setComponentes();
    }

    private void setComponentes() {
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getListaComponentes());

        ListView componentes = findViewById(R.id.componentes);
        componentes.setAdapter(adapter);

        componentes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, TextViewActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, ImageViewActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, SwitchActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, ButtonActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, ProgressBarActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(MainActivity.this, SeekBarActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(MainActivity.this, RatingBarActivity.class));
                        break;
                }
            }
        });
    }

    private List<String> getListaComponentes() {
        List<String> nomes = new ArrayList<>();

        nomes.add("TextView");
        nomes.add("ImageView");
        nomes.add("Switch");
        nomes.add("Button");
        nomes.add("ProgressBar");
        nomes.add("SeekBar");
        nomes.add("RatingBar");

        return nomes;
    }
}
