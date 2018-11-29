package com.dev.surya.burgerrating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     RatingBar ratingBar;
     TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);

    }

    public void submit(View view) {
        float ratingValue = ratingBar.getRating();

        if(ratingValue == 0) {
            textView.setText("Please rate our service");
        } else if(ratingValue < 2  && ratingValue > 0){
            textView.setText("Rating: " + ratingValue + "\n We will try better next time") ;
        } else if(ratingValue <= 3 && ratingValue >= 2 ) {
            textView.setText("Rating: " + ratingValue + "\n We are constantly improving") ;
        }else if(ratingValue <= 4 && ratingValue >= 3 ) {
            textView.setText("Rating: " + ratingValue + "\n Thank you so much. Please visit us again") ;
        }else if(ratingValue <= 5 && ratingValue >= 4 ) {
            textView.setText("Rating: " + ratingValue + "\n That's so sweet of you. Please visit us again") ;
        }

    }
}
