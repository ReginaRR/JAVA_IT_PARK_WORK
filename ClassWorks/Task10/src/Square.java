/**
 * Created by Student8 on 15.04.2017.
 */
public class Square extends Figure implements toString {
    private int aa;
    public Square(int aa) {
        this.aa = aa;

    }
    public int getA() {
        return aa;
    }
    public String toString() {
        return(getA() + " ");
    }
}
