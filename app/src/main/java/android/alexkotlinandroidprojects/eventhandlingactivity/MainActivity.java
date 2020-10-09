package android.alexkotlinandroidprojects.eventhandlingactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        // 'new View.OnClickListener()' does NOT create a new instance of 'View.OnClickListener()'
        // because 'View.OnClickListener()' is an INTERFACE
        // So, what it DOES do is create a new object that IMPLEMENTS
        // the 'View.OnClickListener()' interface
        assert button1 != null;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constraintLayout.setBackgroundColor(Color.GREEN);
            }
        });

        assert button2 != null;
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constraintLayout.setBackgroundColor(Color.BLUE);
            }
        });
    }
}