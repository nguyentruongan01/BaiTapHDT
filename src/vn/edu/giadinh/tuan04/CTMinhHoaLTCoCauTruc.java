package vn.edu.giadinh.tuan04;

public class CTMinhHoaLTCoCauTruc {
        public static void show(int number, int balance){
                System.out.println("Account Number = " +number);
                System.out.println("Account Balance = " +balance);
        }
    public static void main(String[] args) {
            int account_number = 20;
            int account_balance = 100;
            account_balance = account_balance + 100;
            show(account_number, account_balance);

            account_balance = account_balance - 50;
            show(account_number, account_balance);

            account_balance = account_balance -10;
            show(account_number, account_balance);
        
    }
    
}
