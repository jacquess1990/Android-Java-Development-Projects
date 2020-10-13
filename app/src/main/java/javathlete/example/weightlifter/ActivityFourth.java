package javathlete.example.weightlifter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityFourth extends AppCompatActivity {

    private TextView testingTitle;
    private ImageView imageDeadLift;
    private Button weightLifted;
    private EditText editTextLiftedWeight;
    private EditText editNumberReps;
    private TextView RmOP;

    public static final String TAG = "Fourth started";

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        setContentView(R.layout.activity_fourth);
        super.onCreate(savedInstanceState);


        testingTitle = (TextView) findViewById(R.id.testingTitle);
        imageDeadLift = (ImageView) findViewById(R.id.imageDeadLift);
        weightLifted = (Button) findViewById(R.id.buttonDLWeight);

        editTextLiftedWeight = (EditText) findViewById(R.id.editTextLiftedWeight);
        editNumberReps = (EditText) findViewById(R.id.editNumberReps);
        RmOP = (TextView) findViewById(R.id.textViewRmOP);

        weightLifted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextViewParse();
            }
        });


        }

        public void editTextViewParse () {
        String firstEditValue = editTextLiftedWeight.getText().toString();
        String secondEditValue = editNumberReps.getText().toString();
        double myFirstEditValue = Double.parseDouble(firstEditValue);
        double mySecondEditValue = Double.parseDouble(secondEditValue);
        double finalOutcome = myFirstEditValue / (1.0278 - 0.0278 * mySecondEditValue);
        String finalOutcome1 = String.valueOf(finalOutcome);
        RmOP.setText(finalOutcome1);
    }

    public void editTextViewParseSquat  () {
        String firstEditValue = editTextLiftedWeight.getText().toString();
        String secondEditValue = editNumberReps.getText().toString();
        double myFirstEditValue = Double.parseDouble(firstEditValue);
        double mySecondEditValue = Double.parseDouble(secondEditValue);
        double finalOutcome = myFirstEditValue / (1.0278 - 0.0278 * mySecondEditValue);
        String finalOutcome1 = String.valueOf(finalOutcome);
        RmOP.setText(finalOutcome1);
    }

}
