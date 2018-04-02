package by.Itacademy.OOP_in_Java;

import java.util.Scanner;

public class ATM_Main {

    public static void main(String[] args) {
       
        CashDeposit cashDeposit=new CashDeposit();
        ATMStatus atmStatus=new ATMStatus();
        CashWithdrawal cashWithdrawal=new CashWithdrawal();


        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the sum you want to add to ATM. Be aware that ATM accepts $100, $50, $20 banknotes only");

        cashDeposit.setSum(scanner.nextInt());
        while (cashDeposit.getSum()%100%50%20!=0) {
            System.out.println("You entered the incorrect sum! Please repeat the enter!");
            cashDeposit.setSum(scanner.nextInt());
        }
        atmStatus.cacheInfo(cashDeposit.getSum());
        atmStatus.banknotesInfo(cashDeposit.cashInHundreds(cashDeposit.getSum()),cashDeposit.cashInFifties(cashDeposit.getSum()),cashDeposit.cashInTwenties(cashDeposit.getSum()) );
        System.out.println("Enter the sum you would like to withdraw. Be aware that ATM contains $100, $50, $20 banknotes only ");
        cashWithdrawal.setSum(scanner.nextInt());
        while (cashWithdrawal.getSum()>cashDeposit.getSum()){
            System.out.println("Insufficient funds in ATM to meet your request! Please repeat the enter!");
            cashWithdrawal.setSum(scanner.nextInt());
        }
        atmStatus.cacheInfo(cashDeposit.getSum()-cashWithdrawal.getSum());
        atmStatus.banknotesInfo(cashWithdrawal.CashOutHundreds(cashDeposit.getSum()-cashWithdrawal.getSum()),cashWithdrawal.CashOutFifties(cashDeposit.getSum()-cashWithdrawal.getSum()),cashWithdrawal.CashOutTwenties(cashDeposit.getSum()-cashWithdrawal.getSum()) );

        atmStatus.ATMProduserAndOwnerInfo();
    }
}
