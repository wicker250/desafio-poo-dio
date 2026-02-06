package org.example;

import org.example.domain.Course;
import org.example.domain.Mentoring;

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
    }
}