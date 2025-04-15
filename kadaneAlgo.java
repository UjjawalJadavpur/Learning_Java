
public class kadaneAlgo {

    
    
    public static int MaxSumSubArray( int [] arr )
    {
        int maxSum = arr[0];
        int result = arr[0];
        int n = arr.length;

        for(int i=1; i<n; i++)
        {
            maxSum = ( (maxSum + arr[i] ) > arr[i] ) ?  ( maxSum + arr[i] ) : arr[i];
            result = ( maxSum > result ) ? maxSum : result ; 
        }

        return result;
    }

    public static int MaxProductSubArray ( int [] arr )
    {
        int maxProduct   = Integer.MIN_VALUE;
        int leftPointer  = 1;
        int rightPointer = 1;
        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            if( leftPointer == 0)
              leftPointer =1;
            if ( rightPointer == 0)
              rightPointer =1 ;
            
            leftPointer = leftPointer * arr[i];
            if( leftPointer > maxProduct)
              maxProduct = leftPointer;

            int j = n-i-1;
            rightPointer = rightPointer * arr[j];
            if( rightPointer > maxProduct)
              maxProduct = rightPointer;
            
        }

        return  maxProduct;
    }


    public static void main(String[] args) 
    {
        int[] arr = { -2, 6, -3, -10, 0, 2 };

        System.out.println("Maximum Sum for SubArray is : - " + MaxSumSubArray(arr));
        System.out.println("Maximum Sum for SubArray is : - " + MaxProductSubArray(arr));

    }

}
