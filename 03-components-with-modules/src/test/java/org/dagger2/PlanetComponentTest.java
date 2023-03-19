package org.dagger2;

import org.dagger2.injection.component.ContinentComponent;
import org.dagger2.injection.component.DaggerContinentComponent;
import org.dagger2.injection.component.DaggerPlanetComponent;
import org.dagger2.injection.component.PlanetComponent;
import org.dagger2.injection.module.ContinentModule;
import org.dagger2.model.Continent;
import org.dagger2.model.Ocean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public final class PlanetComponentTest {

    private PlanetComponent planetComponent;
    private ContinentComponent continentComponent;

    @BeforeEach
    void setUp() {

        planetComponent = DaggerPlanetComponent.builder()
                                               .build();

        continentComponent = DaggerContinentComponent.builder()
                                                     .planetComponent(planetComponent)
                                                     .continentModule(new ContinentModule("Module name"))
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
                                                                                       .continentModule(new ContinentModule("Continent module name"))
                                                                                       .build();

        // When
        final Continent newContinent = differentContinentComponent.continent();

        // Then
        Assertions.assertNotSame(continent, newContinent);
        Assertions.assertSame(continent.planet, newContinent.planet);
    }

    @Test
    void testShouldProvideOceanFromContinentComponent() {

        // Given
        final Ocean ocean = continentComponent.ocean();

        // When
        final Ocean anotherOcean = continentComponent.ocean();

        // Then
        // Even though ocean was provided from @Singleton annotated component, new instances of Ocean were provided each time.
        Assertions.assertNotSame(ocean, anotherOcean);
    }
}
