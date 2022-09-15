import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        FIFOQUEUE queue1 = new FIFOQUEUE();
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");
        queue1.enqueue("nabhaan");


        System.out.println(Arrays.toString(queue1.getQueue()));
        System.out.println(queue1.size());

        queue1.dequeue();
        System.out.println(Arrays.toString(queue1.getQueue()));
        System.out.println(queue1.size());
    }
}
