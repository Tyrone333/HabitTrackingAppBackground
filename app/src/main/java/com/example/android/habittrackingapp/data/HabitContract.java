package com.example.android.habittrackingapp.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by tyrone3 on 26.11.16.
 */

public final class HabitContract {

    private HabitContract() {
    }


    public static final String CONTENT_AUTHORITY = "com.example.android.habittrackingapp";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_HABITS = "habits";

    public static final class HabitEntry implements BaseColumns {


        public final static String TABLE_NAME = "habits";


        public final static String _ID = BaseColumns._ID;


        public final static String COLUMN_HABIT_NAME = "name";


        public final static String COLUMN_HABIT_PLACE = "place";


        public final static String COLUMN_HABIT_EXCITEMENT = "excitement";


        public static final String KEY_TIMESTAMP = "timestampColumn";


    }
}
