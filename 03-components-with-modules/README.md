
# Dagger provider modules

In the examples so far we have used classes with `@Inject` annotated constructors and optionally scope annotations on class. When
constructing dependency graph, Dagger would scan the classes in project and picked them up since they had `@Inject` annotated 
constructor.

In this cases we provide those objects from `@Module` annotated classes where method, annotated with `@Provides` annotation, are
defined.

