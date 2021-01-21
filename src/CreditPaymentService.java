public class CreditPaymentService {
    public int calculate(int loanAmount, int term, double rate) {
        double monthRate = rate / 100 / 12;
        int monthTerm = term * 12;
        int payment = (int) (loanAmount * (monthRate + (monthRate / (Math.pow(1 + monthRate, monthTerm) - 1))));
        return payment;
    }
}
