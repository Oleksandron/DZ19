        /*1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
        Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
        Создать массив из 100 обьектов типа Person заполненных случайными данными
        (Например создать массив на несколько имен и выбирать из него случайным образом).
        1.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
        не было человека весом 3 кг и ростом 180 итд.*/

public class Person {
    String  firstname;
    String  lastname;
    Integer  age;
    Integer  weight;
    Integer  growth;
    String[] Person = {"Bob","Alex","Piter","Magy","Anna","Tom","Mary","Nikol","Gary","Sofia"};

    public Person() {
        System.out.println("Creating new persons");
    }

    public Person(String firstname, String secondname) {
        this.firstname = firstname;
        this.lastname = secondname;
    }

    public Person(String firstname, String secondname, Integer age) {
        this.firstname = firstname;
        this.lastname = secondname;
        this.age = age;
    }

    public Person(String firstname, String secondname, Integer age, Integer weight, Integer growth) {
        this.firstname = firstname;
        this.lastname = secondname;
        this.age = age;
        this.weight = weight;
        this.growth = growth;
    }
    String getPerson(){
        int p = (int) (Math.random()*10);
        System.out.println("Name: " + Person[p]);
        return Person[p];
    }
    Integer getWeight() {
        int w = (int) (50 + (Math.random()*(100-70)));
        System.out.println("Weight: " + w);
        return weight;
    }
    Integer getGrowth() {
        int g = (int) (150 + (Math.random()*(100-50)));
        System.out.println("Growth: " + g);
        return weight;
    }

    Integer getAge() {
        int a = (int) (25 + (Math.random()*(100-60)));
        System.out.println("Age: " + a);
        return age;
    }
}
