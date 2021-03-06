package com.softdesign.headfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * Параметр view ссылается на объект, который вызывает этот метод.
    * Чтобы метод обрабатывался корректно при нажатии кнопки, он долже:
    * 1. Быть public
    * 2. Возвращать void
    * 3. Принимать View
    * */
    public void onClickFindBeer(View view) {
        // Get a reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);

        // Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);

        // Get the selected item in the spinner
        String beerType = String.valueOf(color.getSelectedItem());

        // Get the experts recommendation
        List<String> brandsList = expert.getBrands(beerType);

        // Cocat recommendation
        StringBuilder brandsFormatted = new StringBuilder();

        for( String brand : brandsList ) {
            brandsFormatted.append(brand).append('\n');
        }

        // Display the recommendation
        brands.setText(brandsFormatted);
    }
}
