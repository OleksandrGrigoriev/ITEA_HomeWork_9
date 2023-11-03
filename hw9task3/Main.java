package org.hw9task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class testClass = String.class;

        Field[] fieldsOfStringClass = testClass.getDeclaredFields();
        Constructor[] constructorsOFStringClass = testClass.getDeclaredConstructors();
        Method[] methodsOfStringClass = testClass.getDeclaredMethods();
        Class[] classesOfStringClass = testClass.getDeclaredClasses();

        System.out.printf("Fields of %s class:\n", testClass.getName());
        for (Field field: fieldsOfStringClass) {
            System.out.print(field.getType().getName() + ": ");
            System.out.println(field.getName());
        }

        System.out.println();

        System.out.printf("Constructors of %s class:\n", testClass.getName());
        for (Constructor constructor: constructorsOFStringClass) {
            System.out.print(constructor.getName() + " ");
            System.out.println(Arrays.toString(constructor.getParameterTypes()));
        }

        System.out.println();

        System.out.printf("Methods of %s class:\n", testClass.getName());
        for (Method method: methodsOfStringClass) {
            System.out.print(method.getReturnType() + ": ");
            System.out.println(method.getName());
        }

        System.out.println();

        System.out.printf("Classes of %s class:\n", testClass.getName());
        for (Class clas: classesOfStringClass) {
            System.out.println(clas.getName());
        }

    }
}
