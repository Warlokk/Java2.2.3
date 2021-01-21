public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Платеж на 1 год: " + payment);

        int payment2 = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Платеж на 2 года: " + payment2);

        int payment3 = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Платеж на 3 года: " + payment3);
    }
}
