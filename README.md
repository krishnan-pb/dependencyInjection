# dependencyInjection

Below are the details of Dependency Injection implementation using java

Design:
- Factory Design Pattern is used to implement DI in ObjectFactory.java, which is used by 3rd part code / Test class.
  The getInstance() method returns the class instance based on the paramters (class name and scope specified).
  
Unit Testing:
- ObjectFactoryTest class Tests the ObjectFactory.java class using junit assertions, which cover exceptional cases 
  and valudation singleton and prototype behaviour.
  
Usage:
1. This is a maven project, clone the repository and build the maven jar and use.
2. Add the above jar as a dependency in your pom.xml or add it to your class path if you are running the program via command line.
3. Sample usage.

  import demo.dependencyInjection.ObjectFactory; 
  
  //invoke getInstance passing fully qualified class name of the object you want to inject and scope SINGLETON/PROTOTYPE
  Object obj = ObjectFactory.getInstance("demo.dependencyInjection.model.CustomModel, ObjectFactory.SINGLETON);

Limitations/Improvemnts:
- Exception Handling
- Multithreading
- Logging


