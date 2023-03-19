
# Singleton scope

This is still simple example how Dagger works and is almost identical to `00-basic-example` one.
The key difference here is that `Car` class is annotated with `@Singleton` annotation and still has `@Inject` annotated constructor.
Also, the `MainComponent` is marked with `@Singleton` annotation.

In this case, we are also obtaining an instance of `Car` object directly from component. However, as the tests show, when we obtain
instance of car through `MainComponent.car()` method, we always get the same instance.
This is desired behavior since we do want only one instance of `Car` to be provided from the component, no matter how many times
we invoke `MainComponent.car()` method.

## Practice assignment
Try to remove `@Singleton` annotation, once from `MainComponent` and once from `Car` class. 

What are the consequences from both of these actions ?

