package com.xsm.module2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xsm.easy.annotation.Route;

@Route(path = "/module2/module2main")
public class Module2MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2_main);
    }
}
