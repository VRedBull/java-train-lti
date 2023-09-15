import java.util.*;

class Operation{
    public static void main(String args[]){
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give 3 numbers:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        int n3=sc.nextInt();
        System.out.println("addition="+add(n1,n2,n3));
        System.out.println("subtraction="+sub(n1,n2,n3));
        System.out.println("multiplication="+mul(n1,n2,n3));
        System.out.println("Average="+avg(n1,n2,n3));
    }

    public static int add(int num1, int num2, int num3){
        int x = num1+num2+num3;
        return x;
    }

    public static int sub(int num1, int num2, int num3){
        int x = num1-num2-num3;
        return x;
    }
    public static int mul(int num1, int num2, int num3){
        int x = num1*num2*num3;
        return x;
    }
    public static int avg(int num1, int num2, int num3){
        int x = add(num1,num2,num3)/3;
        return x;
    }
}