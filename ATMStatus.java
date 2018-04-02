package by.Itacademy.OOP_in_Java;

public class ATMStatus implements ATM_Info {

    int hundreds;
    int fifties;
    int twenties;

    @Override
    public void cacheInfo(int sum) {
        System.out.println("Current ammount of money in ATM is "+sum);
    }

    @Override
    public void banknotesInfo(int hundreds, int fifties, int twenties) {
        System.out.println("Cuttenntly ATM contains "+hundreds+" $100 banknotes, "+fifties+" $50 banknotes and "+twenties+" $20 banknotes");
    }

    @Override
    public void ATMProduserAndOwnerInfo() {
        System.out.println("This ATM was produced by IBM Co., and belongs to Chase Manhattan Bank!");
    }
}

