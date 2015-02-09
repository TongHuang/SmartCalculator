package com.smart.smartcalculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by Shan on 2015-02-02.
 */
public class PracticeActivity extends ActionBarActivity {

    Practice practice = new Practice();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_practice);
       this.initializeTest();
    }

    private void initializeTest(){
        practice.generateTest();
        TextView textView = (TextView)this.findViewById(R.id.txtViewExpression);
        textView.setText(practice.getExpression());
        RadioButton radioButtonOne = (RadioButton) this.findViewById(R.id.radioButtonOne);
        radioButtonOne.setChecked(false);
        radioButtonOne.setText(String.valueOf(practice.getChoiceOne()));

        RadioButton radioButtonTwo = (RadioButton) this.findViewById(R.id.radioButtonTwo);
        radioButtonTwo.setChecked(false);
        radioButtonTwo.setText(String.valueOf(practice.getChoiceTwo()));

        RadioButton radioButtonThree = (RadioButton) this.findViewById(R.id.radioButtonThree);
        radioButtonThree.setChecked(false);
        radioButtonThree.setText(String.valueOf(practice.getChoiceThree()));

        RadioButton radioButtonFour = (RadioButton) this.findViewById(R.id.radioButtonFour);
        radioButtonFour.setChecked(false);
        radioButtonFour.setText(String.valueOf(practice.getChoiceFour()));

    }


    public void radioButtonOneClick(View view) {
        RadioButton button = (RadioButton) view;
        int choice = Integer.valueOf(button.getText().toString());
        if (practice.getAnswer() == choice) {
            button.setBackgroundColor(getResources().getColor(R.color.practice_right));
        } else {
            button.setBackgroundColor(getResources().getColor(R.color.practice_wrong));
            this.markRightChoice();
        }
    }

    public void radioButtonTwoClick(View view) {
        RadioButton button = (RadioButton) view;
        int choice = Integer.valueOf(button.getText().toString());
        if (practice.getAnswer() == choice) {
            button.setBackgroundColor(getResources().getColor(R.color.practice_right));
        } else {
            button.setBackgroundColor(getResources().getColor(R.color.practice_wrong));
            this.markRightChoice();
        }
    }

    public void radioButtonThreeClick(View view) {
        RadioButton button = (RadioButton) view;
        int choice = Integer.valueOf(button.getText().toString());
        if (practice.getAnswer() == choice) {
            button.setBackgroundColor(getResources().getColor(R.color.practice_right));
        } else {
            button.setBackgroundColor(getResources().getColor(R.color.practice_wrong));
            this.markRightChoice();
        }
    }

    public void radioButtonFourClick(View view) {
        RadioButton button = (RadioButton) view;
        int choice = Integer.valueOf(button.getText().toString());
        if (practice.getAnswer() == choice) {
            button.setBackgroundColor(getResources().getColor(R.color.practice_right));
        } else {
            button.setBackgroundColor(getResources().getColor(R.color.practice_wrong));
            this.markRightChoice();
        }
    }


    public void btnNextClick(View view) {
        RadioButton button = (RadioButton) this.findViewById(R.id.radioButtonOne);
        button.setBackgroundColor(getResources().getColor(R.color.practice_normal));
        button = (RadioButton) this.findViewById(R.id.radioButtonTwo);
        button.setBackgroundColor(getResources().getColor(R.color.practice_normal));
        button = (RadioButton) this.findViewById(R.id.radioButtonThree);
        button.setBackgroundColor(getResources().getColor(R.color.practice_normal));
        button = (RadioButton) this.findViewById(R.id.radioButtonFour);
        button.setBackgroundColor(getResources().getColor(R.color.practice_normal));
        this.initializeTest();

    }

    private void markRightChoice() {
        RadioButton button = (RadioButton) this.findViewById(R.id.radioButtonOne);
        int choice = Integer.valueOf(button.getText().toString());
        if (practice.getAnswer() == choice) {
            button.setBackgroundColor(getResources().getColor(R.color.practice_right));
            return;
        }
        button = (RadioButton) this.findViewById(R.id.radioButtonTwo);
        choice = Integer.valueOf(button.getText().toString());
        if (practice.getAnswer() == choice) {
            button.setBackgroundColor(getResources().getColor(R.color.practice_right));
            return;
        }
        button = (RadioButton) this.findViewById(R.id.radioButtonThree);
        choice = Integer.valueOf(button.getText().toString());
        if (practice.getAnswer() == choice) {
            button.setBackgroundColor(getResources().getColor(R.color.practice_right));
            return;
        }
        button = (RadioButton) this.findViewById(R.id.radioButtonFour);
        choice = Integer.valueOf(button.getText().toString());
        if (practice.getAnswer() == choice) {
            button.setBackgroundColor(getResources().getColor(R.color.practice_right));
            return;
        }

    }
}
