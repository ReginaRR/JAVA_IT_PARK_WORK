/*/10-я задача
        Создать проект Task10
        Список фигур записать в файл
        1) Описать классы фигур
        2) переопределить toString
        3) OutputStream - записать в файл список фигур*/

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Figure figure[] = new Figure[4];
        figure[0] = new Square(2);
        figure[1] = new Square(3);
        figure[2] = new Triangle(3,4,5);
        figure[3] = new Triangle(5,9,10);


        OutputStream outputStream =
                new FileOutputStream("output.txt");

        for( int i = 0; i < figure.length; i++) {
            String a = figure[i].toString();
            byte bytes[] = a.getBytes();
            outputStream.write(bytes);

        }
    }
}
