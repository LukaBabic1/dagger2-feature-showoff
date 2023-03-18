package org.dagger2.injection;

import dagger.Component;
import org.dagger2.model.Car;
import org.dagger2.model.Engine;

import javax.inject.Singleton;

@Component
@Singleton
public interface MainComponent {

    Car car();

    Engine engine();
}
