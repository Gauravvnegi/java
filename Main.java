/*
 * class A extends Thread {
 * public void run() {
 * try {
 * for (int i = 1; i <= 100; i++) {
 * System.out.println(i + " ");
 * Thread.sleep(10);
 * }
 * System.out.println("\n");
 * } catch (
 * 
 * InterruptedException i) {
 * 
 * }
 * }
 * }
 * 
 * class B extends Thread {
 * public void run() {
 * try {
 * for (char i = 'a'; i <= 'z'; i++) {
 * System.out.println(i + " ");
 * Thread.sleep(10);
 * }
 * System.out.println("\n");
 * } catch (
 * 
 * InterruptedException i) {
 * 
 * }
 * }
 * }
 * 
 * class Main {
 * public static void main(String[] args) throws InterruptedException {
 * A t1 = new A();
 * t1.run();
 * B t2 = new B();
 * t2.run();
 * 
 * }
 * }
 */
/*
 * class A extends Thread {
 * public void run() {
 * try {
 * for (int i = 1; i <= 100; i++) {
 * System.out.println(i + " ");
 * Thread.sleep(0);
 * }
 * System.out.println("\n");
 * } catch (
 * 
 * InterruptedException i) {
 * 
 * }
 * }
 * }
 * 
 * class B extends Thread {
 * public void run() {
 * try {
 * for (char i = 'a'; i <= 'z'; i++) {
 * System.out.println(i + " ");
 * Thread.sleep(0);
 * }
 * System.out.println("\n");
 * } catch (
 * 
 * InterruptedException i) {
 * 
 * }
 * }
 * }
 * 
 * class Main {
 * public static void main(String[] args) throws InterruptedException {
 * A t1 = new A();
 * t1.run();
 * B t2 = new B();
 * t2.run();
 * for (char i = 'A'; i <= 'Z'; i++) {
 * System.out.println(i + " ");
 * }
 * }
 * }
 * 
 */
// class A implements Runnable {
// public void run() {
// for (int i = 0; i < 10; i++) {
// System.out.println(i + 1 + " ");
// }
// }
// }

// class B implements Runnable {
// public void run() {
// for (char i = 'a'; i <= 'z'; i++) {
// System.out.println(i + " ");
// }
// }
// }

// class Main {
// public static void main(String[] args) {
// A r1 = new A();
// B r2 = new B();
// Thread t1 = new Thread(r1);
// Thread t2 = new Thread(r2);
// t1.start();
// t2.start();
// }
// }
class gaurav extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total += 100;

            }
            this.notifyAll();
        }
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        gaurav t1 = new gaurav();
        t1.start();

        synchronized (t1) {
            t1.wait();
            System.out.println("total is  " + t1.total);
        }
    }
}