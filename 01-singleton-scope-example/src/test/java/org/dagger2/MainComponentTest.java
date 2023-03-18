package org.dagger2;

import org.dagger2.injection.DaggerMainComponent;
import org.dagger2.injection.MainComponent;
import org.dagger2.model.Car;
import org.dagger2.model.Engine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainComponentTest {

    private MainComponent mainComponent;

    @BeforeEach
    void setUp() {
        mainComponent = DaggerMainComponent.builder().build();
    }

    @Test
    void testShouldProvideInstanceOfSameCar() {

        // Given
        // First we obtain instance of first car
        final Car firstCar = mainComponent.car();

        // When
        // Then we obtain an instance once more.
        final Car secondCar = mainComponent.car();

        // Then
        // We expect same instances of the same car each time transitively same instance of engine
        Assertions.assertSame(firstCar, secondCar);
        Assertions.assertSame(firstCar.engine, secondCar.engine);
    }

    @Test
    void testShouldProvideNewInstanceOfEngine() {

        // Given
        // First we obtain instance of an engine
        final Engine firstEngine = mainComponent.engine();

        // When
        // Then we obtain an instance of another engine
        final Engine secondEngine = mainComponent.engine();

        // Then
        // We expect new instances of engine being provided by the component
        Assertions.assertNotSame(firstEngine, secondEngine);
    }
}
