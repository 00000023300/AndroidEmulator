package com.example.androidemulator;

import android.animation.TypeEvaluator;

public class TranslateXEvaluator implements TypeEvaluator<Integer> {
    @Override
    public Integer evaluate(float fraction, Integer startValue, Integer endValue) {
        int value = startValue +(int)(fraction*(endValue - startValue));
        return value;
    }
}
