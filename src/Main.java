public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CreditPaymentService service = new CreditPaymentService();
        int capital = 1000000;
        double annualRate = 9.99;
        int year = 36;
        double monthlyRate = (annualRate / 12)/100;
        int result = service.calculate(capital, monthlyRate, year);
        System.out.println("Ваша месячная плата составляет " + result);


    }
}