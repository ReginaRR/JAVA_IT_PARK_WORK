public class Main {
public static void main(String[] args) {
        Human leonard = new Human("Leonard", 6);
        Human ray = new Human("Ray", 2);
        Human martin = new Human("Martin", 16);
        Mutants qwe = new Mutants("Qwe", 25);
        Mutants qwer = new Mutants("Qwer", 25);
        Mutants qwerty = new Mutants("Qwerty", 25);


        SuperHero array[] = new SuperHero[6];
        array[0] = leonard;
        array[1] = ray;
        array[2] = martin;
        array[3] = qwe;
        array[4] = qwer;
        array[5] = qwerty;

        SuperHero a = new SuperHero(null, 0);

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].getEnemies() > array[j+1].getEnemies() ) {
                    a = array[j];
                    array[j] = array[j+1];
                    array[j+1] = a;

                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].getName() + " " + array[i].getEnemies() + "\n");
        }

    }
}