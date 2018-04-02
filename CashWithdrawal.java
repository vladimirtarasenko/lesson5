package by.Itacademy.OOP_in_Java;

public class CashWithdrawal implements CashOut {
private int hundreds=0;
private int fifties=0;
private int twenties=0;
private int sum;

    public int getSum() {
        return sum;
    }
    public void setSum( int sum){
        this.sum=sum;
    }

    @Override
    public int CashOutHundreds(int sum) {
        if (sum > 100) {
            hundreds = sum / 100;
            int restSum = sum % 100;
            if (restSum > 0 && restSum == 50) {
                fifties = (sum % 100) / 50;
            }
            if (restSum > 0 && restSum != 50) {
                twenties = sum % 100 % 500 / 20;
            }
        }
        if (sum < 100 && sum >= 50) {
            fifties = sum / 50;
            if (sum % 50 != 0) {
                twenties = sum % 50 / 20;
            }
        }
        if (sum<50){
            twenties=sum/20;
        }

        return  hundreds;
    }

    @Override
    public int CashOutFifties(int sum) {
        if (sum > 100) {
            hundreds = sum / 100;
            int restSum = sum % 100;
            if (restSum > 0 && restSum == 50) {
                fifties = (sum % 100) / 50;
            }
            if (restSum > 0 && restSum != 50) {
                twenties = sum % 100 % 500 / 20;
            }
        }
        if (sum < 100 && sum >= 50) {
            fifties = sum / 50;
            if (sum % 50 != 0) {
                twenties = sum % 50 / 20;
            }
        }
        if (sum<50){
            twenties=sum/20;
        }

        return fifties;
    }

    @Override
    public int CashOutTwenties(int sum){
        if (sum > 100) {
            hundreds = sum / 100;
            int restSum = sum % 100;
            if (restSum > 0 && restSum == 50) {
                fifties = (sum % 100) / 50;
            }
            if (restSum > 0 && restSum != 50) {
                twenties = sum % 100 % 500 / 20;
            }
        }
        if (sum < 100 && sum >= 50) {
            fifties = sum / 50;
            if (sum % 50 != 0) {
                twenties = sum % 50 / 20;
            }
        }
        if (sum<50){
            twenties=sum/20;
        }

        return twenties;
    }
}



