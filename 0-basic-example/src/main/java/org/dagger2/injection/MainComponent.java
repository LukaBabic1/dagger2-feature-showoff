package org.dagger2.injection;

import dagger.Component;
import org.dagger2.model.Car;

@Component
public interface MainComponent {

    Car car();
}
