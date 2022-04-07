import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to GuessNumber!");
        System.out.println("Please enter an integer between 1-100");
        int answer=(int)(Math.random()*100+1);
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        if(guess>answer){
            System.out.println("Big!");
        }else if(guess<answer){
            System.out.println("Small!");
        }else{
            System.out.println("Congratulations!You Guessed It Right!~~");
        }
    }
}
