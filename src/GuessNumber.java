import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Please enter an integer between 1-100");
        //1.打印提示信息
        System.out.println("欢迎来打猜数字");
        //3.接受玩家输入的猜测数字
        Scanner scan = new Scanner(System.in);

        //重复游戏
        while (true) {

            //2.生成1-100之间的答案数字
            int answer = (int) (Math.random() * 100 + 1);


            //5.规定次数
            int chances = 7;
            int guess;
            while (chances > 0) {
                System.out.println("请输入1-100之间的整数，包括1和100,你还有" + chances + "机会:");
                try{
                    guess = scan.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("请输入数字!");
                    scan.next();
                    continue;
                }

                //4.比较一次并给出反馈
                if (guess == -1){
                    break;
                }else if (guess > answer) {
                    System.out.println("大了");
                } else if (guess < answer) {
                    System.out.println("小了");
                } else {
                    System.out.println("猜对了");
                    break;
                }
                chances = chances - 1;
            }
            System.out.println("再玩一次吗（y/n）");
            String again = scan.next();
            if (!again.equalsIgnoreCase("y")){
                break;
            }

        }
    }
}
