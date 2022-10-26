//Lab4ex1
import java.util.Scanner;
import java.util.Random;
public class CellPhoneService
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);//key board inputting tru scanner class
        System.out.println("Enter the Talk minutes");
        int talkmin=sc.nextInt();
        System.out.println("Enter the text mseesage");
        int textmsg=sc.nextInt();
        System.out.println("Enter the Gigabyte Data");
        int gbdata=sc.nextInt();
        if(talkmin<500 && textmsg==0 && gbdata==0)
            System.out.println("PLAN A IS RECOMMENDED FOR THIS USER at 49$ per month");
        else if(talkmin<500 && textmsg>0 && gbdata==0)
        {

            System.out.println("PLAN B IS RECOMMENDED FOR TE USER at 55$ permonth");
        }
        else if(talkmin>=500 && textmsg<100 && gbdata==0)
        {

            System.out.println("PLAN C IS RECOMMENDED FOR TE USER at 61$ permonth");
        }
        else if(talkmin>=500 && textmsg>=100 && gbdata==0)
        {

            System.out.println("PLAN D IS RECOMMENDED FOR TE USER at 70$ permonth");
        }
        else if(talkmin==0 && textmsg==0 && gbdata>0 && gbdata<2)
        {

            System.out.println("PLAN E IS RECOMMENDED FOR TE USER at 79$ permonth");
        }
        else if(talkmin==0 && textmsg==0 && gbdata>2)
        {

            System.out.println("PLAN F IS RECOMMENDED FOR TE USER at 87$ permonth");
        }
        int check=0; int count=0;
        int guess;
        Random rand = new Random();
        int upperbound = 25;
        int computernmb= rand.nextInt(upperbound);
        while(check==0) {
            count++;
            System.out.println("Enter the guess");
            guess=sc.nextInt();
            if(guess == computernmb)
            {
                check =1;
                System.out.println("You guessed the number");
                System.out.println("and the number of tries was"+count);
            }
            else {
                if (guess > computer) System.out.println("The number you said is too big");
                else System.out.println("he number you said is too small");
            }

        }
    }
}
