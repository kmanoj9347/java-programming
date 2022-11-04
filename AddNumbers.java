import java.util.Scanner;
class AddNumbers{
    public static void main(String[]args){
int num1,num2,sum;
System.out.println("Enter two numbers to calculate sum : ");
Scanner sc =new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
sum= num1+num2;
System.out.println(sum);
}
}