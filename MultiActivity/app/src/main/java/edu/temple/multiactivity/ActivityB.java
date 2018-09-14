package edu.temple.multiactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class ActivityB extends Activity {

    Button buttonB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        setTitle("Activity B");
        buttonB = (Button)findViewById(R.id.buttonB);

        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentB = new Intent(ActivityB.this, ActivityA.class);
                startActivity(intentB);
            }
        };
        buttonB.setOnClickListener(ocl);

    }
}
