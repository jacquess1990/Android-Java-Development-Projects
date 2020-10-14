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
    private EditText editTextNumberSquatWeight;
    private EditText editTextNumberSquatReps;
    private Button weightLiftedSquat;
    private TextView textViewSquatOP;
    private EditText editTextNumberLyingBenchRow;
    private EditText editTextNumberLBRReps;
    private Button weightLiftedLBR;
    private TextView textViewLBROP;
    private EditText benchPressWeight;
    private EditText benchPressWeightReps;
    private Button weightLiftedBenchPress;
    private TextView textViewBPOP;

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

        editTextNumberSquatWeight = (EditText) findViewById(R.id.editTextNumberSquatWeight);
        editTextNumberSquatReps = (EditText) findViewById(R.id.editTextNumberSquatReps);
        weightLiftedSquat = (Button) findViewById(R.id.weightLiftedSquat);
        textViewSquatOP = (TextView) findViewById(R.id.textViewSquatOP);

        editTextNumberLyingBenchRow = (EditText) findViewById(R.id.editTextNumberLyingBenchRow);
        editTextNumberLBRReps = (EditText) findViewById(R.id.editTextNumberLBRReps);
        weightLiftedLBR = (Button) findViewById(R.id.weightLiftedLBR);
        textViewLBROP = (TextView) findViewById(R.id.textViewRmLBROP);

        benchPressWeight = (EditText) findViewById(R.id.benchPressWeight);
        benchPressWeightReps = (EditText) findViewById(R.id.benchPressWeightReps);
        weightLiftedBenchPress = (Button) findViewById(R.id.weightLiftedBenchPress);
        textViewBPOP = (TextView) findViewById(R.id.textViewBPOP);



        weightLifted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextViewParse();
            }
        });

        weightLiftedSquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextViewParseSquat();
            }
        });

        weightLiftedLBR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextViewParseLBR();
            }
        });

        weightLiftedBenchPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextViewParseBP();
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
        String firstEditValueSq = editTextNumberSquatWeight.getText().toString();
        String secondEditValueSq = editTextNumberSquatReps.getText().toString();
        double myFirstEditValueSq = Double.parseDouble(firstEditValueSq);
        double mySecondEditValueSq = Double.parseDouble(secondEditValueSq);
        double finalOutcomeSq = myFirstEditValueSq / (1.0278 - 0.0278 * mySecondEditValueSq);
        String finalOutcomeSquat = String.valueOf(finalOutcomeSq);
        textViewSquatOP.setText(finalOutcomeSquat);
    }

    public void editTextViewParseLBR () {
        String firstEditValueLBR = editTextNumberLyingBenchRow.getText().toString();
        String secondEditValueLBR = editTextNumberLBRReps.getText().toString();
        double myFirstEditValueLBR = Double.parseDouble(firstEditValueLBR);
        double mySecondEditValueLBR = Double.parseDouble(secondEditValueLBR);
        double finalOutcomeLBR = myFirstEditValueLBR / (1.0278 - 0.0278 * mySecondEditValueLBR);
        String finalOutcomeLyingBenchRow = String.valueOf(finalOutcomeLBR);
        textViewLBROP.setText(finalOutcomeLyingBenchRow);
    }

    public void editTextViewParseBP () {
        String firstEditValueBP = benchPressWeight.getText().toString();
        String secondEditValueBP = benchPressWeightReps.getText().toString();
        double myFirstEditValueBP = Double.parseDouble(firstEditValueBP);
        double mySecondEditValueBP = Double.parseDouble(secondEditValueBP);
        double finalOutcomeBP = myFirstEditValueBP / (1.0278 - 0.0278 * mySecondEditValueBP);
        String finalOutcomeBenchPress = String.valueOf(finalOutcomeBP);
        textViewBPOP.setText(finalOutcomeBenchPress);
    }

}
