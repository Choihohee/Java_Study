package ch01;
import java.util.Arrays;
public class sort {
    public static void main(String[] args){

        int [] arr = {5, 65, 6, 1, 51, 135, 93 };
        Arrays.sort(arr);
        System.out.println("Sorted arr[] : " + Arrays.toString(arr));
    }
}
