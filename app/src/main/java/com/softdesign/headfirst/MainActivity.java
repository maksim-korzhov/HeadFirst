package com.softdesign.headfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

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

    }
}
