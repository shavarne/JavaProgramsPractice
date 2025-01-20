public class FibonacciSeries {

    public static void main(String[] args) {

        int a= 0;
        int b= 1;
        int c;

        for(int i =0 ; i<5 ; i++){

            c= a+b; //formula
            System.out.println(c);
            a=b;  //formula to a+b hai jahan pe a agla number hai aur b sum hai toh agla number b se mil jayega aur sum C se nikal jayga
            b=c;

        }

    }
}
