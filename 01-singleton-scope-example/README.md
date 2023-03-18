
This basic example shows how dagger, when simplest component is generated,
will automatically detect classes which have `@Inject` annotated constructor and 
will be able provide instances of those objects.

Notice how we were able to obtain instance of a `Car` object directly from component, but
we were not able to do this for an `Engine` since engine was not exposed by the component.
Even though not exposed in component, Dagger was able to take care of instantiation of engine
object and pass it to constructor of `Car`.

