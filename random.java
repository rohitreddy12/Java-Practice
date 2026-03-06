// class Solution{
//     int a = 10;
//     A obj = ()->{
//         System.out.println(a);
//     };
//     public static void main(String[] a){
//         Solution Sol = new Solution();
//         Sol.obj.print();
//     }

// }
// interface A{
//     public void print();
//     // public int check();
// }


class A{
    int num = 10;
}

class B extends A{
    static int num = 20;
}

public class random{
    public static void main(String[] args){
          A a = new A();
        //  B b = new B();
         System.out.print(a.num);
    }
   
    
}
