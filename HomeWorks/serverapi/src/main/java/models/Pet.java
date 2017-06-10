package models;

import javax.persistence.*;

@Entity
@Table(name = "auto")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String petType;

    @Column
    private String petName;

    @Column(name = "owner_id")
    private Integer ownerId;

    public Pet(String petType, String petName, Integer ownerId) {
        this.petType = petType;
        this.petName = petName;
        this.ownerId = ownerId;
    }

    public Pet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }
}
