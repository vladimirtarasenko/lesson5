package by.Itacademy.OOP_in_Java;

import java.util.Scanner;

public class Main2 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        StudentContainer studentContainer = new StudentContainer();
        studentContainer.inputPeopleInfo();
        boolean isStudentExists = false;
        do {
            System.out.println(" Please enter student name or surname for birythday search: ");
            isStudentExists = studentContainer.SearchPeopleInfo(scanner.nextLine());
            if (!isStudentExists) {
                System.out.println("There's no student with such name! Please repeat the enter!");

            }
        }
        while (!isStudentExists);

        studentContainer.printMiddleAgeCalculation();
    }
}