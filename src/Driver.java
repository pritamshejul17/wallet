import model.Transaction;
import model.User;
import model.Wallet;
import respository.WalletRepository;
import service.RegisterUser;
import service.TransactionService;

import java.time.LocalTime;

public class Driver {

    public static void main(String[] args) {
        RegisterUser user1 = new RegisterUser("John", 100.00);
        RegisterUser user2 = new RegisterUser("David", 10.00);

        Double b3 = WalletRepository.getUserWallet("John").getBalance();
        Double b4 = WalletRepository.getUserWallet("David").getBalance();

        System.out.println("John -> " + b3);
        System.out.println("David -> " + b4);

        Transaction t = new Transaction("John", "David", 90.00, LocalTime.now());

        TransactionService.sendMoney(t);

        Double b1 = WalletRepository.getUserWallet("John").getBalance();
        Double b2 = WalletRepository.getUserWallet("David").getBalance();

        System.out.println("John -> " + b1);
        System.out.println("David -> " + b2);

        WalletRepository.accountStatement("John");
        WalletRepository.accountStatement("David");

    }
}
