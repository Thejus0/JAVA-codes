package Package1;

public class varchar_method {

    public static int add(int ...numbers){    // varchar   int[] numbers={2,4,5,4,5}


            int addition=0;
            for (int j=0; j<numbers.length; j++){   // o,1,2,3,4
                addition=addition+numbers[j];
            }return addition;
        }

        public static void main(String[] args) {

            varchar_method a= new varchar_method();

            System.out.println(a.add(1,2,3,4,5,6)); // array and array list // static and other one is dynamic


        }
    }

