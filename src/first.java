public class first {
    public static void main(String[] args){
        worker john = new worker();
        boss bob = new boss();

        john.getPaid();
        john.doWork();
        bob.getPaid();
        bob.doWork();

    }
}
