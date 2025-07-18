
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    @Override
    public boolean equals( Object comp ){
        if(this==comp){
            return true;
        }
        if(comp instanceof Person){
            Person compared=(Person)comp;

            if(this.name.equals(compared.name)&&
            this.birthday.equals(compared.birthday)&&
            this.height==((Person)compared).height&&
            this.weight==((Person)compared).weight)
                return true;


            }
            return false;

        }


    }
