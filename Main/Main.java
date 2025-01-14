package Main;

import lab3.*;
import lab3.Character;

import java.util.ArrayList;

public class Main implements General {
    public static void main(String[] args) {
        System.out.print("Введите силу персонажа: ");

        // Создаем объекты
        Environment environment = new Environment("океан");
        Boat boat = new Boat("Иван", power);
        Character character = new Character("Иван", power);

        try {
            character.performAction(); // Этот вызов выполнится успешно.
        } catch (InsufficientPowerException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.exit(0);
        }

        Preparation preparation = new Preparation("Иван", "работа");
        Brainorpower brainorpower = new Brainorpower("Иван", power);
        Location.Place place = new Location.Place(10, 10); // расположение персонажа
        System.out.println("Координаты персонажа: " + place);

        // Сценарий:
        preparation.performAction();  // Подготовка
        preparation.time();  // Время работы
        place = new Location.Place(12, 12); // смена расположения из-за действий персонажа
        System.out.println("Координаты персонажа: " + place);
        brainorpower.performAction();  // Проверка уверенности в успехе
        Tools.digSand();  // Подкоп песка
        Tools.placeWood();  // Подкладывание дерева
        environment.attemptToReachOcean(character);  // Стремление к океану
        place = new Location.Place(8, 8);
        System.out.println("Координаты персонажа: " + place);

        // Увеличим силу и повторим попытку
        character = new Character("Иван", power + 3);  // Увеличение силы
        boat = new Boat("Иван", power + 3);  // Увеличение силы для переворота шлюпки

        // Попытка перевернуть шлюпку с увеличенной силой
        boat.performAction();

        place = new Location.Place(10, 10);
        System.out.println("Координаты персонажа: " + place);

        Character name1 = new Character("Ivan", power);
        Character name2 = new Character("Ivan", power + 3);
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(name1);
        characters.add(name2);
        System.out.println(characters + ": как конструкция изменила силу.");
    }
}
