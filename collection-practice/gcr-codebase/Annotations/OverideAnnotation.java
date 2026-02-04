package Annotations;

class Animal{
    public  void makesound(){
        System.out.println("Animal makesound");
    }
}

class dog extends Animal{
    @Override
   public  void makesound(){
        System.out.println("Dog makesound");
    }

}
public class OverideAnnotation {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.  makesound();
    }
}
