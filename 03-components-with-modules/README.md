
# Dagger provider modules

In the examples so far we have used classes with `@Inject` annotated constructors and optionally scope annotations on class. When
constructing dependency graph, Dagger would scan the classes in project and picked them up since they had `@Inject` annotated 
constructor.

In this cases we provide those objects from `@Module` annotated classes where method, annotated with `@Provides` annotation, are
defined. We are using explicit mode of defining dependencies where we are in total control what gets picked up by the Dagger.

We use the same abstractions as in `02-custom-scope-example`. 

## More details on implementation with modules
First thing that is different with this case is that there is no more `@Inject` annotated constructors. All objects are provided
through modules. 

The components are set up as they are in `02-custom-scope-example` and test cases are copied. What is different however is how
components are set up now, because modules now have to be explicitly added to the component when it is instantiated.

```
(...)
continentComponent = DaggerContinentComponent.builder()
                                             .planetComponent(planetComponent)
                                             .continentModule(new ContinentModule("Module name"))
                                             .build();
```

Notice how we do not need to add dependency to `CountryModule`. This is because `CountryModule` is declared as abstract class
and does not have custom constructor which requires constructor.

## Practice assignment

Try out the following:
1. In CountryModule, remove `static` modifier for provider method for Country object and try to run the tests.
2. Remove the `PlanetComponent.ocean()` method and try to run the tests.
    1. What is the outcome and why?