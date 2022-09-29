package Package1;


public class new_command {
    //    public static void cal(int x, int y) {
//        if (x > y) {
//            System.out.println(x * y);
//        }
//
//    }
//    public static void main(String[] args) {
//        cal(6, 5);
//    }
// }


//    public static int cal(int x, int y) {
//        int a; int b; int c;
//        a=x-y;
//        return a;
//    }
//
//    public static void main(String[] args) {
//        int t= cal(20, 10);
//        System.out.println(t);
//    }


    public static void cal() {
        System.out.println("Rahul Dravid");
    }

    public static void cal(int x) {               //int x - is called as parameter
        System.out.println("Rahul Dravid "+x);
    }

    public static void cal(String str) {   //this is called method overloading
        System.out.println(str);

    }

    public static void main(String[] args) {
        new_command m = new new_command();    //this is known as object initialization
        m.cal(19);
        m.cal("THE WALL");
    }
}

//dry-dont repeat ypurself (dont repeat the logic again and again)

