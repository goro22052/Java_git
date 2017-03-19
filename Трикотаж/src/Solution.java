/**
 Трикотаж
 Пару задач назад студенты секретного центра JavaRush создавали класс Cat. Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat, а точнее — основываясь на нём, как на шаблоне. Их — котов — должно быть трое. Наполните этих троих жизнью, то есть, конкретными данными.
 */

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 1, 25, 5);
        Cat cat3 = new Cat("Petka", 2, 34, 4);
        Cat cat2 = new Cat("Mashka", 1, 18, 1);
        cat1.fight(cat2);
        System.out.println(cat1.name+" сильнее "+ cat2.name);
        cat1.fight(cat3);
        System.out.println(cat1.name+" сильнее "+ cat3.name);
        cat2.fight(cat3);
        System.out.println(cat3.name+" сильнее "+ cat2.name);
    }

    public static class Cat {
        public static int count = 0;
        public static int fightCount = 0;
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;
        public Cat(String name, int age, int weight, int strength) {
            count++;
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;
            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; //эквивалентно return score > 2 ? true : false;
        }
    }
}