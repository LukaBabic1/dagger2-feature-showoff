package org.dagger2.injection;

import dagger.Component;
import org.dagger2.model.Continent;

@Component(
        dependencies = PlanetComponent.class
)
@ContinentScope
public interface ContinentComponent {

    Continent continent();
}


