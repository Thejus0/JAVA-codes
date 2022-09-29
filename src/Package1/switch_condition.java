package Package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class switch_condition {
    public static void main(String[] args) throws IOException {
        int x,y,z;
        System.out.println("Enter any number");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        z=Integer.parseInt(br.readLine());
        x=Integer.parseInt(br.readLine());
        y=Integer.parseInt(br.readLine());

        switch (z){
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                System.out.println(x/y);
                break;

        }


    }
}
