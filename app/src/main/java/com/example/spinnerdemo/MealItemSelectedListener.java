package com.example.spinnerdemo;

import android.widget.AdapterView;
import android.view.View;
import android.widget.Toast;

public class MealItemSelectedListener implements AdapterView.OnItemSelectedListener {

    private MainActivity mainActivity;

    @Override
    public void onItemSelected(AdapterView parent, View view, int pos, long id) {

        // load up second spinner
        String[] choices = {};

        String meal = parent.getItemAtPosition(pos).toString().toLowerCase();
        if (meal.equals("breakfast")) {
            choices = view.getResources().getStringArray(R.array.breakfast_array);
        }
        if (meal.equals("lunch")) {
            choices = view.getResources().getStringArray(R.array.lunch_array);
        }
        if (meal.equals("dinner")) {
            choices = view.getResources().getStringArray(R.array.dinner_array);
        }

        mainActivity.addItemsOnSpinner2(choices);

        Toast.makeText(parent.getContext(), "Selected Meal : " +
                parent.getItemAtPosition(pos).toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView parent) {

    }

    public void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

}
