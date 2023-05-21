package hw7;

public class Main07 {

    public static void main(String[] args) {
        SubscriberServiceImpl subGenServ = new SubscriberServiceImpl();
        Subscriber[] subs = SubGen.generateSubArray();

        System.out.println("Абоненти, у яких час внутрішньоміських розмов перевищує заданий: ");
        subGenServ.infoSubscriberLimitExceeded(subs, 100);
        System.out.println("\nАбоненти, які користувалися міжміським зв'язком:");
        subGenServ.usedInternationalCalls(subs, 0);
        System.out.println("\nАбоненти де перший бука <U>: ");
        subGenServ.subscriberDataSearchByLetter(subs, 'U');
        System.out.println("\nСумарне споживання трафіку інтернету");
        subGenServ.totalTrafficForTheCity(subs, "Kiev");
        System.out.println("\nКількість абонентів з негативним балансом");
        subGenServ.subscribersWithNegativeBalance(subs);

    }
}
