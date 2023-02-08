public class Main {
    public static void main(String[] args) {

        int start = 600;
        int amount = 1345;
        int bonus;

        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        int totalAmount = start + amount + bonus;

        System.out.println("Начислено бонусов: " + bonus);
        System.out.println("Сумма на счете: " + totalAmount);


    }
}
