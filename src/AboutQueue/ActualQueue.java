package AboutQueue;

public class ActualQueue {
    public static void main(String[] args) {
        QueueLogic<String> rationQueue = new QueueLogic<String>();

        rationQueue.enqueue("dilshad");
        rationQueue.enqueue("nirmal");
        rationQueue.enqueue("kiran");

        System.out.println("-----------");
        rationQueue.display();

        rationQueue.dequeue();
        
        System.out.println("-----------");
        rationQueue.display();

    }
}
