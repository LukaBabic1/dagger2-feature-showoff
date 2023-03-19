package org.dagger2.injection.component;

import dagger.Component;
import org.dagger2.injection.scope.ContinentScope;
import org.dagger2.model.Continent;
import org.dagger2.model.Country;
import org.dagger2.model.Ocean;

@Component(
        dependencies = PlanetComponent.class
)
@ContinentScope
public interface ContinentComponent {

    Continent continent();

    Country country();

    Ocean ocean();
}


