
package com.mycompany.studentmanagementapp;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    

        public void saveStudent() {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        int age = 0;
        while (true) {
            System.out.print("Enter student age (equals to/greater than 16): ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 16) {
                    break;
                } else {
                    System.out.println("You have entered an incorrect student age. Please re-enter correct age.");
                }
            } catch (NumberFormatException e) {
                System.out.println("You have entered an invalid student age. Please re-enter valid age.");
            }
        }

        System.out.print("Please enter student email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();

        students.add(new Student(id, name, age, email, course));
        System.out.println("Student details have been successfully saved.");
    }

    public void searchStudent() {
        System.out.print("Enter the student ID to search: ");
        String id = scanner.nextLine();
        Student foundStudent = null;

        for (Student student : students) {
            if (student.getId().equalsIgnoreCase(id)) {
                foundStudent = student;
                break;
            }
        }

        if (foundStudent != null) {
            foundStudent.displayDetails();
        } else {
            System.out.println("Student with Student Id: " + id + " was not found.");
        }
    }

    public void deleteStudent() {
        System.out.print("Enter the student ID to delete: ");
        String id = scanner.nextLine();
        Student studentToDelete = null;

        for (Student student : students) {
            if (student.getId().equalsIgnoreCase(id)) {
                studentToDelete = student;
                break;
            }
        }

        if (studentToDelete != null) {
            System.out.print("Are you sure you want to delete student " + id + " from the system? (Yes(y) or No(n)): ");
            String confirmation = scanner.nextLine();
            if (confirmation.equalsIgnoreCase("y")) {
                students.remove(studentToDelete);
                System.out.println("Student with Student Id: " + id + " was deleted.");
            }
        } else {
            System.out.println("Student with Student Id: " + id + " was not found.");
        }
    }

    public void studentReport() {
        System.out.println("**** Student Report ****");
        for (Student student : students) {
            student.displayDetails();
            System.out.println("**************");
        }
    }

    public void exitStudentApplication() {
        System.out.println("Exiting the application. Goodbye!");
        System.exit(0);
    }
    public boolean isAgeValid(int age) {
        
        while (true) {
            System.out.print("Enter student age (equal to/greater than 16): ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 16) {
                    break;
                } else {
                    System.out.println("You have entered an incorrect student age. Please re-enter.");
                }
            } catch (NumberFormatException e) {
                System.out.println("You have entered an invalid student age. Please re-enter.");
            }
        }
        return false;}
    
    
    
}
