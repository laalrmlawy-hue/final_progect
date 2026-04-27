package com.mycompany.javaoop;

public class Account {

    private String name;
    private float amount;
    private int accountNo;

    public void insert(String n,  int ac, float a) {
        this.name = n;
        this.accountNo = ac;
        this.amount = a;
    }
    //عند الاضافة رصيد للحساب (الزيادة )

    public void deposit(float a) {
        this.amount = this.amount + a;
        System.out.println(a + " deposit");
    }

    //عند السحب من الحساب (خصم )
    public void withdraw(float a) {
        if (amount < a) { //التحقق اذا كان المتوفر   اكثر من السحب 
            System.out.println("the balance is not enough");
        } else {
            this.amount = this.amount - a;
            System.out.println(a + " withdraw");
        }

    }

    @Override
    public String toString() {
        return "{" + "name=" + name + ", amount=" + amount + ", accountNo=" + accountNo + '}';
    }

}
