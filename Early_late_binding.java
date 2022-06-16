// //early binding
// class gaurav {
// static void print() {
// System.out.println("hello gaurav");
// }
// }

// class negi extends gaurav {
// static void print() {
// System.out.println("helo negi");
// }
// }

// class Early_late_binding {
// public static void main(String[] args) {
// gaurav a = new gaurav();
// gaurav b = new negi();

// a.print();
// b.print();
// }
// }
/*
 * //early & late
 * It is a compile-time process -It is a run-time process
 * The method definition and method call are linked during the compile time.
 * --The
 * method definition and method call are linked during the run time.
 * Actual object is not used for binding. --Actual object is used for binding.
 * For example: Method overloading --For example: Method overriding
 * Program execution is faster-- Program execution is slower
 */
// late binding

// class superclass {
// void print() {
// System.out.println("print in superclass.");
// }
// }

// class subclass extends superclass {
// @Override
// void print() {
// System.out.println("print in subclass.");
// super.print();
// }
// }

// public class Early_late_binding {
// public static void main(String[] args) {
// superclass A = new superclass();
// superclass B = new subclass();
// A.print();
// B.print();
// }
// }
