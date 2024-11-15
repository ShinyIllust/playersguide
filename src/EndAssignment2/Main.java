package EndAssignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int myInt = 0;
        long sumUneven = 0;
        long sumEven = 0;

        boolean getInt = true;

        while (getInt) {
            System.out.print("Geef een geheel positief getal: ");
            myInt = scanner.nextInt();
            if(myInt < 0){
                System.out.println("Dat getal is negatief.");
            } else {
                getInt = false;
            }
        }

        for(int i = 1; i <= myInt; i++){
             if(i % 2 == 0){
                 sumEven += i;
             } else {
                 sumUneven += i;
             }
        }

        System.out.println("som van oneven getallen tot en met " + myInt + " is " + sumUneven);
        System.out.println("som van even getallen tot en met " + myInt + " is " + sumEven);
        System.out.println("verschil tussen twee sommen is " + (sumUneven - sumEven));
    }
}
