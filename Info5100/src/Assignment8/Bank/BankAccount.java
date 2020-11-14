package Assignment8.Bank;
/*(Extra Credit)
        Write a BankAccount class which implements:
            deposit(int amount)
            withdraw(int amount)
            getBalance()
        Write a main function to simulate the bank system. Use multi threading to randomly deposit or withdraw random amount.*/

import java.util.Random;

@SuppressWarnings("ALL")
public class BankAccount implements Deposit, Withdraw, GetBalance{
    private String name;
    private int balance;
    //private int accountNum;
    //private HashMap<Integer, Integer> bankAccount = new HashMap<>();
    private int amount;
    private int dreamSavingAmount = 10;



    BankAccount(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

    public int randomAmount(){
        Random rand = new Random();
        int money = rand.nextInt(100);
        return money;
    }

    @Override
    public void deposit(int amount) {
        System.out.println(name + " Deposit amount $" + amount);
        balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        System.out.println(name + " Withdraw amount $" + amount);
        balance -= amount;
    }

    @Override
    public int getBalance() {
        System.out.println(name + " Balance is $" + balance);
        return balance;
    }

    @Override
    public String toString(){
        String s = "";
        s += "Hello " + name + ", Welcome to our Bank " +
                "\nYour initial balance is $" + balance + ".\n";
        return s;
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount("Jason", 1);
        System.out.println(a);
        BankAccount b = new BankAccount("Yuri", 1);
        System.out.println(b);
        BankAccount c = new BankAccount("Yeon", 1);
        System.out.println(c);
        BankAccount d = new BankAccount("Sakimura", 1);
        System.out.println(d);
        System.out.println("Who will reach the goal of Dream Saving Amount first??");
        int dreamSavingAmount = 10;
        //Object banker = new Object();

        Thread t1 = new Thread(()->{
               while(a.balance < dreamSavingAmount){
                    a.getBalance();
                    a.deposit(a.randomAmount());
                    a.withdraw(a.randomAmount());
                    a.getBalance();
               }
        });

        Thread t2 = new Thread(()->{
                while(b.balance < dreamSavingAmount){
                    b.getBalance();
                    b.deposit(b.randomAmount());
                    b.withdraw(b.randomAmount());
                    b.getBalance();
                }
        });

        Thread t3 = new Thread(()->{
                while(c.balance < dreamSavingAmount){
                    c.getBalance();
                    c.deposit(c.randomAmount());
                    c.withdraw(c.randomAmount());
                    c.getBalance();
                }
        });

        Thread t4 = new Thread(()->{
                while(d.balance < dreamSavingAmount){
                    d.getBalance();
                    d.deposit(d.randomAmount());
                    d.withdraw(d.randomAmount());
                    d.getBalance();
                }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (Exception e ){
            e.printStackTrace();
        }

    }
}