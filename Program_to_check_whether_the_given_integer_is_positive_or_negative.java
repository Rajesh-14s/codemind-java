import java.util.Scanner;
class positve_negitive
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<0)
        System.out.print("Negative Number");
        else
        System.out.print("Positive Number");
    }
}