public class Main {
    public static void main(String[] args) {
        BonusMilesCervice service = new BonusMilesCervice();
        int price = 10_000; // Цена билета
        int miles = service.calculate(price);
        System.out.println("Бонусные мили:" + miles);
    }
}

