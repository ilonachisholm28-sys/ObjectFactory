import java.sql.SQLOutput;

public class Factory {

    //todo: make 2 variables called isOpen and yearFounded
    //what data type do you need? and give variables value
   //instance variables
    //always use public
    //constructor: making monoply box strucutre, special methods, doesnt include void
    public boolean isOpen = true; //boolean is a true or false statement
    //integeres hold numbers (negative and positive)
    public int yearFounded = 2026;
    //string - holds words, punctuation, sentences
    //must use quotes for strings
    public String owner = "Ilona";
//objects are the house, classes are the blueprints
    public Pumpkin pumpkin1;
    public Pumpkin pumpkin2;
public Pumpkin pumpkin3;
    public static void main(String[] args) {
Factory a = new Factory();
    }     

    //special method: constructor
    public Factory(){
        System.out.println("Welcome to Ilona's Factory");
        System.out.println("the year founded is...");
        System.out.println(yearFounded);
        System.out.println("it is " + isOpen + "that the factory is Open");
        System.out.println("the owner is " + owner);
        //todo: print out who the owner is

        pumpkin1 = new Pumpkin();
        System.out.println(pumpkin1.color);
        System.out.println(pumpkin1.size);
        System.out.println("it is " + pumpkin1.isJackolantern + " the pumpkin is a Jacko lantern");
   pumpkin1.color = "blue";
        System.out.println(pumpkin1.color);
pumpkin2 = new Pumpkin();
        System.out.println(pumpkin2.color);
        pumpkin2.color = "Blue";
        pumpkin2.size = pumpkin1.size * 2;
        System.out.println(pumpkin2.size);

        pumpkin3 = new Pumpkin();
        System.out.println(pumpkin3.color);
        pumpkin3.color = "Green";
        System.out.println(pumpkin3.color);
        pumpkin3.size = 40;
        System.out.println(pumpkin3.size);
    }
}
