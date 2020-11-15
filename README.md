# hello

A project to create an "enterprise ready" template Maven project, from a Maven quickstart archetype.

*WORK IN PROGRESS* Not all the features below are implemented yet. Look at the branch names of the repository to find out which; if I've merged a feature branch into master, then I considered the feature fully implemented.

There is no implication that any Maven archetype is by nature unfit for enterprise use! However, the enterprise where **I** work requires a project to have certain features which aren't present in a Maven quickstart archetype, e.g.

- Logging with a proper logger; use of System.out methods to print to terminal is forbidden.
- Packaging the application as an executable jar
- Source control by a centralised source repository manager.
- Storage of components, including jars, in a centralised component repository manager.
- Pipeline automation.
- Test automation.
- (more to follow as I remember them...)

There are other useful features too, such as

- being an Eclipse project

I got tired of searching for examples to hack about every time I wanted to create a new project, so I created this "bare bones" project to be a starting point for myself, and as a teaching exercise.

So - this project is all about the development tools, not about the features of the actual application. Currently it's a simple "Hello world" application. But the usage of development tools is awesome.
