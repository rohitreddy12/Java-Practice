package Practice;

public class Calculator {
    private int sum(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int sum = 0;
        for(int num:nums){
            sum+=num;
        }
        return sum;
    }

    public int multiplication(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int mult = 1;
        for(int num:nums){
            mult*=num;
        }
        return mult;
    }

    public int subtraction(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int sub = 0;
        for(int num: nums){
            sub-= num;
        }
        return sub;
    }

    public void division(int n1, int n2){
        int remainder = n1%n2;
        int quotient = n1/n2;
        System.out.println("Remainder:" + remainder);
        System.out.println("Divisor: " + quotient);
    }

    public static void main(String[] args){
        Calculator c =new Calculator();
        System.out.println(c.sum(new int[] {1,2,3}));
    }
    

}
