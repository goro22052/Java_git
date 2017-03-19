/**
 Человечки
 Создать class Person. У человека должно быть имя String name, возраст int age, адрес String address, пол char sex.

 */
public class Person {

    public String name;
    public int age;
    public String adress;
    public char sex;


    public static void main(String[] args) {

        Person person = new Person();
        person.name = "Ivan";
        person.age = 30;
        person.adress =  "Kiev";
        person.sex = 'm';



    }
}