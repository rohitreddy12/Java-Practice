package ArrayOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayOperations {
    private ArrayList<Integer> arr;

    ArrayOperations(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    public boolean search(int num) {
        for (int i = 0; i < this.arr.size(); i++) {
            if (this.arr.get(i) == num) {
                return true;
            }
        }
            return false;
    }

    public ArrayList<Integer> sort(){
        Collections.sort(this.arr);
        return this.arr;
    }

    public ArrayList<Integer> reverse(){
        int left=0;
        int right=this.arr.size()-1;
        while(left<right){

            int temp = arr.get(left);
            arr.set(left,arr.get(right));
            arr.set(right,temp);
            left++;
            right--;
        }
        return this.arr;
    }

    static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations(new ArrayList<Integer>(Arrays.asList(1,23,34,12,4,5)));
        boolean res = arr.search(5);
        System.out.println(res);
        System.out.println(arr.sort());
        System.out.println(arr.reverse());
    }
}