import java.util.Scanner;
public class passwordstrength
{
    public static void main(String[] args)
    {
        int upChars = 0;
        int lowChars = 0;
        int special = 0;
        int digits = 0;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Password: ");
        String password = sc.nextLine();
        int total = password.length();
        for(int i=0; i<total; i++)
        {
            ch = password.charAt(i);
            if(Character.isUpperCase(ch))
                upChars = 1;
            else if(Character.isLowerCase(ch))
                lowChars = 1;
            else if(Character.isDigit(ch))
                digits = 1;
            else 
                special = 1;
        }
        if(upChars==1 && lowChars==1 && digits==1 && special==1)
        {
            if(total>8)
            {
                System.out.println("The Password is Strong");
            }
            else if(total<8 && total>=6)
            {
                System.out.println("The Password is Medium");
            }
            else if(total<6)
            {
                System.out.println("The Password is Weak");
            }
        }
        else
        {
            System.out.println("Invalid Password!");
        }
            
    }
}