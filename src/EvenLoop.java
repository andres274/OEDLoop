public class EvenLoop {
    public static void main (String[] args) {

        int n = 0;
        while  (n<=100) {
            System.out.print ( "  " + n );
            n += 2;

            if (n % 10==0)
                System.out.println ();
        }
    }
}
