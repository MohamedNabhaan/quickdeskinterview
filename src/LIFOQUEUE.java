public class LIFOQUEUE implements IQueuable {
    String[] lifoQueue;
    int i;

    public LIFOQUEUE(){
        lifoQueue = new String[20];
        i=0;
    }

    @Override
    public String[] enqueue(String value) {
        lifoQueue[i]=value;
        i++;
        return lifoQueue;
    }

    @Override
    public String dequeue() {
        String res_val= lifoQueue[i];
        lifoQueue[i]=null;
        i--;
        return res_val;
    }

    @Override
    public String[] getQueue() {
        int j = 0 ;
        String[] res = new String[i];
        while (j<i){
            res[j]=lifoQueue[j];
            j++;
        }
        return res;
    }

    @Override
    public int size() {
        return i;
    }
}
