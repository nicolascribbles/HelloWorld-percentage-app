package com.example.helloworld;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView totalTextView;
    EditText percentInput;
    EditText wholeNumberInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Declaring the inputs and values
        totalTextView = (TextView) findViewById(R.id.totalTextView);
        percentInput = (EditText) findViewById(R.id.percentInput);
        wholeNumberInput = (EditText) findViewById(R.id.wholeNumberInput);

        Button calc = (Button) findViewById(R.id.calc);
        Button clear = (Button) findViewById(R.id.clear);

        calc.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float percentage = Float.parseFloat(percentInput.getText().toString());
                float dec = percentage / 100;
                float total = dec * Float.parseFloat(wholeNumberInput.getText().toString());
                totalTextView.setText(Float.toString(total));


            }
        }));

        clear.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer zero = 0;
                totalTextView.setText(Integer.toString(zero));
                percentInput.setText("");
                wholeNumberInput.setText("");

            }
        }));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }






    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }







}
