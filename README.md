# dagger2-feature-showoff

## Intro
Although Dagger2 is no longer hot topic among developers, I always found it frustrating
that even official documentation is lacking deep insight of what Dagger can actually do and what
are the small details that everyone should be aware of when using Dagger.
Of course, there are more than enough examples on various articles on the Internet, but they are usually related to
integrating Dagger with Android project (which is nothing wrong to be clear).

## Goal of project
Main goal of this project is not to show how Dagger should be set up for an Android project or any 
other framework (for example, JavaFX GUI app). 

On the contrary, the idea is to show how Dagger works on simplest application stack as possible. 
In this case, plain command line app.

As you already probably noticed, module names in the project are prefixed with numbers to have consistent ordering
when project is imported to IDE and to provide a visual hierarchy of how a person who might be interested in the project
should examine the modules.

## How to go through examples
Each module has it's own `README.md` file explaining particular scenario being demonstrated regarding Dagger's 
functionality.
I went with more strict approach and implemented almost none of the logic inside `main` source set, but I rather
wrote test cases which are more explicit when it comes to validating expected behavior of Dagger.
