import java.util.Scanner;
public class Program8
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Enter the first integer"); 
        int firstInt = scanner.nextInt(); 
        
        System.out.println("Enter the second integer:"); 
        int secondInt = scanner.nextInt(); 
        
        int sum = firstInt + secondInt; 
        int difference = firstInt - secondInt; 
        int product= + firstInt*secondInt; 
        double average = (double)(firstInt + secondInt)/2.0; 
        int absoluteValue = Math.abs(difference); 
        int max = (firstInt + secondInt + Math.abs(firstInt - secondInt))/2; 
        int min = (firstInt + secondInt - Math.abs(firstInt - secondInt))/2; 
        
        
        System.out.println("sum is " +sum); 
        System.out.println("difference is "+difference);
        System.out.println("product is "+product);
        System.out.println("absolute value "+ absoluteValue);
        System.out.println("average is "+average);
        System.out.println("max is "+max);
        System.out.println("min is "+min);
        
     }
}


//Answer #4 below:
/*
Enter the first integer
13
Enter the second integer:
20
sum is 33
difference is -7
product is 260
absolute value 7
average is 16.5
max is 20
min is 13
