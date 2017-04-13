public class Main {
public static void main(String[] args) {
        Human marsel = new Human("Marsel", 23);
        Human alina = new Human("Alina", 18);
        Human regina = new Human("Regina", 18);
        Human ruslan = new Human("Ruslan", 25);
        Human alex = new Human("Alex",19);
        Human martin = new Human("Martin",26);
        Human sheldon = new Human("Sheldon",31);
        Human leonard = new Human("Leonard",23);
        
        Human humans[] = new Human[8];
        humans[0] = marsel;
        humans[1] = alina;
        humans[2] = regina;
        humans[3] = ruslan;
        humans[4] = alex;
        humans[5] = martin;
        humans[6] = sheldon;
        humans[7] = leonard;

        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].getName());
        }
        int a[] = new int[humans.length];
        for(int i = 0; i < humans.length; i++) {
            a[i] = humans[i].getAge();
        }
       
        for (int i = humans.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j+1] < a[j]) {
                    int k = a[j];
                    a[j] = a[j+1];
                    a[j+1] = k;
                }
            }
        }

        for (int i = 0; i < humans.length; i++) {
            System.out.println(a[i]);
        }

        int NumAge[] = new int[120];
         for (int i = 0; i < 120; i++) {
            NumAge[i] = 0;
            
        }


        for(int i = 0; i < humans.length; i++) {
            NumAge[a[i]]++;
        }
         for (int i = 0; i < 120; i++) {
            if (NumAge[i] != 0) {
               System.out.println(i + " - " + NumAge[i]);
            }
        }
    }
}