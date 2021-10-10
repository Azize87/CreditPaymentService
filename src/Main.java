public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthSum1 = service.calculate(1000000, 12, 9.99);
        double monthSum2 = service.calculate(1000000, 24, 9.99);
        double monthSum3 = service.calculate(1000000, 36, 9.99);

        System.out.println(monthSum1);
        System.out.println(monthSum2);
        System.out.println(monthSum3);
    }
}
