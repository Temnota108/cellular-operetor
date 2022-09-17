public class Main {
    public static void main(String[] args) {
        System.out.println("Получи рубль за каждые 100!");

        int сurrentAccount = 100; // счет
        int refill = 1100; // Пополнение
        int totalAccount = (сurrentAccount + refill); //текущий счет
        if (refill > 1000) {

            int bonus = refill / 100; // расчет бонуса
            System.out.println("Ваш бонус = " + bonus);
            System.out.println("Ваш текущий счет = " + (totalAccount + bonus)); //текущий счет с бонусом
        } else {
            System.out.println("Ваш текущий счет = " + totalAccount);
        }
    }
}
