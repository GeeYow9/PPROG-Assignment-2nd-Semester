package com.mycompany.studentmanagementapp;
import java.util.Scanner;
import java.util.*;

public class StudentManagementApp {
    private static ArrayList<Student>students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        while (true){
            System.out.println("Enter 1 to launch menu or any other key to exit");
            String input = scanner.nextLine();
            if(!input.equals("1")){
                System.out.println("Exiting Application");
                break;
            }
            displayMenu();
        }
    }    
        public static void displayMenu() {
            System.out.println("\n            ABC College            ");
            
            System.out.println("Please select one of the following menu items:");
            System.out.println("1. Capture a new student");
            System.out.println("2. Search for a student");
            System.out.println("3. Delete a student");
            System.out.println("4. Print student report");
            System.out.println("5. Exit application");
            System.out.print("Select any option above: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline

            switch (choice) {
                case 1 :
                    saveStudent();
                    break;
                case 2:
                    searchStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    studentReport();
                    break;
                case 5:
                    exitStudentApplication();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    
public static void saveStudent() {
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
                    System.out.println("You have entered an incorrect age. Please re-enter correct age.");
                }
            } catch (NumberFormatException e) {
                System.out.println("You have entered an invalid age. Please re-enter valid age.");
            }
        }

        System.out.print("Please enter student email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();

        students.add(new Student(id, name, age, email, course));
        System.out.println("Thank you. Student details have been successfully saved.");
    }

    public static void searchStudent() {
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

    public static void deleteStudent() {
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

    public static void studentReport() {
        System.out.println("**** Student Report ****");
        for (Student student : students) {
            student.displayDetails();
            System.out.println("**************");
        }
    }

    public static void exitStudentApplication() {
        System.out.println("Exiting the application. Goodbye!");
        System.exit(0);
    }
    public boolean isAgeValid(int age) {
        
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
        return false;}
}
