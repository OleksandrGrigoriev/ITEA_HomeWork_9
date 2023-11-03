package org.hw9task5;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Animal animal = new Animal().createAnimal();
        Field[] fieldsOfAnimalClass = animal.getClass().getDeclaredFields();
        Scanner scanner = new Scanner(System.in);

        for (Field field: fieldsOfAnimalClass) {
            field.setAccessible(true);
            field.trySetAccessible();
            System.out.println(field.getName() + ": " + field.getType()  + " " + field.get(animal));
        }
        System.out.println();
        for (Field field: fieldsOfAnimalClass) {
            try {
                if (field.getType().toString().equals("class java.lang.String")) {
                    System.out.printf("Enter new String value for field %s: ", field.getName());
                    field.set(animal, scanner.nextLine());
                } else if (field.getType().toString().equals("boolean")) {
                    System.out.printf("Enter new boolean value for field %s: ", field.getName());
                    field.set(animal, scanner.next());
                } else if (field.getType().toString().equals("int")) {
                    System.out.printf("Enter new int value for field %s: ", field.getName());
                    field.set(animal, scanner.nextInt());
                    scanner.nextLine();
                }
            } catch (IllegalAccessException e) {
            } catch (IllegalArgumentException e) {
            }
        }
        System.out.println();
        for (Field field: fieldsOfAnimalClass) {
            System.out.println(field.getName() + ": " + field.getType()  + " " + field.get(animal));
        }

        scanner.close();
    }
}
