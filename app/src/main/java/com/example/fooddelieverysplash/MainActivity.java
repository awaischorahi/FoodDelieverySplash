package com.example.fooddelieverysplash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView male,female;
    Animation animationMale,animationFemale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        male=findViewById(R.id.male);
        female=findViewById(R.id.female);


        animationMale=AnimationUtils.loadAnimation(this,R.anim.rightanim);
        animationFemale=AnimationUtils.loadAnimation(this,R.anim.leftanim);

        male.setAnimation(animationMale);
        female.setAnimation(animationFemale);

    }
}