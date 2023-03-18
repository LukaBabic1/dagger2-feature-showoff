package org.dagger2.model;

import org.dagger2.injection.ContinentScope;

import javax.inject.Inject;

@ContinentScope
public class Continent {

    public final Planet planet;

    @Inject
    public Continent(final Planet planet) {
        this.planet = planet;
    }
}
