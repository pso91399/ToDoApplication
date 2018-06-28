package com.example.patriciaouyang.todoapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText etItemText;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        etItemText = (EditText) findViewById(R.id.etItemText);
        etItemText.setText(getIntent().getStringExtra(MainActivity.ITEM_TEXT));
        position = getIntent().getIntExtra(MainActivity.ITEM_POSITION, 0);
        getSupportActionBar().setTitle("Edit Item");

    }

    public void onSaveItem(View v) {
        Intent data = new Intent();
        data.putExtra(MainActivity.ITEM_TEXT, etItemText.getText().toString());
        data.putExtra(MainActivity.ITEM_POSITION, position);
        setResult(RESULT_OK, data);
        finish();
    }
}
