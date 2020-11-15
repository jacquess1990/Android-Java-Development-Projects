package javathlete.example.weightlifter;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class ActivityFirst extends Activity implements DatePickerDialog.OnDateSetListener {

    private static final String TAG = "ActivityFirst";

    private Button buttonBirthDate;
    private TextView textViewBDOutPut;
    private TextView textViewTDOP;
    private Button buttonTestDate;
    private Button buttonQ;
    private int datePickerInput;


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Log.d(TAG, "onDateSet: in");
        String date = "month/day/year: " + dayOfMonth + " / " + (month + 1) + " / " + year;

        switch (datePickerInput) {
            case R.id.buttonBirthDate:
                textViewBDOutPut.setText(date);
                break;

            case R.id.buttonTestDate:
                textViewTDOP.setText(date);
                break;
        }
        Log.d(TAG, "onDateSet: out");
        }



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: in first activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        textViewBDOutPut = (TextView) findViewById(R.id.textViewBDOutPut);
        textViewTDOP = (TextView) findViewById(R.id.textViewTDOP);
        buttonBirthDate = (Button) findViewById(R.id.buttonBirthDate);
        buttonTestDate = (Button) findViewById(R.id.buttonTestDate);
        buttonQ = (Button) findViewById(R.id.buttonQ);
        textViewTDOP.setText("");
        textViewBDOutPut.setText("");

        buttonBirthDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: in");

                datePickerInput = view.getId();
                showBirthDatePickerDialog();
                //opens the dialog for birth date

                Log.d(TAG, "onClick: out");
            }
        });

        buttonTestDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePickerInput = view.getId();
                showTestDatePickerDialog();
                //opens the dialog for test date
            }
        });

    }

    private void showBirthDatePickerDialog() {
        DatePickerDialog birthdatePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
        );
        birthdatePickerDialog.show();


        buttonQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: in");

                Intent parqIntent = new Intent(ActivityFirst.this, ActivityThird.class);
                startActivity(parqIntent);
                // final button that brings user to the questionnaire

                Log.d(TAG, "onClick: out");
            }
        });
    }

    private void showTestDatePickerDialog() {
        DatePickerDialog testDatePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
        );
        testDatePickerDialog.show();


    }

    // differences between the dates is yet to be calculated and used as a condition
}