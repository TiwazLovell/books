package wiringBeans.parameter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Person person = context.getBean(Person.class);

    Parrot parrot = context.getBean(Parrot.class);

    System.out.println("first.Person's name: " + person.getName());
    System.out.println("first.Parrot's name: " + parrot.getName());

    System.out.println("first.Person's parrot: " + person.getParrot());
  }
}
