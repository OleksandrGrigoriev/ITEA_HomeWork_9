package org.hw9task5;

public class Cat extends Animal {
    final String name;
    int age;
    public String breed;
    protected String color;
    public static final boolean isCat = true;
    private static boolean afraidOfDogs;
    private static final boolean isSomeAnimal = false;
    private Cat() {
        super();
        name = "Tom";
        age = 4;
        breed = "Home Cat";
        color = "Dark-Grey";
        afraidOfDogs = true;
    }

    public Cat createCat() {
        if (countOfAnimals == 0) {
            countOfAnimals++;
            return new Cat();
        }  else {
            System.out.println("Mouse already exists!");
        }
        return null;
    }
}
