package org.dagger2.injection.component;

import dagger.Component;
import org.dagger2.injection.module.OceanModule;
import org.dagger2.injection.module.PlanetModule;
import org.dagger2.model.Ocean;
import org.dagger2.model.Planet;

import javax.inject.Singleton;

@Singleton
@Component(
        modules = {
                OceanModule.class,
                PlanetModule.class
        }
)
public interface PlanetComponent {

    Planet planet();

    Ocean ocean();
}

