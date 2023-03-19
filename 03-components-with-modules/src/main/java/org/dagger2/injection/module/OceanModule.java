package org.dagger2.injection.module;

import dagger.Module;
import dagger.Provides;
import org.dagger2.model.Ocean;

@Module
public class OceanModule {

    @Provides
    Ocean provideOcean() {
        return new Ocean();
    }
}
