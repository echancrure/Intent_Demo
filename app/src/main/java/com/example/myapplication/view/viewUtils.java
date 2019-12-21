package com.example.myapplication.view;

import android.view.View;
import android.widget.Toast;

public class viewUtils {

    public static void displayUnimplementedToast(View v) {
        Toast toast = Toast.makeText(v.getContext(), "Not yet implemented", Toast.LENGTH_SHORT);
        toast.show();
    }
}
