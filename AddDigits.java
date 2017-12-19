import java.util.Scanner;
public class AddDigits
{
public static void main(String arg[])
{
Scanner input =new Scanner(System.in);
System.out.println("Enter integer between 0-1000 :");

float num=input.nextInt();
int num=input .nextInt();


int sum=0;
sum +=sum%10;
num/=10;
sum+=num%10;
num/=10;
sum+=num%10;
System.out.println("Total of the Digits :"+sum);
}
}


import java.util.Scanner;
public class AddDigits
{
public static void main(String arg[])
{
Scanner input =new Scanner(System.in);
System.out.println("Enter integer between 0-1000 :");

float num=input.nextInt();
int num=input .nextInt();


int sum=0;
sum +=sum%10;
num/=10;
sum+=num;
sum+=num%10;
System.out.println("Total of the Digits :"+sum);
}
}




import java.util.Scanner;
public class AddDigits
{
public static void main(String arg[])
{
Scanner input =new Scanner(System.in);
System.out.println("Enter integer between 0-1000 :");

int num=input .nextInt();


int sum=0;
sum +=sum%10;
num/=10;

sum+=num%10;
System.out.println("Total of the Digits :"+sum);
}
}




