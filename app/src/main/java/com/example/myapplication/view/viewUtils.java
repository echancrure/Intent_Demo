package com.example.myapplication.view;

import android.view.View;
import android.widget.Toast;

public class viewUtils {

    /**
     * Displays an unimplemented toast message to the user
     * @param v
     */
    public static void displayUnimplementedToast(View v) {
        Toast toast = Toast.makeText(v.getContext(), "Class 14th December. Not yet implemented", Toast.LENGTH_SHORT);
        toast.show();
    }
}
