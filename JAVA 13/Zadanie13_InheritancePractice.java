import java.util.ArrayList;
import java.util.List;

// Родительский класс
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Животное издаёт звук");
    }
    
    // Дополнительное задание 1: метод info()
    public void info() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}

// Дочерний класс Dog
class Dog extends Animal {
    
    // Дополнительное задание 2: поле breed
    private String breed; 

    public Dog(String name, int age, String breed) {
        super(name, age); // вызов конструктора родителя
        this.breed = breed;
    }
    
    public Dog(String name, int age) {
        super(name, age); // Перегрузка
        this.breed = "Неизвестна";
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Порода: " + breed);
    }
}

// Дочерний класс Cat
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
    
    @Override
    public void info() {
        super.info();
    }
}

// Точка входа (класс, совпадающий с именем файла)
public class Zadanie13_InheritancePractice {
    public static void main(String[] args) {
        
        Dog dog = new Dog("Бобик", 3, "Овчарка");
        Cat cat = new Cat("Мурка", 2);
        
        System.out.println("--- Звуки ---");
        dog.makeSound(); // Гав-гав!
        cat.makeSound(); // Мяу!
        
        // Демонстрация метода info()
        System.out.println("\n--- Информация ---");
        dog.info();
        cat.info();
        
        // Дополнительное задание 3: ArrayList<Animal>
        System.out.println("\n--- Дополнительное задание: Полиморфизм ---");
        
        Animal bird = new Animal("Кеша", 1); 
        
        List<Animal> zoo = new ArrayList<>();
        zoo.add(dog);
        zoo.add(cat);
        zoo.add(bird);
        
        for (Animal animal : zoo) {
            animal.makeSound();
        }
    }
}