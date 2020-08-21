package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    final int POINTS_FOR_FREE_THROW = 1;
    final int POINTS_FOR_TWO = 2;
    final int POINTS_FOR_THREE = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


    public void addThreeForTeamA(View view){
        scoreTeamA += POINTS_FOR_THREE;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view){
        scoreTeamA += POINTS_FOR_TWO;
        displayForTeamA(scoreTeamA);
    }
    public void addOneForTeamA(View view){
        scoreTeamA += POINTS_FOR_FREE_THROW;
        displayForTeamA(scoreTeamA);
    }


    public void addThreeForTeamB(View view){
        scoreTeamB += POINTS_FOR_THREE;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view){
        scoreTeamB += POINTS_FOR_TWO;
        displayForTeamB(scoreTeamB);
    }
    public void addOneForTeamB(View view){
        scoreTeamB += POINTS_FOR_FREE_THROW;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}