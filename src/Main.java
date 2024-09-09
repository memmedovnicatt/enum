import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Meat[] meats = Meat.values();
            for (int i = 0; i < meats.length; i++) {
                System.out.println(i + 1 + "." + meats[i]);
            }
            try {
                System.out.print("Choose something : ");
                int choice = scanner.nextInt();
                if (choice > 3) {
                    throw new CustomerException("wrong choice");
                }
                if ((Character.isDigit(choice))) {
                    throw new CustomerException("please enter integer");
                }
                Meat selected = meats[choice - 1];
                System.out.println(selected);
                System.out.print("Enter weight : ");
                int weight = scanner.nextInt();
                scanner.nextLine();
                if (weight > selected.getWeight()) {
                    throw new CustomerException("weight exception");
                } else {
                    System.out.println("has enough weight");
                }
            } catch (InputMismatchException e) {
                try{
                    throw new CustomerException("s");
                }catch (CustomerException ex){
                    System.out.println(ex.getMessage());

                }
            }


            while (true) {
                System.out.print("yes for continue,no for stop : ");
                Scanner scanner2 = new Scanner(System.in);
                String txt = scanner2.nextLine();
                if (txt.equals("no")) {
                    return;
                } else if (txt.equals("yes")) {
                    break;
                } else {
                    System.out.println("only yes or no");
                }
            }
        }
    }
}