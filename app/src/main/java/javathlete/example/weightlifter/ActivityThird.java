package javathlete.example.weightlifter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ActivityThird extends Activity {

    private static final String TAG = "ActivityThird";

    private ToggleButton toggleButtonSt1;
    private ToggleButton toggleButtonSt2;
    private ToggleButton toggleButtonSt3;
    private ToggleButton toggleButtonSt4;
    private ToggleButton toggleButtonSt5;
    private ToggleButton toggleButtonSt6;
    private ToggleButton toggleButtonSt7;
    private Button buttonTest;
    private TextView textViewMedical;
    private CheckBox checkBoxMedical;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        toggleButtonSt1 = (ToggleButton) findViewById(R.id.toggleButtonSt1);
        toggleButtonSt2 = (ToggleButton) findViewById(R.id.toggleButtonSt2);
        toggleButtonSt3 = (ToggleButton) findViewById(R.id.toggleButtonSt3);
        toggleButtonSt4 = (ToggleButton) findViewById(R.id.toggleButtonSt4);
        toggleButtonSt5 = (ToggleButton) findViewById(R.id.toggleButtonSt5);
        toggleButtonSt6 = (ToggleButton) findViewById(R.id.toggleButtonSt6);
        toggleButtonSt7 = (ToggleButton) findViewById(R.id.toggleButtonSt7);

        buttonTest = (Button) findViewById(R.id.buttonTest);

        textViewMedical = (TextView) findViewById(R.id.textViewMedical);
        checkBoxMedical = (CheckBox) findViewById(R.id.checkBoxMedical);

        toggleButtonSt1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                Log.d(TAG, "onCheckedChanged: in");
                if (isChecked) {
                    textViewMedical.setVisibility(View.VISIBLE);
                    checkBoxMedical.setVisibility(View.VISIBLE);
                } else {
                    textViewMedical.setVisibility(View.INVISIBLE);
                    checkBoxMedical.setVisibility(View.INVISIBLE);
                }

                Log.d(TAG, "onCheckedChanged: out");
            }
            // each button presents condition for textView and checkBox
        });

        toggleButtonSt2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    textViewMedical.setVisibility(View.VISIBLE);
                    checkBoxMedical.setVisibility(View.VISIBLE);
                } else {
                    textViewMedical.setVisibility(View.INVISIBLE);
                    checkBoxMedical.setVisibility(View.INVISIBLE);
                }
            }
        });

        toggleButtonSt3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    textViewMedical.setVisibility(View.VISIBLE);
                    checkBoxMedical.setVisibility(View.VISIBLE);
                } else {
                    textViewMedical.setVisibility(View.INVISIBLE);
                    checkBoxMedical.setVisibility(View.INVISIBLE);
                }
            }
        });

        toggleButtonSt4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    textViewMedical.setVisibility(View.VISIBLE);
                    checkBoxMedical.setVisibility(View.VISIBLE);
                } else {
                    textViewMedical.setVisibility(View.INVISIBLE);
                    checkBoxMedical.setVisibility(View.INVISIBLE);
                }
            }
        });

        toggleButtonSt5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    textViewMedical.setVisibility(View.VISIBLE);
                    checkBoxMedical.setVisibility(View.VISIBLE);
                } else {
                    textViewMedical.setVisibility(View.INVISIBLE);
                    checkBoxMedical.setVisibility(View.INVISIBLE);
                }
            }
        });

        toggleButtonSt6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    textViewMedical.setVisibility(View.VISIBLE);
                    checkBoxMedical.setVisibility(View.VISIBLE);
                } else {
                    textViewMedical.setVisibility(View.INVISIBLE);
                    checkBoxMedical.setVisibility(View.INVISIBLE);
                }
            }
        });

        toggleButtonSt7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    textViewMedical.setVisibility(View.VISIBLE);
                    checkBoxMedical.setVisibility(View.VISIBLE);
                } else {
                    textViewMedical.setVisibility(View.INVISIBLE);
                    checkBoxMedical.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkBoxMedical.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                Log.d(TAG, "onCheckedChanged: in");
                if (isChecked) {
                    buttonTest.setVisibility(View.VISIBLE);
                } else {
                    buttonTest.setVisibility(View.INVISIBLE);
                }

                Log.d(TAG, "onCheckedChanged: out");
            }
            // if all conditions are satisfied, the participant can get tested
        });

        buttonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent testingIntent = new Intent(ActivityThird.this,ActivityFourth.class);
                startActivity(testingIntent);
            }
        });
    }
}


