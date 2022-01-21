//package lcm;

import java.util.Scanner;

public class LCM {

        public static void main(String[] args) {

            int firstNo,secondNo;

            Scanner numbers = new Scanner(System.in);

            firstNo = numbers.nextInt();
            secondNo = numbers.nextInt();
            int firstMove=firstNo;
            int secondMove=secondNo ;

            while (secondMove != firstMove) {
                if (secondMove > firstMove)
                    firstMove +=firstNo;
                else
                    secondMove +=secondNo;
            }

            System.out.println("LCM is " + secondMove);
        }


}

