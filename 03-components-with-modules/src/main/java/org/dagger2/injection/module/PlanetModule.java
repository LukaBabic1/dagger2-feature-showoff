package org.dagger2.injection.module;

import dagger.Module;
import dagger.Provides;
import org.dagger2.model.Planet;

import javax.inject.Singleton;

@Module
public class PlanetModule {

    @Provides
    @Singleton
    Planet providePlanet() {
        return new Planet();
    }
}
