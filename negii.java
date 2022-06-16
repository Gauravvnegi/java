import java.util.ArrayList;
import java.util.Scanner;

class negii {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList();

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            ar.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {

            System.out.println(ar.get(i));
        }
    }
}