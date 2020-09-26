package javathlete.example.weightlifter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button buttonNew;
    private Button buttonQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonNew = (Button) findViewById(R.id.buttonNew);
        Button buttonQ = (Button) findViewById(R.id.buttonQ);

        buttonNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent firsIntent = new Intent(MainActivity.this,ActivityFirst.class);
                startActivity(firsIntent);

                //opens the new Activity
            }
        });



    }
}