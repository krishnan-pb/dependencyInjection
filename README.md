# Dependency Injection

Below are the details of Dependency Injection implementation using java

Design:
- Factory Design Pattern is used to implement DI in ObjectFactory.java, which is used by 3rd part code / Test class.
  The getInstance() method returns the class instance based on the paramters class name and scope specified, 
  it internally uses Reflection.

<img width="1014" alt="Screenshot 2020-04-29 at 10 00 30 PM" src="https://user-images.githubusercontent.com/20641887/80605736-0c8bb080-8a66-11ea-82b0-557bb6355657.png">
  
  
Unit Testing:
- ObjectFactoryTest class Tests the ObjectFactory.java class using junit assertions, which cover exceptional cases 
  and validation singleton and prototype behaviour.


Usage:
1. This is a maven project, clone the repository and build the maven jar.
2. Add the above jar as a dependency in your pom.xml or add it to your class path if you are running the program via command line.
3. Sample usage.

  import demo.dependencyInjection.ObjectFactory; 
  
  //invoke getInstance passing fully qualified class name of the object you want to inject and scope SINGLETON/PROTOTYPE
  Object obj = ObjectFactory.getInstance("demo.dependencyInjection.model.CustomModel, ObjectFactory.SINGLETON);

Limitations/Improvemnts:
- Exception Handling
- Multithreading
- Logging


