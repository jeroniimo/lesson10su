package org.example;

public class Feed {
    private int foodAmount; // Еда в миске

    public Feed(int startingFood) {
        foodAmount = startingFood >= 0 ? startingFood : 0; // Начальное количество еды
    }

    public int getFoodAmount() {
        return foodAmount;  // Возвращает количество еды для проверки
    }

    public void decreaseFood(int amount) {
        if (foodAmount - amount >= 0) {
            foodAmount -= amount; // Проверка на отрицательное кол-во еды в миске
        }
    }
    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount; // Добавление еды в миску только положительное число
        }
    }

}
