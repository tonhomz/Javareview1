/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapp;

import student.Student;

/**
 *
 * @author LENOVO
 */
public class StudentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setId(12345);
        std1.setName("Prayut");
        std1.setGPA(1.5);
        System.out.println("ID : " + std1.getId());
        System.out.println("Name : " + std1.getName());
        System.out.println("GPA : " + std1.getGPA());
    }
    
}
