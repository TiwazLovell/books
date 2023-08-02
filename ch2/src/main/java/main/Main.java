package main;

import config.ProjectConfig;
import config.ProjectConfig2;
import config.ProjectConfig3;
import config.ProjectConfig4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

//        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//        Parrot p = context.getBean(Parrot.class);
//        System.out.println(p.getName());
//
//        String s = context.getBean(String.class);
//        System.out.println(s);
//
//        Integer i = context.getBean(Integer.class);
//        System.out.println(i);

//        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);
//
////        Parrot p = context.getBean(Parrot.class);
//////        default name
////        Parrot p = context.getBean("parrot1", Parrot.class);
////        custom name
//        Parrot p = context.getBean("weekend", Parrot.class);
//        System.out.println(p.getName());

//        var context = new AnnotationConfigApplicationContext(ProjectConfig3.class);
//        Parrot p = context.getBean(Parrot.class);
//        System.out.println(p.getName());

//        var context = new AnnotationConfigApplicationContext(ProjectConfig4.class);
//
//        Parrot2 p = context.getBean(Parrot2.class);
//
//        System.out.println(p);
////        this would print null, without using @PostConstruct
//        System.out.println(p.getName());


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot();
        x.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> x;

        //context.registerBean("parrot1", Parrot.class, parrotSupplier);

        context.registerBean("parrot1",
                Parrot.class,
                parrotSupplier,
                bc -> bc.setPrimary(true));

        Parrot p = context.getBean(Parrot.class);

        System.out.println(p.getName());
    }
}
