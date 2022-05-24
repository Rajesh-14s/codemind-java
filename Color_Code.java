import java.util.Scanner;
class color_code
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case'V':
            case'v':
                System.out.print("Violet");
                break;
            case'I':
            case'i':
                System.out.print("Indigo");
                break;
            case'b':
            case'B':
                System.out.print("Blue");
                break;
            case'g':
            case'G':
                System.out.print("Green");
                break;
            case'y':
            case'Y':
                System.out.print("Yello");
                break;
            case'o':
            case'O':
                System.out.print("Orange");
                break;
            case'r':
            case'R':
                System.out.print("Red");
                break;
            default:
            System.out.print("-1");
                
        }
    }
}