import java.util.*;

class Check{
    public static void main(String args[]){
        // int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give 2 numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        eq(n1,n2);
    }

    public static void eq(int num1, int num2){
        if(num1==num2){
            System.out.println("Equal Numbers");
        }
        else{
            System.out.println("Not equal");
        }
    }
}