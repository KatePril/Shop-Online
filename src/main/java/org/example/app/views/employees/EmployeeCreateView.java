package org.example.app.views.employees;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeCreateView {

    public String[] getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine().trim();
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine().trim();
        System.out.println("Enter birth date: ");
        String birthDate = scanner.nextLine().trim();
        System.out.println("Enter position id: ");
        String positionId = String.valueOf(getPositionId());
        System.out.println("Enter phone: ");
        String phoneNumber = scanner.nextLine().trim();
        System.out.println("Enter salary: ");
        String salary = String.valueOf(getSalary());
        return new String[] {lastName, firstName, birthDate, positionId, phoneNumber, salary};
    }

    private int getPositionId() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ime) {
            return getPositionId();
        }
    }

    private double getSalary() {
        Scanner scanner = new Scanner(System.in);
        try {
             return scanner.nextDouble();
        } catch (InputMismatchException ime) {
            return getSalary();
        }
    }

    public void  getOutput(String output) {
        System.out.println(output);
    }

}
