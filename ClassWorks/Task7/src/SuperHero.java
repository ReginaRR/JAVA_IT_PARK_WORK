/*
Task7 Создать класс SuperHero
        У него два потомка - Mutants и Humans.
        И у того и у того класса есть количество
        врагов.
        Написать метод сортировки массива
        супергероев
        по количеству врагов.
*/
public class SuperHero {
    protected String name;
    protected int enemies;

    public SuperHero(String name, int enemies) {
        this.name = name;
        if (enemies >= 0) {
           this.enemies = enemies;
        }
        else {
            this.enemies = 0;
        }
    }

    public String getName() {

        return name;
    }

    public int getEnemies() {
        return enemies;
    }

}