package com.rohfl.dependencyinjectionsample;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private final String TAG = "CAR";

    private Engine engine;
    private Wheel wheel;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void driving() {
        Log.d(TAG, "VROOM VROOM");
    }

}
