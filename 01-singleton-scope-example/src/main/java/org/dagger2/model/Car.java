package org.dagger2.model;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public final class Car {

    public final Engine engine;

    @Inject
    public Car(final Engine engine) {
        this.engine = engine;
    }
}
