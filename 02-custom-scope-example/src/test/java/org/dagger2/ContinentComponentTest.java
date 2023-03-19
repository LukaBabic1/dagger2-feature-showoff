package org.dagger2;

import org.dagger2.injection.ContinentComponent;
import org.dagger2.injection.DaggerContinentComponent;
import org.dagger2.injection.DaggerPlanetComponent;
import org.dagger2.injection.PlanetComponent;
import org.dagger2.model.Continent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public final class ContinentComponentTest {

    private PlanetComponent planetComponent;
    private ContinentComponent continentComponent;

    @BeforeEach
    void setUp() {
        planetComponent = DaggerPlanetComponent.builder().build();
        continentComponent = DaggerContinentComponent.builder()
                                                     .planetComponent(planetComponent)
                                                     .build();
    }

    @Test
    void testShouldProvideSameInstanceOfPlanetFromSameContinentComponent() {

        // Given
        final Continent continent = continentComponent.continent();

        // When
        final Continent anotherContinent = continentComponent.continent();

        // Then
        Assertions.assertSame(continent, anotherContinent);
    }

    @Test
    void testShouldProvideDifferentContinentInstancesFromDifferentContinentComponents() {

        // Given
        final Continent continent = continentComponent.continent();
        final ContinentComponent differentContinentComponent = DaggerContinentComponent.builder()
                                                                                       .planetComponent(planetComponent)
                                                                                       .build();

        // When
        final Continent newContinent = differentContinentComponent.continent();

        // Then
        Assertions.assertNotSame(continent, newContinent);
        Assertions.assertSame(continent.planet, newContinent.planet);
    }
}

