package training;
 
import animal.Dog;
 
public class Trainer {
    public void teach(Dog dog) {
        dog.name = "Rex";
        dog.bark();
    }
}