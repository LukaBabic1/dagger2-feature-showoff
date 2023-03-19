package org.dagger2.injection.component;

import dagger.Component;
import org.dagger2.injection.module.ContinentModule;
import org.dagger2.injection.module.CountryModule;
import org.dagger2.injection.scope.ContinentScope;
import org.dagger2.model.Continent;
import org.dagger2.model.Ocean;

@Component(
        dependencies = {
                PlanetComponent.class
        },
        modules = {
                ContinentModule.class,
                CountryModule.class
        }
)
@ContinentScope
public interface ContinentComponent {

    Continent continent();

    Ocean ocean();
}
