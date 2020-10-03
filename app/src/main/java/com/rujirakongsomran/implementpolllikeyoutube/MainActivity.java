package com.rujirakongsomran.implementpolllikeyoutube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.rujirakongsomran.implementpolllikeyoutube.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    double count1 = 1, count2 = 1, count3 = 1, count4 = 1;
    boolean flag1 = true, flag2 = true, flag3 = true, flag4 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.sb1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });

        binding.tvOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Check condition
                if (flag1) {
                    // When flag 1 is true
                    count1++;
                    count2 = 1;
                    count3 = 1;
                    count4 = 1;
                    flag1 = false;
                    flag2 = true;
                    flag3 = true;
                    flag4 = true;

                    // Calculate percentage
                    calculatePercent();
                }
            }
        });

        binding.sb2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });

        binding.tvOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Check condition
                if (flag2) {
                    // When flag 2 is true
                    count1 = 1;
                    count2++;
                    count3 = 1;
                    count4 = 1;
                    flag1 = true;
                    flag2 = false;
                    flag3 = true;
                    flag4 = true;

                    // Calculate percentage
                    calculatePercent();
                }
            }
        });

        binding.sb3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });

        binding.tvOption3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Check condition
                if (flag3) {
                    // When flag 3 is true
                    count1 = 1;
                    count2 = 1;
                    count3++;
                    count4 = 1;
                    flag1 = true;
                    flag2 = true;
                    flag3 = false;
                    flag4 = true;

                    // Calculate percentage
                    calculatePercent();
                }
            }
        });

        binding.sb4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });

        binding.tvOption4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Check condition
                if (flag4) {
                    // When flag 4 is true
                    count1 = 1;
                    count2 = 1;
                    count3 = 1;
                    count4++;
                    flag1 = true;
                    flag2 = true;
                    flag3 = true;
                    flag4 = false;

                    // Calculate percentage
                    calculatePercent();
                }
            }
        });

    }

    private void calculatePercent() {
        // Percent Total
        double total = count1 + count2 + count3 + count4;
        // Calculate percent for all options
        double percent1 = (count1 / total) * 100;
        double percent2 = (count2 / total) * 100;
        double percent3 = (count3 / total) * 100;
        double percent4 = (count4 / total) * 100;

        // Set Percent on text view
        binding.tvPercent1.setText(String.format("%.0f%%", percent1));
        // Set Progress on seek bar
        binding.sb1.setProgress((int) percent1);

        // Set Percent on text view
        binding.tvPercent2.setText(String.format("%.0f%%", percent2));
        // Set Progress on seek bar
        binding.sb2.setProgress((int) percent2);

        // Set Percent on text view
        binding.tvPercent3.setText(String.format("%.0f%%", percent3));
        // Set Progress on seek bar
        binding.sb3.setProgress((int) percent3);

        // Set Percent on text view
        binding.tvPercent4.setText(String.format("%.0f%%", percent4));
        // Set Progress on seek bar
        binding.sb4.setProgress((int) percent4);


    }
}