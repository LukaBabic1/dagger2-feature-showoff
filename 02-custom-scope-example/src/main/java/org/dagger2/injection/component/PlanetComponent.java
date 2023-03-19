package org.dagger2.injection.component;

import dagger.Component;
import org.dagger2.model.Ocean;
import org.dagger2.model.Planet;

import javax.inject.Singleton;

@Component
@Singleton
public interface PlanetComponent {

    Planet planet();

    Ocean ocean();
}
