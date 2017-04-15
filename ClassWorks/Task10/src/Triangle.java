/**
 * Created by Student8 on 15.04.2017.
 */
public class Triangle extends Figure implements toString {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }

  public String toString() {
      return(getA() + " " + getB()+ " " + getC());
  }
}
