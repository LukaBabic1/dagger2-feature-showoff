
# Custom scope

In this example it is demonstrated how we can define custom scope in Dagger. 

Idea of custom scope is to have a sub-scope which is a child global scope (in our scenario singleton scope) which usually 
does not live as long as the entire application. It rather lives as long as some temporary element in the application,
such as particular screen in terms of GUI application.

Custom scoped annotation is defined as follows using standard `@Scope` annotation from `JSR-330`:

```
@Scope
public @interface ContinentScope {}
```

If we compare this with definition of predefined `@Singleton` annotation we see very little difference in definition:
```
@Scope
@Documented
@Retention(RUNTIME)
public @interface Singleton {}
```

Basically, `@Singleton` annotation is standardized annotation in `JSR-330` for singleton scope and nothing would actually
prevent particular developer to promote it's own annotation to be a placeholder for singleton scope. Of course, it would
be needed to consistently used in injection mechanism to work.

## Mode info on details
In this particular example we added more than one new Dagger feature into play. Except from adding new `@ContinentScope` annotation 
and scoped component, we introduced concept of component dependency where ContinentComponent depends on PlanetComponent. 

This was added so Dagger could provide `Ocean` to `Continent` object. Also we needed to add `PlanetComponent.ocean()` method to 
propagate the object provided from `PlanetComponent` downstream (i.e., components which depend on PlanetComponent). Adding this
method was nothing new, but in this case this method is used implicitly by Dagger, not by tests as before.
Also, same method was added to the `ContinentComponent` so we could obtain reference to `Ocean` object through the `ContinentComponent`

Look at these implementation details as convenience, they will be described in more details in upcoming examples.

## Note about classes and abstractions
Do not take these abstractions seriously, they only serve as understandable-enough concepts for everyone to understand what is being
described in particular example.