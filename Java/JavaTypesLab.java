public class JavaTypesLab {
    public static void main(String[]args) {
        //part 1
        int firstInt = 6;
        int secondInt = 20;
        int thirdInt = 10;
        float A = 4.4f;
        boolean isCold = true;
        double b = 1_000_000d;

        System.out.println(firstInt);
        System.out.println(secondInt);
        System.out.println(thirdInt);
        System.out.println(A);
        System.out.println(isCold);
        System.out.println(b);

        //part 2
        int add = (firstInt + secondInt);
        int add2 = (firstInt + thirdInt);

         int divide = firstInt/secondInt;
         System.out.println(divide);

         int remainder = firstInt%secondInt;
         System.out.println(remainder);

         int increment = remainder+firstInt;
         increment++;
         System.out.println(increment);

         //part 3
         int x = 100;
         boolean variable =  x == 100;
         int y = 106;
         System.out.println(x > y);
         System.out.println(y > x);
         System.out.println(x >= y - 6);

         int z = 92;
         System.out.println(x < y && y < z);
         System.out.println(y < z && x >= y);
         System.out.println(z > (y + x) || (x - y)< z);
         if( (x < y) ==  !(x >y)){
            System.out.println("true");
        }else{
             System.out.println("false");
        }
        //part 4
         int n = 64;
         System.out.println(n >>1 == n/2);
         System.out.println( n <<1 == n*2);
         n= 40;
        System.out.println(n >>1 == n/2);
        System.out.println(n <<1 == n*2);
        System.out.println((n<<2 == n*4 ) &&(n>>2 == n/4));
        n = 31;
        System.out.println(n >>1 == n/2);
        System.out.println(n <<1 == n*2);
        System.out.println((n<<2 == n*4 ) &&(n>>2 == n/4));

        anotherMethod();
        playwithStrings();
    }
    public static void anotherMethod()
    {
        //part 5 & 6
        Integer g = 55;
        Integer l = Integer.valueOf("1000");
        if (g.compareTo(l) > 0){
            int e = g/2;
            System.out.println(g + " is a Big Value");
            System.out.println(e + " is half a Big Value");
        }else{
            int e = g/2;
            System.out.println(e + " is definitely small");
            System.out.println( g + " is not a big value");
        }
    }

    // part 7
    public static void playwithStrings(){
        String firstName = "Bruice";
        String lastName =  "Jonson";
        System.out.println("Hello"+ " " +firstName +" "+lastName);
        String fullname = firstName + " " + lastName;
        System.out.println(String.format("The total length of the %s is %s.",
                fullname,
                fullname.length()));
        System.out.println(String.format("The String %s having an 'o' at the position of %s.",
                fullname,
                fullname.indexOf("o")));
        System.out.println(String.format("The String %s contains a %s at the 7th position.",
                fullname,
                fullname.charAt(7)));
        System.out.println(String.format("The String %s contains 'son' is %s.",
                fullname,
                fullname.contains("son")));
        System.out.println(String.format("The last 5 characters in th String %s is %s.",
                fullname,
                fullname.substring(8,13)));
        System.out.println(String.format("The String %s contains a - or ' is %s.",
                fullname,
                (fullname.contains("-") || fullname.contains(" ' "))));

    }

}
