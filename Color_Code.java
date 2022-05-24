import java.util.Scanner;
class c_c
{
    public static void main(String ram[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case'v':
            case'V':
                System.out.print("Violet");
                break;
            case'i':
            case'I':
                System.out.print("Indigo");
                break;
            case'B':
            case'b':
                System.out.print("Blue");
                break;
            case'G':
            case'g':
                System.out.print("Green");
                break;
            case'Y':
            case'y':
                System.out.print("Yellow");
                break;
            case'O':
            case'o':
                System.out.print("Orange");
                break;
            case'R':
            case'r':
                System.out.print("Red");
                break;
            default:
                System.out.print("-1");
        }
    }
}