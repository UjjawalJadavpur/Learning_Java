public class PlayWithJava {
    
    public static long factorial(int number)
    {
        long result = 1;

        if( number == 0 || number == 1 )
          return  result;
        
        while( number > 0 )
        {
            result = result * number ;
            number--;
        }

        return result;
    }

    public static int[] swap(int a, int b) 
    {
        int temp = a;
        a = b;
        b = temp;
        return new int[] {a, b};
    }

    public static int gcd( int a, int b)
    {
        while(b !=0 )
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
