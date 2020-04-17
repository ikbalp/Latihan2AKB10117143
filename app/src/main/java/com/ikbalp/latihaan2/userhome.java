package com.ikbalp.latihaan2;

/*
     Jumat, 17 April 2020
     Ikbal Padilah
     10117143 - IF4
*/



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class userhome extends AppCompatActivity {
    EditText editteks;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userhome);
        editteks = (EditText) findViewById(R.id.editText13);
        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        toolbar.setNavigationIcon(R.drawable.ic_side_menu);
        toolbar.setNavigationIcon(R.drawable.ic_side_menu);
        editteks.setFocusable(false);
    }
}
