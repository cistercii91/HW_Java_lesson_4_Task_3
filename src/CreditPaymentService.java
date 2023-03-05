public class CreditPaymentService {

    public int calculate (int capital, double monthlyRate, int year) {
        int monthlyFee = (int)Math.round( capital * ( monthlyRate + ( monthlyRate / (Math.pow((1 + monthlyRate), year) - 1))));
        return monthlyFee;
    }
}

