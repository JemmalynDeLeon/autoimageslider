package com.example.imageautoslide;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.slider.Slider

public class MainActivity extends AppCompatActivity {
    SlideView sliderView;
    int[] images = {R.drawable.mitsubishi,
        R.drawable.suzuki,
        R.drawable.toyota };

@Override
protected void onCreate(Bundle saveInstancesState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    sliderView = findViewById(R.id.image_slider);


    SliderAdapter sliderAdapter = new SliderAdapter(images);

    sliderView.setSliderAdapter(sliderAdapter);
    sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
    sliderView.setSliderTransformAnimation(SliderAdapter.DEPTHTRANSFORMATION);
    sliderView.setAutoCycle();


    }


}