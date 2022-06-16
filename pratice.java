import java.util.Scanner;

// class gaurav {
//     final int a = 1, b = 2;

//     public void get() {
//         System.out.println("A = " + a);
//         System.out.println("B = " + b);
//     }
// }

// class negi extends gaurav {
//     int b = 6, a = 10;

//     @Override
//     public void get() {
//         System.out.println("A = " + a);
//         System.out.println("B = " + b);
//         super.get();
//     }
// }

// class pratice {
//     public static void main(String[] args) {
//         negi obj = new negi();
//         obj.get();
//         gaurav o = new gaurav();
//         o.get();

//     }
// }
// class Person {

//     static int age;

// }

// class pratice {

//     public static void main(String args[]) {

//         Person p1 = new Person();

//         Person p2 = new Person();

//         p1.age = 30;

//         p2.age = 31;

//         Person.age = 32;

//         System.out.println("P1\'s age is: " + p1.age);

//         System.out.println("P2\'s age is: " + p2.age);

//     }

// }
// class gaurav {
//     public void print() {
//         System.out.println("hello gaurav");

//     }
// }

// class negi extends gaurav {
//     @Override
//     public void print() {
//         System.out.print("Hello negi");

//     }
// }

// class sagar extends negi {
//     public void print() {
//         System.out.println("hello sagar");
//         super.print();
//     }
// }

// class pratice {
//     public static void main(String[] args) {
//         negi obj = new sagar();
//         obj.print();

//     }
// }
public class pratice {
    static void quick_sort(int[] arr, int l, int h) {
        int low = l;
        int high = h;
        int key = arr[(l + h) / 2];
        do {
            while (key > arr[low])
                low++;
            while (key < arr[high])
                high--;
            if (low <= high) {
                int temp = arr[low];
                arr[low++] = arr[high];
                arr[high--] = temp;
            }
        } while (low <= high);
        if (l <= high) {
            quick_sort(arr, l, high);
        }
        if (low < h) {
            quick_sort(arr, low, h);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quick_sort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

        }
    }
}