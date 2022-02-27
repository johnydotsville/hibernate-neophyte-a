package lev.johnydotsville.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AUTO что дает? Identity походу дает автонумерацию
    @Column(name = "actor_id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return "actor : { "
                + "id=" + this.id + ", "
                + "fname='" + this.firstName + "', "
                + "lname='" + this.lastName + "'"
                + "}";
    }
}