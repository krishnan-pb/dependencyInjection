# Dependency Injection

Challenge:

It’s 2002 all over again and our favorite DI (Dependency Injection) Framework have not been invented yet. Your task, should you choose to accept is to design & implement a dependency injection framework like spring.

You may have empty unit tests / implementation but at the bare minimum your solution should be able to demonstrate a DI by singleton & prototype scopes. 

------------------------------------------------------------------------------------------------------------------------------
Below are the details of Dependency Injection implementation using java

Design:
- Factory Design Pattern is used to implement DI in ObjectFactory.java, which is used by 3rd part code / Test class.
  The getInstance() method returns the class instance based on the paramters class name and scope specified, 
  it internally uses Reflection.
  
<img width="546" alt="1" src="https://user-images.githubusercontent.com/20641887/80607661-583f5980-8a68-11ea-8c6b-afb9b9c3b31b.png">
  
Unit Testing:
- ObjectFactoryTest class Tests the ObjectFactory.java class using junit assertions, which cover exceptional cases 
  and validation singleton and prototype behaviour.


Usage:
1. This is a maven project, clone the repository and build the maven jar.
2. Add the above jar as a dependency in your pom.xml or add it to your class path if you are running the program via command line.
3. Sample usage.

  import demo.dependencyInjection.ObjectFactory; 
  
  //invoke getInstance passing fully qualified class name of the object you want to inject and scope SINGLETON/PROTOTYPE
  Object obj = ObjectFactory.getInstance("demo.dependencyInjection.model.CustomModel", ObjectFactory.SINGLETON);

Limitations/Improvemnts:
- Exception Handling
- Multithreading
- Logging


