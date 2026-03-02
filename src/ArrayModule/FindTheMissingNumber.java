package ArrayModule;

import java.util.Arrays;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int []arr={5, 3, 2, 5, 1};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                System.out.println("The missing "+ (i+1));
            }
        }
    }
}
