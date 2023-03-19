package org.dagger2.model;

import org.dagger2.injection.scope.ContinentScope;

import javax.inject.Inject;

@ContinentScope
public final class Continent {

    public final Planet planet;

    @Inject
    public Continent(final Planet planet) {
        this.planet = planet;
    }
}
