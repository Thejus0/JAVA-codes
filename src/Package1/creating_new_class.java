package Package1;

class Thejus {
    int id; String name;
    public void det() {
        System.out.println("Your id is "+id);
        System.out.println("Your name is "+name);
    }
    public void num() {
        int x=id+10;
        System.out.println("id+10 = "+x);
        System.out.println("Length of your name is "+name.length());
    }
    public void num1() {
        int y=id;
        if (y%2==0) {
            System.out.println("Given id is an even number");
        }
    }
}
public class creating_new_class {
    public static void trainer() {
        System.out.println("Sushantha is teaching us JAVA");
    }
    public static void main(String[] args) {
        creating_new_class m=new creating_new_class();
        m.trainer();

        Thejus t=new Thejus();
        t.id=222; t.name="Thejus";
        t.det();
        t.num();
        t.num1();
    }

}
