public class CreditPaymentService {
    public double calculate(int sum, int monthCount, double percent) {

        double p = percent/100/12;

        double monthPayment =  sum * (p + (p/(Math.pow((1+p), monthCount) -1)));
        return monthPayment;
    }
}
