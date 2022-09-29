package Package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class new_command_assignment {
    public static void add(int x, int y) {
        System.out.println("Addition of both is " +(x+y));
    }

    public static void sub(int x, int y) {
        System.out.println("Subtraction of both is " +(x-y));
    }

    public static void mul(int x, int y) {
        System.out.println("Multiplication is " +(x*y));
    }

    public static void div(int x, int y) {
        System.out.println("Division of both is "+(x/y));
    }

    public static void even(int x, int y) {
        if (x % 2 == 0){
            System.out.println("x is even");
        }
    }

    public static void odd(int x, int y) {
        if (y%2==1){
            System.out.println("y is odd");
        }
    }

    public static void main(String[] args) throws IOException {
        int x; int y;

        System.out.println("Enter the numbers");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        x=Integer.parseInt(br.readLine());
        y=Integer.parseInt(br.readLine());

        new_command_assignment n= new new_command_assignment();

        n.add(x,y);
        n.sub(x,y);
        n.mul(x,y);
        n.div(x,y);
        n.even(x,y);
        n.odd(x,y);

    }
}
