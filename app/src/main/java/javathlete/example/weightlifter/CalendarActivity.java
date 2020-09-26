package javathlete.example.weightlifter;

import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CalendarActivity extends AppCompatActivity {

    private static final String TAG = "CalendarActivity";

    private CalendarView calendarView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender_view);

        calendarView = (CalendarView) findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                    String date = i + " / " + (i1+1) + " / " + i2;
                    Log.d(TAG, "onSelectedDayChange: date: " + date);
            }
        });
    }
}
