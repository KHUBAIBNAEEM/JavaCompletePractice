package POLYMORPHISM; 

abstract class Payment { // abstract class ka object nhi banaskte but refence banaskte hain
    abstract void pay(); // iska mtlb k ye agar koi implement karega tou usko is mthod chalana parhega
}

class CreditCardPayment extends Payment {
    void pay() {
        System.out.println("Paying by Credit Card");
    }
}

class NfcPayment extends Payment {
    void pay() {
        System.out.println("Paying by Nfc");
    }
}

public class PolymorphismAbstract {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment(); // abstract class ka refernce dia hai but obj child ka banaya hai
        Payment nfPayment = new NfcPayment();

        creditCardPayment.pay(); 
        nfPayment.pay();
    }
}