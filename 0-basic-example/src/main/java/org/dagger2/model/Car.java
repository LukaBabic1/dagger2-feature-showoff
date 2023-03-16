package org.dagger2.model;

import javax.inject.Inject;

public final class Car {

    public final Engine engine;

    @Inject
    public Car(final Engine engine) {
        this.engine = engine;
    }
}
