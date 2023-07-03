package respository;

import model.Transaction;
import model.User;
import model.Wallet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WalletRepository {

    private static WalletRepository walletRepo;
    private  static final Map<String, Wallet> userRepo = new HashMap<String, Wallet>();

    public static void add(User user) {
        userRepo.put(user.getUserName(), user.getWallet());
    }

    public static Wallet getUserWallet(String userName) {
        return userRepo.get(userName);
    }

    public static void accountStatement(String userName) {
        Wallet wallet =  userRepo.get(userName);
        for (Transaction t : wallet.getTransactions()) {
            System.out.println(t);
        }
    }
}
