package com.rohfl.dependencyinjectionsample;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();

    void injection(MainActivity mainActivity);

}
