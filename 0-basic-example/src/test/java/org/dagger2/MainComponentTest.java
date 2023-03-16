package org.dagger2;

import org.dagger2.injection.DaggerMainComponent;
import org.dagger2.injection.MainComponent;
import org.dagger2.model.Car;
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
    void testShouldProvideInjectableBeanFromComponent() {

        // Given
        // No prerequisites

        // When
        final Car car = mainComponent.car();

        // Then
        Assertions.assertNotNull(car);
        Assertions.assertNotNull(car.engine);
    }

    @Test
    void testShouldEachTimeProvideNewInstanceOfCar() {

        // Given
        // First we obtain instance of first car
        final Car firstCar = mainComponent.car();

        // When
        // Then we obtain an instance of another car
        final Car secondCar = mainComponent.car();

        // Then
        // We expect new instances of the same car each time
        Assertions.assertNotSame(firstCar, secondCar);
        Assertions.assertNotSame(firstCar.engine, secondCar.engine);
    }
}
