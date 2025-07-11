public class Main {
    public static void main(String[] args) {
        // Переменная для хранения стоимости билета
        int ticketPrice = 13676; // Пример стоимости билета

        // Количество рублей для одной бонусной мили
        int rublesPerMile = 20;

        // Рассчитываем количество бонусных миль
        int bonusMiles = ticketPrice / rublesPerMile;

        // Выводим результат на экран
        System.out.println("За купленный билет начислено " + bonusMiles + " бонусных миль");
    }
}