package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /* //manually by developer
           PetrolEngine petrolEngine = new PetrolEngine();
           Car car = new Car();
           car.setEngine(petrolEngine); */

        //By Spring Framework
        //Dependency Injection
        // we can create IOC container in two way
        //Eager Loading
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Car car = context.getBean(Car.class);
        car.drive();

        //Lazy Loading
//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//        Car car = factory.getBean(Car.class);
//        car.drive();

        //By Default Bean Scope is Singleton
        //singleton-->only one spring bean(object) will be greating
        //prototype-->new SB will be creating for every getBean() function
        //request,session

//        Car car1 = context.getBean(Car.class);
//        Car car2 = context.getBean(Car.class);
//        System.out.println(car1.hashCode());
//        System.out.println(car2.hashCode());

        //object(petrol or diesel) injected into car class

    }
}
