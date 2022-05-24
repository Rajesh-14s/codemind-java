import java.util.Scanner;
class p_t_c_v_c
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case'a':
            case'A':
            case'e':
            case'E':
            case'i':
            case'I':
            case'O':
            case'o':
            case'U':
            case'u':
                System.out.print("Vowel");
                break;
            default:
            System.out.print("Consonant");
        }
    }
}