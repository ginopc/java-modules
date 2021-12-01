package it.ginopc.modules.main;

import it.ginopc.modules.hello.HelloModules;
import it.ginopc.modules.hello.HelloInterface;

import java.util.ServiceLoader;

public class MainApp {

  public static void main(String[] args) {
    HelloModules.doSomething();
    
    Iterable<HelloInterface> services = ServiceLoader.load(HelloInterface.class);
    HelloInterface service = services.iterator().next();
    service.sayHello();
  }
}