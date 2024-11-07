package dumshenko.daniil.maven;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Fox {


    private int age;
    private String name;

    public Fox() {

    }

    public Fox(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
