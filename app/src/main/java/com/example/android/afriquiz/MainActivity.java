package com.example.android.afriquiz;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {
        int Score = 0;
        //Conditional statement to check if the answer is correct, displays "Correct" if correct and
        //"Wrong" if wrong in each Question section

        if (checkQuestionOneAnswer()) {
            Score += 10;
            displayStatus(getString(R.string.correct), findViewById(R.id.question1Status));

        } else {
            displayStatus(getString(R.string.wrong), findViewById(R.id.question1Status));

        }

        if (checkQuestionTwoAnswer()) {
            Score += 10;
            displayStatus(getString(R.string.correct), findViewById(R.id.question2Status));

        } else {
            displayStatus(getString(R.string.wrong), findViewById(R.id.question2Status));

        }

        if (checkQuestionThreeAnswer()) {
            Score += 10;
            displayStatus(getString(R.string.correct), findViewById(R.id.question3Status));

        } else {
            displayStatus(getString(R.string.wrong), findViewById(R.id.question3Status));

        }

        if (checkQuestionFourAnswer()) {
            Score += 10;
            displayStatus(getString(R.string.correct), findViewById(R.id.question4Status));

        } else {
            displayStatus(getString(R.string.wrong), findViewById(R.id.question4Status));

        }

        if (checkQuestionFiveAnswer()) {
            Score += 10;
            displayStatus(getString(R.string.correct), findViewById(R.id.question5Status));

        } else {
            displayStatus(getString(R.string.wrong), findViewById(R.id.question5Status));

        }

        if (checkQuestionSixAnswer()) {
            Score += 10;
            displayStatus(getString(R.string.correct), findViewById(R.id.question6Status));

        } else {
            displayStatus(getString(R.string.wrong), findViewById(R.id.question6Status));

        }

        if (checkQuestionSevenAnswer()) {
            Score += 10;
            displayStatus(getString(R.string.correct), findViewById(R.id.question7Status));

        } else {
            displayStatus(getString(R.string.wrong), findViewById(R.id.question7Status));

        }

        if (checkQuestionEightAnswer()) {
            Score += 10;
            displayStatus(getString(R.string.correct), findViewById(R.id.question8Status));

        } else {
            displayStatus(getString(R.string.wrong), findViewById(R.id.question8Status));

        }

        if (checkQuestionNineAnswer()) {
            Score += 10;
            displayStatus(getString(R.string.correct), findViewById(R.id.question9Status));

        } else {
            displayStatus(getString(R.string.wrong), findViewById(R.id.question9Status));

        }

        if (checkQuestionTenAnswer()) {
            Score += 10;
            displayStatus(getString(R.string.correct), findViewById(R.id.question10Status));

        } else {
            displayStatus(getString(R.string.wrong), findViewById(R.id.question10Status));

        }


        if (Score >= 70) {

            String message = getString(R.string.goodResult1) + " " + Score;
            message += getString(R.string.goodResult2);
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            formatCorrectBorder(findViewById(R.id.submit_button_border));


        } else {
            String message = getString(R.string.badResult1) + " " + Score;
            message += getString(R.string.badResult2);
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            formatWrongBorder(findViewById(R.id.submit_button_border));
        }


    }


    private void displayStatus(String text, View statusID) {
        TextView statusTextView = (TextView) statusID;
        statusTextView.setText(text);
    }

    private void formatCorrectBorder(View viewID) {
        Resources res = getResources();
        Drawable shape = res.getDrawable(R.drawable.border_correct);

        LinearLayout tv = (LinearLayout) viewID;
        tv.setBackground(shape);
    }


    private void formatWrongBorder(View viewID) {
        Resources res = getResources();
        Drawable shape = res.getDrawable(R.drawable.border_wrong);

        LinearLayout tv = (LinearLayout) viewID;
        tv.setBackground(shape);
    }

    //  This part of the code are methods for each questions.
    //  The Methods return a boolean data type to check if answer enter are correct or wrong.
    //  Correct answers return true while wrong answers return false.

    /**
     * Question One answer, this returns a boolean data type.
     */

    private boolean checkQuestionOneAnswer() {
        EditText questionOneOption = findViewById(R.id.question1A);
        return getString(R.string.questionOneAnswer).equals(questionOneOption.getText().toString());
    }

    /**
     * Question Two answer, this returns a boolean data type.
     */

    private boolean checkQuestionTwoAnswer() {
        CheckBox questionTwoA = findViewById(R.id.question2A);
        CheckBox questionTwoB = findViewById(R.id.question2B);
        CheckBox questionTwoC = findViewById(R.id.question2C);
        CheckBox questionTwoD = findViewById(R.id.question2D);
        /*
         * Return Value checks if Check Box for Option A and D is Checked (Answer for Question Two)
         * and checks if Option C and D are "NOT" checked
         */
        return (questionTwoA.isChecked() && questionTwoD.isChecked()) && !(questionTwoC.isChecked() || questionTwoB.isChecked());

    }

    /**
     * Question Three answer, this returns a boolean data type.
     */
    private boolean checkQuestionThreeAnswer() {
        RadioButton questionThreeC = findViewById(R.id.question3C);
        /*
         * Return Value checks if the correct answer is Option C
         */
        return questionThreeC.isChecked();
    }

    /**
     * Question Four answer, this returns a boolean data type.
     */
    private boolean checkQuestionFourAnswer() {
        RadioButton questionFourA = findViewById(R.id.question4A);
        /*
         * Return Value checks if the correct answer is Option A
         */
        return questionFourA.isChecked();
    }

    /**
     * Question Five answer, this returns a boolean data type.
     */

    private boolean checkQuestionFiveAnswer() {
        CheckBox questionFiveA = findViewById(R.id.question5A);
        CheckBox questionFiveB = findViewById(R.id.question5B);
        CheckBox questionFiveC = findViewById(R.id.question5C);
        CheckBox questionFiveD = findViewById(R.id.question5D);
        /*
         * Return Value checks if Check Box for Option B 'and' C is Checked (Answer for Question Five)
         * 'and' checks if Option A 'or' D are "not' checked
         */
        return (questionFiveB.isChecked() && questionFiveC.isChecked()) && !(questionFiveA.isChecked() || questionFiveD.isChecked());

    }


    /**
     * Question Six answer, this returns a boolean data type.
     */
    private boolean checkQuestionSixAnswer() {
        RadioButton questionSixB = findViewById(R.id.question6B);
        /*
         * Return Value checks if the correct answer is Option B
         */
        return questionSixB.isChecked();
    }


    /**
     * Question Seven answer, this returns a boolean data type.
     */
    private boolean checkQuestionSevenAnswer() {
        RadioButton questionSevenD = findViewById(R.id.question7D);
        /*
         * Return Value checks if the correct answer is Option D
         */
        return questionSevenD.isChecked();
    }

    /**
     * Question Eight answer, this returns a boolean data type.
     */
    private boolean checkQuestionEightAnswer() {
        RadioButton questionEightB = findViewById(R.id.question8B);
        /*
         * Return Value checks if the correct answer is Option B
         */
        return questionEightB.isChecked();
    }

    /**
     * Question Nine answer, this returns a boolean data type.
     */

    private boolean checkQuestionNineAnswer() {
        EditText questionNineOption = findViewById(R.id.question9A);
        // The return value makes sure that user input is not case sensitive
        return getString(R.string.questionNineAnswer).equalsIgnoreCase(questionNineOption.getText().toString());
    }

    /**
     * Question Ten answer, this returns a boolean data type.
     */
    private boolean checkQuestionTenAnswer() {
        RadioButton questionTenC = findViewById(R.id.question10C);
        /*
         * Return Value checks if the correct answer is Option C
         */
        return questionTenC.isChecked();
    }

}
