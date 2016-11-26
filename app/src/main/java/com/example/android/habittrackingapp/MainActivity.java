package com.example.android.habittrackingapp;

import android.content.ContentValues;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.habittrackingapp.data.HabitContract;
import com.example.android.habittrackingapp.data.HabitDbHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        HabitDbHelper db = new HabitDbHelper(this);

        ContentValues values = new ContentValues();
        values.put(HabitContract.HabitEntry.COLUMN_HABIT_NAME, "Laufen");
        values.put(HabitContract.HabitEntry.COLUMN_HABIT_PLACE, "Salzburg City");
        values.put(HabitContract.HabitEntry.COLUMN_HABIT_EXCITEMENT, 3);
        db.addHabit(values);

        db.getHabits(1);
    }
}
