import java.util.Scanner;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Scanner a3 = new Scanner(System.in);
        System.out.println("nhap : ");
        String a0 = a3.next();
        Animal a1 = animalFactory.getAnimal("feline");
   //     System.out.println("a1 sound: "  + a1.makeSound());

        Animal a2 = animalFactory.getAnimal("canie");
  //      System.out.println("a2 sound: "+ a2.makeSound());
        if(a0.equals("canie")) {
            System.out.println(a1.makeSound());
        }else {
            System.out.println(a2.makeSound());
        }
    }
}
