package com.example.faraz_khan.bank2;

/**
 * Created by faraz-khan on 11/2/15.
 */
public class SavingsAccount extends BaseAccount {

    public SavingsAccount(String owner, int acc_num, int _id, String loanReasons) {
        super(owner, acc_num, "Current", _id, 500, 0.05, 0, loanReasons);
    }

}