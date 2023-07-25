package beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    /* User variables */
    private Long id;
    private String name;
    private int age;
    private String favFood;

    /* Constructors */
    public User() { // Default
    }

    public User(String name) {
        this.name = name;
    }

    public User(Long id, String name, int age, String favFood) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.favFood = favFood;
    }

    /* Getters and setters */

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }
}
