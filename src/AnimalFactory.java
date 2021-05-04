import java.util.Scanner;

public class AnimalFactory {
    public Animal getAnimal(String type){
        Scanner a3 = new Scanner(System.in);
        if ("canie".equals(type)) {
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
