package model;

import java.time.LocalTime;
import java.util.Objects;

public class Transaction {
    private String fromUser;
    private String toUser;
    private Double amountToTransfer;
    private LocalTime atTime;

    public Transaction(String fromUser, String toUser, Double amountToTransfer, LocalTime atTime) {
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.amountToTransfer = amountToTransfer;
        this.atTime = atTime;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public Double getAmountToTransfer() {
        return amountToTransfer;
    }

    public void setAmountToTransfer(Double amountToTransfer) {
        this.amountToTransfer = amountToTransfer;
    }

    public LocalTime getAtTime() {
        return atTime;
    }

    public void setAtTime(LocalTime atTime) {
        this.atTime = atTime;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "fromUser='" + fromUser + '\'' +
                ", toUser='" + toUser + '\'' +
                ", amountToTransfer=" + amountToTransfer +
                ", atTime=" + atTime +
                '}';
    }
}
