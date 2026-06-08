/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package unittest.FirstTest;

/**
 *
 * @author Inderpal Singh, 2026
 */
public class Student {

    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getInfo() {
        return name + " has marks " + marks;
    }

    public int addBonusMarks() {
        marks = marks + 5;
        return marks;
    }
}