package org.dagger2.injection.module;

import dagger.Module;
import dagger.Provides;
import org.dagger2.model.Country;

@Module
public abstract class CountryModule {

    @Provides
    static Country provideCountry() {
        return new Country();
    }
}
