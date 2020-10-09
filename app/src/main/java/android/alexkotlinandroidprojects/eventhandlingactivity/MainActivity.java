package android.alexkotlinandroidprojects.eventhandlingactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.constraintLayout);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        // VVV You can just use 'this' for these functions, as well, but this notation
        // avoids confusion as to what 'this' is referring to! VVV
        button1.setOnClickListener(MainActivity.this);
        button2.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.button1:
                Log.i(TAG, "Color changed to GREEN");
                constraintLayout.setBackgroundColor(Color.GREEN);
                break;

            case R.id.button2:
                Log.i(TAG, "Color changed to BLUE");
                constraintLayout.setBackgroundColor(Color.BLUE);
                break;
        }
    }
}