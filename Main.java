package Company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<InsurancePolicy> list = new ArrayList<>();
        int a;
        while (true) {
            System.out.println(
                    "\n 1- Create Health Insurance Policy" +
                            "\n 2- Create Term-Life Insurance Policy" +
                            "\n 3- Exit");
            a = Scan.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Enter name of policy holder:");
                    String name = Scan.nextLine();
                    System.out.println("Enter deductible amount: ");
                    double deductible = Scan.nextDouble();
                    System.out.println("Enter co-payment amount: ");
                    double copay = Scan.nextDouble();
                    System.out.println("Enter total out-of-pocket amount:  ");
                    double oop = Scan.nextDouble();
                    list.add(new HealthInsurancePolicy(name, deductible, copay, oop));

                    break;
                case 2:
                    System.out.println("Enter name of policy holder: ");
                    String name2 = Scan.nextLine();
                    System.out.println("Enter name of beneficiary: ");
                    String child = Scan.nextLine();
                    System.out.println("Enter number of years in term: ");
                    int term = Scan.nextInt();
                    System.out.println("Enter amount of payout: ");
                    double payout = Scan.nextDouble();
                    list.add(new TermLifeInsurancePolicy(name2, child, term, payout));
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Error: Please enter valid input");
            }
            for (InsurancePolicy policy : list) {
                System.out.println("Policy Holder: " + policy.getPolicyHolder());
                System.out.println("Lolicy Number: " + policy.getPolicyNumber());

                if (policy.getClass().equals("HealthInsurancePolicy")) {
                    System.out.println("Met Deductible? " + ((HealthInsurancePolicy) policy).hasMetDeductible());
                    System.out.println("Met Out of Pocket? " + ((HealthInsurancePolicy) policy).hasMetTotalOutOfPocket());
                }


            }
        }
    }
}
