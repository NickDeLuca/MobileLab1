package edu.temple.multiactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class ActivityA extends Activity {

    Button buttonA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);

        setTitle("Activity A");

        buttonA = (Button)findViewById(R.id.buttonA);

        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentA = new Intent(ActivityA.this, ActivityB.class);
                startActivity(intentA);
            }
        };
        buttonA.setOnClickListener(ocl);



    }
}
