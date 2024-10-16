import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] myClasses = {"print", "printf", "массив", "While loop", "for"};
    MyClass myClass1 = new MyClass("Azmar","Kurmanbekov",15,myClasses,"Lyuboy");
        System.out.println("Name : "+myClass1.name+"\nLastname : "+myClass1.surename+"\nAge : "+myClass1.age+"\nLessons : "+ Arrays.toString(myClasses)+"\nFavorite food : "+myClass1.favoriteFood);
        System.out.println(" ");
    MyClass myClass2 = new MyClass("Azamat","Kurmanbekov",16,myClasses,"Fricasse");
        System.out.println("Name : "+myClass2.name+"\nLastname : "+myClass2.surename+"\nAge : "+myClass2.age+"\nLessons : "+ Arrays.toString(myClasses)+"\nFavorite food : "+myClass2.favoriteFood);
    }
}