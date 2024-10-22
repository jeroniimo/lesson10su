package org.example;

public abstract class Animal {
    protected String name;  // Имя животного
    protected static int animalCount = 0; // Общий счетчик животных

    public Animal(String name) {
        this.name = name;
        animalCount++; // Увеличиваем счетчик при создании нового животного
    }

    public abstract void run(int distance); // Метод для бега
    public abstract void swim(int distance); // Метод для плавания

    public String getName() {
        return name; // Метод для получения имени
    }

    public static int getAnimalCount() {
        return animalCount; // Метод для получения общего количества животных
    }
}
