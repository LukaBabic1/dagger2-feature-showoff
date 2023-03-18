package org.dagger2.injection;

import dagger.Component;
import org.dagger2.model.Planet;

import javax.inject.Singleton;

@Component
@Singleton
public interface PlanetComponent {

    Planet planet();
}
