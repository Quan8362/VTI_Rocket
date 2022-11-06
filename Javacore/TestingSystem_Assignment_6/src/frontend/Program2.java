package frontend;

import backend.Exercise2_Exception;

public class Program2 {
    public static void main(String[] args) {

        try {
            String[] departments = {"department1", "department2", "department3", "department4", "department5"};
            System.out.println(departments[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cannot find department.");
        }

    }
}
