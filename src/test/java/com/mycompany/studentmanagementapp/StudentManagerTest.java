/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.studentmanagementapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class StudentManagerTest {
    
    public StudentManagerTest() {
    }
    
   

    /**
     * Test of saveStudent method, of class StudentManager.
     */
    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");
        StudentManager instance = new StudentManager();
        instance.saveStudent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchStudent method, of class StudentManager.
     */
    @Test
    public void testSearchStudent() {
        System.out.println("searchStudent");
        StudentManager instance = new StudentManager();
        instance.searchStudent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStudent method, of class StudentManager.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        StudentManager instance = new StudentManager();
        instance.deleteStudent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of studentReport method, of class StudentManager.
     */
    @Test
    public void testStudentReport() {
        System.out.println("studentReport");
        StudentManager instance = new StudentManager();
        instance.studentReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exitStudentApplication method, of class StudentManager.
     */
    @Test
    public void testExitStudentApplication() {
        System.out.println("exitStudentApplication");
        StudentManager instance = new StudentManager();
        instance.exitStudentApplication();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAgeValid method, of class StudentManager.
     */
    @Test
    public void testIsAgeValid() {
        System.out.println("isAgeValid");
        int age = 0;
        StudentManager instance = new StudentManager();
        boolean expResult = false;
        boolean result = instance.isAgeValid(age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
