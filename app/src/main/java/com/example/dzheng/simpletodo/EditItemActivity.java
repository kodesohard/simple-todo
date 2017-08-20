package com.example.dzheng.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        String task = getIntent().getStringExtra("task");

        editText = (EditText) findViewById(R.id.editTaskText);
        editText.setText(task);
        editText.setSelection(editText.getText().length());
    }

    // called by the update button
    public void onSubmit(View v) {
        Intent responseData = new Intent();
        responseData.putExtra("editedTask", editText.getText().toString());
        setResult(200, responseData);
        finish(); // closes current activity and goes back to caller activity
    }

}
