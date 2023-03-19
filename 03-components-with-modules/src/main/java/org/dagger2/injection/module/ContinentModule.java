package org.dagger2.injection.module;

import dagger.Module;
import dagger.Provides;
import org.dagger2.injection.scope.ContinentScope;
import org.dagger2.model.Continent;
import org.dagger2.model.Planet;

@Module
public final class ContinentModule {

    private final String name;

    public ContinentModule(final String name) {
        this.name = name;
    }

    @Provides
    @ContinentScope
    Continent provideContinent(final Planet planet) {
        return new Continent(planet);
    }
}