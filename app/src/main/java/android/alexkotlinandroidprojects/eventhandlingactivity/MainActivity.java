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
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.constraintLayout);
    }

    public void changeToGreen(View view) {
        constraintLayout.setBackgroundColor(Color.GREEN);
    }

    public void changeToBlue(View view) {
        constraintLayout.setBackgroundColor(Color.BLUE);
    }
}