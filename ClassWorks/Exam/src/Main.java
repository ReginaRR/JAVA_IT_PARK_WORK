import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {
    public static void main(String[] args) {
        Figure Square1 = new Figure(8,5);
        Figure Square2 = new Figure(12,5);
        Figure Square3 = new Figure(12,5);
        Figure Rectangle2 = new Figure(4,5);
        Figure Rectangle1 = new Figure(4,5);
        Figure Triangle2 = new Figure(2,5);
        Figure Triangle1 = new Figure(5,5);
        int a[] = new int[7];
        Figure arr[] = {Square1,Square2,Square3,Rectangle1,Rectangle2,Triangle2, Triangle1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; i < arr.length; j++) {
                if ((arr[i].area == arr[j].area) && (arr[i].perimetr == arr[j].perimetr) &&(arr[i] != null) &&(arr[j] != null)) {

                    arr[j] = null;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[i]" + "  ");
        }
        System.out.println("Hello");

    }
}
