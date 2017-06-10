package models;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "owners_and_animals")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;
    @Column
    private int age;

    @OneToMany
    @JoinTable(name = "pets",
            joinColumns =
            @JoinColumn(name = "owner_id"),
            inverseJoinColumns =
            @JoinColumn(name = "id"))
    private List<Pet> pets;

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof User)) {
            return false;
        }

        User that = (User) object;

        return this.id == that.id &&
                this.age == that.age &&
                this.name.equals(that.name);
    }
}