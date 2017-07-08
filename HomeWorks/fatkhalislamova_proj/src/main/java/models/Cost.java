package models;
import javax.persistence.*;

@Entity
@Table(name = "costs")
public class Cost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private char[] cost = new char[100];
    @Column
    private int user_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char[] getCost() {
        return cost;
    }

    public void setCost(char[] cost) {
        this.cost = cost;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Cost(char[] cost, int user_id) {
        this.cost = cost;
        this.user_id = user_id;
    }

    public Cost(int id, char[] cost, int user_id) {
        this.id = id;
        this.cost = cost;
        this.user_id = user_id;
    }
}
