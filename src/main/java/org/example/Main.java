package org.example;

import org.example.domain.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Course course1 = new Course();

        course1.setTitle("Java");
        course1.setDescription("curso de java");
        course1.setWorkload(5);

        Course course2 = new Course();
        course2.setTitle("Python");
        course2.setDescription("curso de python");
        course2.setWorkload(10);

        Mentoring mentoring1 = new Mentoring();
        mentoring1.setTitle("mentoria de java");
        mentoring1.setDescription("descrição mentoria java");
        mentoring1.setDate(LocalDate.now());

        System.out.println(mentoring1);
        System.out.println(course1);
        System.out.println(course2);

        System.out.println("------------------------- ");

        Content content = new Course();
        content =  course1;
        System.out.println(content);
        course1.setDescription("Curso de java/SpringBoot");
        System.out.println(content);
        System.out.println("------------------------- ");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Bootcamp completo de java");

        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring1);

        Dev devAfonso = new Dev();
        devAfonso.setName("Afonso");
        devAfonso.subscribeToBootcamp(bootcamp);
        System.out.println("Subscribed contents "+devAfonso.getName()+" "+devAfonso.getSubscribedContents());
        System.out.println("Completed contents "+devAfonso.getCompletedContents());

        System.out.println("------------------------- ");
        Dev devJoao = new Dev();
        devJoao.setName("Joao");
        devJoao.subscribeToBootcamp(bootcamp);
        System.out.println("Subscribed contents " +devJoao.getName()+" "+devJoao.getSubscribedContents());
        System.out.println("Completed contents: "+devJoao.getCompletedContents());

        System.out.println("------------------------- ");

        System.out.println("Progress");
        devJoao.progress();
        System.out.println("Subscribed contents " +devJoao.getName()+" "+devJoao.getSubscribedContents());
        System.out.println("Completed contents: "+devJoao.getCompletedContents());

        System.out.println("------------------------- ");
        devJoao.progress();
        devJoao.progress();
        //test sys err
        //devJoao.progress();
        System.out.println("Subscribed contents " +devJoao.getName()+" "+devJoao.getSubscribedContents());
        System.out.println("Completed contents: "+devJoao.getCompletedContents());




    }
}