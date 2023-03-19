package org.dagger2.model;

public final class Continent {

    public final Planet planet;
    public final String text;

    // We pass text to constructor which is defined when constructing module from which this object is provided, for testing purposes.
    public Continent(final Planet planet, final String text) {
        this.planet = planet;
        this.text = text;
    }
}
