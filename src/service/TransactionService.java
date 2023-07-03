package service;

import model.Transaction;
import model.Wallet;
import respository.WalletRepository;

public class TransactionService {

    public static void sendMoney(Transaction t) {

        Wallet senderWallet = WalletRepository.getUserWallet(t.getFromUser());
        Wallet receiverWallet = WalletRepository.getUserWallet(t.getToUser());

        Double balance1 = senderWallet.getBalance();
        Double balance2 = receiverWallet.getBalance();

        if (t.getAmountToTransfer() <= balance1) {
            senderWallet.setBalance(balance1 - t.getAmountToTransfer());
            receiverWallet.setBalance(balance2 + t.getAmountToTransfer());
            senderWallet.getTransactions().add(t);
            receiverWallet.getTransactions().add(t);
            System.out.println("Amount transferred successfully to " + t.getToUser());
        }
        else {
            System.out.println("Not Enough Balance to Transfer the money");
        }
    }
}
