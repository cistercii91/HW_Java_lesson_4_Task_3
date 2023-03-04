public class CreditPaymentService {

    public int calculate (int a, double b, int c) {
        int MonthlyFee = (int)Math.round( a * ( b + ( b / (Math.pow((1 + b),c) - 1))));
        return MonthlyFee;
    }
}

