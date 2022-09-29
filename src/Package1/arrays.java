package Package1;

import java.util.ArrayList;

public class arrays {
//    public static void main(String[] args) {
//        String[] str=new String[5];
//        str[0]="Jan";
//        str[1]="Feb";
//        str[2]="Mar";
//        str[3]="Apr";
//        str[4]="May";
//
//            System.out.println(str.length);
//            for (int i=0;i< str.length;i++) {
//                System.out.println(str[i]);
//            }

//        int[] j=new int[5];
//        j[0]=1;
//        j[1]=2;
//        j[2]=3;
//        j[3]=4;
//        j[4]=5;
//
//        for (int i=0;i<5;i++){
//            System.out.println(j[i]);
//        }

//        ArrayList<Integer> i=new ArrayList<Integer>();
//        i.add(10);
//        i.add(20);
//        i.add(30);
//        i.add(40);
//        i.add(50);
//        System.out.println(i);

//        ArrayList<String> str=new ArrayList<String>();
//        str.add("Monday");
//        str.add("Tuesday");
//        str.add("Wednesday");
//        str.add("Thursday");
//        str.add("Friday");
//        str.add("Saturday");
//        str.add("Sunday");
//        System.out.println(str);
//    }
//}

    public static void main(String[] args) {
        int[] i={2,3,4,5,6};            //length of array is 5
        int product=1;
        for (int j=0;j<i.length;j++){       //j=0,1,2,3,4
            product=product*i[j];        //1*2=2, 2*3=6, _______________
        }
        System.out.println(product);
    }
}
