public class FIFOQUEUE implements IQueuable {
    String[] fifoQueue;
    int i;
    public FIFOQUEUE(){
        fifoQueue= new String[20];
        i=0;
    }

    @Override
    public String[] enqueue(String value) {
        fifoQueue[i]=value;
        i++;
        return fifoQueue;
    }

    @Override
    public String dequeue() {
        String res_val= fifoQueue[0];
        int j=0;
        while (j<i-1){
            fifoQueue[j]=fifoQueue[j+1];
            j++;
        }
        i--;
        return res_val;
    }

    @Override
    public String[] getQueue() {
        int j = 0 ;
        String[] res = new String[i];
        while (j<i){
            res[j]=fifoQueue[j];
            j++;
        }

        return res;
    }

    @Override
    public int size() {
        return i;
    }
}
