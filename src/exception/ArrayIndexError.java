package exception;

import java.util.Arrays;

public class ArrayIndexError {
    public static void main(String[] args) {

        int[] arrays = {1,2,3,4,5};
        try{
            System.out.println(arrays[8]);
        }
        catch (Exception exc){
            throw new ArrayIndexOutOfBoundsException("invalid size");
        }
    }
}
