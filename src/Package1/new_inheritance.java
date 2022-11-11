package Package1;
    class med{    // parent

        public int cal(int x, int y){
            int d=4;
            return x+y;
        }
    }

    class med1 extends med{      //child
        private int d;
        public boolean setName(int d){
            int sum=d+4;
            med1 a=new med1();
            System.out.println(a.setName(4));
            return false;
        }

        public int cal_adv(int x, int y){

            return x-y;
        }
    }
    class med2 extends med1{    // parent

        public int cals(int x, int y){
            return x*y;
        }
    }
    public class new_inheritance {
        public static void main(String[] args) {
            med2 m= new med2();

            System.out.println(m.cal(20,10));
            System.out.println(m.cal_adv(20,10));
            System.out.println(m.cals(20,10));



        }
    }

