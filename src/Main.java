
public class Main {
    public static void main(String[] args) {
        Que que = new Que(5);
        que.deQueue();
        for(int ind = 0; ind < 5; ++ind) {
            que.enQueue(ind);
        }
        que.enQueue(5);
        que.display();
        que.deQueue();
        que.display();
    }
}