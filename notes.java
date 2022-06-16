import java.util.Scanner;

/*
 * inheritance --
 * Inheritance in Java is a mechanism in which one object acquires all the
 * properties and behaviors of a parent object.
 * It is an important part of OOPs (Object Oriented programming system).
 * class Animal{
 * void eat(){System.out.println("eating...");}
 * }
 * class Dog extends Animal{
 * void bark(){System.out.println("barking...");}
 * }
 * class TestInheritance{
 * public static void main(String args[]){
 * Dog d=new Dog();
 * d.bark();
 * d.eat();
 * }}'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
 * '''''''
 * Hierarchical Inheritance Example
 * When two or more classes inherits a single class, it is known as hierarchical
 * inheritance.
 * In the example given below, Dog and Cat classes inherits the Animal class, so
 * there is hierarchical inheritance.
 * class Animal{
 * void eat(){System.out.println("eating...");}
 * }
 * class Dog extends Animal{
 * void bark(){System.out.println("barking...");}
 * }
 * class Cat extends Animal{
 * void meow(){System.out.println("meowing...");}
 * }
 * class TestInheritance3{
 * public static void main(String args[]){
 * Cat c=new Cat();
 * c.meow();
 * c.eat();
 * //c.bark();//C.T.Error
 * }}
 * '''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
 * '''
 * Why multiple inheritance is not supported in java?
 * To reduce the complexity and simplify the language, multiple inheritance is
 * not supported in java.
 * Consider a scenario where A, B, and C are three classes. The C class inherits
 * A and B classes.
 * If A and B classes have the same method and you call it from child class
 * object, there will be ambiguity to call the method of A or B class.
 * 
 * Since compile-time errors are better than runtime errors, Java renders
 * compile-time error if you inherit 2 classes.
 * So whether you have same method or different, there will be compile time
 * 
 * class A{
 * void msg(){System.out.println("Hello");}
 * }
 * class B{
 * void msg(){System.out.println("Welcome");}
 * }
 * class C extends A,B{//suppose if it were
 * 
 * public static void main(String args[]){
 * C obj=new C();
 * obj.msg();//Now which msg() method would be invoked?
 * }
 * }
 * interface p1 {
 * default void show() {
 * System.out.println("Hello p1");
 * }
 * }
 * 
 * interface p2 {
 * default void show() {
 * System.out.println("Hello p2");
 * }
 * }
 * 
 * class g implements p1, p2 {
 * 
 * public void show() {
 * System.out.println("hello g");
 * }
 * }
 * 
 * class mutple_inheritance {
 * public static void main(String[] args) {
 * g obj = new g();
 * obj.show();
 * p1 o = new g();
 * o.show();
 * 
 * }
 * }
 * 
 * ''''''''''''''''''''''''''''''''''''''''''''''''''''''''
 * abstract class
 * Abstraction is a process of hiding the implementation details and showing
 * only functionality to the user.
 * A method which is declared as abstract and does not have implementation is
 * known as an abstract method.
 * abstract class Shape{
 * abstract void draw();
 * }
 * //In real scenario, implementation is provided by others i.e. unknown by end
 * user
 * class Rectangle extends Shape{
 * void draw(){System.out.println("drawing rectangle");}
 * }
 * class Circle1 extends Shape{
 * void draw(){System.out.println("drawing circle");}
 * }
 * //In real scenario, method is called by programmer or user
 * class TestAbstraction1{
 * public static void main(String args[]){
 * Shape s=new Circle1();//In a real scenario, object is provided through
 * method, e.g., getShape() method
 * s.draw();
 * }
 * }
 * =''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
 * final class
 * When a variable is declared with final keyword, its value can’t be modified,
 * essentially, a constant.
 * final class Super {
 * private int data = 30;
 * }
 * 
 * public class notes extends Super {
 * public static void main(String args[]) {
 * }
 * }
 * '''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
 * overloading=-
 * Overloading allows different methods to have the same name,
 * but different signatures where the signature can differ by the number of
 * input parameters or type
 * of input parameters or both.
 * Overloading is related to compile-time (or static) polymorphism.
 * public class notes {
 * public void add() {
 * System.out.println("no");
 * 
 * }
 * 
 * public void add(int a, int b) {
 * System.out.println(a + b);
 * }
 * 
 * public void add(int a, int b, int c) {
 * System.out.println(a + b + c);
 * }
 * 
 * public static void main(String[] args) {
 * notes n = new notes();
 * n.add();
 * n.add(1, 2, 3);
 * n.add(1, 2);
 * }
 * }
 * overriding----------------------------------------------
 * What is overriding in Java with example?
 * Image result for overriding in java example
 * If subclass (child class) has the same method as declared in the parent
 * class,
 * it is known as method overriding in Java. In other words, If a subclass
 * provides the specific
 * implementation
 * of the method that has been declared by one of its parent class, it is known
 * as method overriding.
 * 
 * class Parent {
 * void show()
 * {
 * System.out.println("Parent's show()");
 * }
 * }
 * 
 * // Inherited class
 * class Child extends Parent {
 * // This method overrides show() of Parent
 * 
 * @Override
 * void show()
 * {
 * System.out.println("Child's show()");
 * }
 * }
 * 
 * // Driver class
 * class Main {
 * public static void main(String[] args)
 * {
 * // If a Parent type reference refers
 * // to a Parent object, then Parent's
 * // show is called
 * Parent obj1 = new Parent();
 * obj1.show();
 * 
 * // If a Parent type reference refers
 * // to a Child object Child's show()
 * // is called. This is called RUN TIME
 * // POLYMORPHISM.
 * Parent obj2 = new Child();
 * obj2.show();
 * }
 * }
 */
// An interface in Java is a blueprint of a class. A Java interface contains
// static constants and abstract methods.
// The interface in Java is a mechanism to achieve abstraction. There can be
// only abstract methods in the Java interface, not the method body.
// interface gaurav {
// void show();

// }

// class negi implements gaurav {
// public void show() {
// System.out.println("hello negi");
// }
// }

// class notes {
// public static void main(String[] args) {
// negi obj = new negi();

// }
// }
// interface gaurav {
// default void disp() {
// System.out.println("hello gaurav");
// }
// }

// interface negi {
// default void disp() {
// System.out.println("Hello negi");
// }
// }

// class sagar implements gaurav, negi {
// public void disp() {
// System.out.println("hello sagar");
// }
// }

// class notes {
// public static void main(String[] args) {
// sagar obj = new gaurav();
// obj.disp();
// }
// }
// class gaurav {
// double a, b, c;

// gaurav() {
// a = b = c = 0;
// }

// gaurav(double x) {
// a = x;
// b = x;
// c = x;

// }

// gaurav(double x, double y, double z) {
// a = x;
// b = y;
// c = z;
// }

// double volume() {
// return a * b * c;
// }
// }

// class notes {
// public static void main(String[] args) {
// gaurav obj = new gaurav();
// gaurav obj1 = new gaurav(10.5);
// gaurav obj2 = new gaurav(2.3, 3.8, 4.7);
// double vol;
// vol = obj.volume();
// System.out.println(vol);
// vol = obj1.volume();
// System.out.println(vol);
// vol = obj2.volume();
// System.out.println(vol);
// }
// }
///////////////////////////////////////////////////////////////////////////////////////////////
// Why is constructor of super class invoked when we declare the object of sub
// class? (Java)
// As we know well that default constructor is provided by compiler
// automatically but
// it also adds super() for the first statement.
// If you are creating your own constructor and you don't have either this() or
// super()
/// as the first statement, compiler will provide super() as the first statement
// of the constructor.
//
// class Test {
// Test() {
// System.out.println("In constructor of Superclass");
// }

// int adds(int n1, int n2) {
// return (n1 + n2);
// }

// void print(int sum) {
// System.out.println("the sums are " + sum);
// }
// }

// class Test1 extends Test {
// Test1(int n1, int n2) {
// System.out.println("In constructor of Subclass");
// int sum = this.adds(n1, n2);
// this.print(sum);
// }

// }

// class notes {
// public static void main(String[] args) {
// Test1 a = new Test1(13, 12);
// Test c = new Test1(15, 14);
// }
// }
////////////////////////////////////////////////////////////////////////////////////////////////////
// package a
// package arragnge

// number of class,subclass,interface of same type in a pericular group.
// java.lang;
// java.util;
// java.io;
// java.applet;
// java.awt;
// java.net;
// advantage --
// resubility , security , fast serching ,hiding , naming conflecting
// class Programming {
// int a = 10;
// // Constructor for class Programming

// public Programming() {
// System.out.println("Programming");
// }
// }

// // Child Class inherit the Base
// // Class
// class DP extends Programming {

// // Constructor for class DP
// public DP() {
// System.out.println("DP");
// }
// }

// // Main Class
// public class notes {

// public static void main(String[] args) {
// // Creating obj for
// // class DP
// DP obj = new DP();
// }
// }
////////////////////////////////////////////////////////
////// import and static import
// The import allows the java programmer to access classes of a package without
// package qualification
// whereas
// the static import feature allows to access the static members of a class
// without
// the class qualification.
/*
 * With the help of import, we are able to access classes and interfaces which
 * are present in any package.
 * But using static import, we can access all the static members (variables and
 * methods) of a class directly without explicitly calling class name.
 * The main difference is Readability,
 * ClassName.dataMember (System.out) is less readable when compared to
 * dataMember(out),
 * static import can make your program more readable
 */
// import static java.lang.System.*;

// class StaticImportExample {
// public static void main(String args[]) {

// out.println("Hello");// Now no need of System.out
// out.println("Java");

// }
// }
/**
 * interface is just like a class , which contain abstraction method .
 * to achieve interface java provide a keyword called implements.
 * interface member arer by default public,staticand final.
 * interface method must be override inside the implement calss
 */
// interface gaurav {
// void input();

// void output();
// }

// class negi implements gaurav {
// String name;
// double sal;

// public void input() {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the name : ");
// name = sc.nextLine();
// System.out.println("Enter the sal : ");
// sal = sc.nextDouble();
// }

// public void output() {
// System.out.println(name + " " + sal);
// }

// }

// class notes {
// public static void main(String[] args) {
// negi n = new negi();
// n.input();
// n.output();
// }
// }
//////////////////////////////////////////////////
// Abstract class
/*
 * abstract class Base {
 * abstract void fun();
 * }
 * 
 * // Class 2
 * class Derived extends Base {
 * void fun()
 * {
 * System.out.println("Derived fun() called");
 * }
 * }
 * 
 * // Class 3
 * // Main class
 * class Main {
 * 
 * // Main driver method
 * public static void main(String args[])
 * {
 * 
 * // Uncommenting the following line will cause
 * // compiler error as the line tries to create an
 * // instance of abstract class. Base b = new Base();
 * 
 * // We can have references of Base type.
 * Base b = new Derived();
 * b.fun();
 * }
 * }
 * 1 Abstract class can have abstract and non-abstract methods.
 * 1 Interface can have only abstract methods.
 * 2 Abstract class doesn't support multiple inheritance.
 * 2 Interface supports multiple inheritance.
 * 3 The abstract keyword is used to declare abstract class.
 * 3 The interface keyword is used to declare interface.
 * 4 An abstract class can be extended using keyword "extends".
 * 4 An interface can be implemented using keyword "implements".
 * 5 A Java abstract class can have class members like private, protected, etc.
 * 5 Members of a Java interface are public by default.
 * 
 */
// abstract class gaurav {
// abstract void disp();
// }

// class negi extends gaurav {
// void disp() {
// System.out.println("hello");
// }
// }

// class notes {
// public static void main(String[] args) {
// gaurav o = new negi();
// o.disp();
// }
// }
/*
 * ////extended interface
 * An interface can extend another interface in the same way that a class can
 * extend another class.
 * The extends keyword is used to extend an interface, and the child interface
 * inherits the methods
 * of the parent interface.
 */
// interface gaurav {
// void show1();
// }

// interface negi extends gaurav {
// void show2();
// }

// class notes implements negi {
// public void show1() {
// System.out.println("hello gaurav");
// }

// public void show2() {
// System.out.println("hello negi");
// }

// public static void main(String[] args) {
// notes s = new notes();
// s.show1();
// s.show2();
// }
// }
// }
//
// Garbage collection (GC) is a dynamic approach to automatic memory
// management and heap allocation that processes
// and identifies dead memory blocks and reallocates storage for reuse.
// The primary purpose of garbage collection is to reduce memory leaks.
/////////////////////////////////////////////////////////////////////////
// he mutable objects are objects whose value can be changed after
// initialization.
// We can change the object's values, such as field and states, after the object
// is created.
// For example, Java.util.Date, StringBuilder, StringBuffer, etc.
/*
 * class gaurav {
 * String g;
 * 
 * public void set(String s) {
 * g = s;
 * }
 * 
 * public void disp() {
 * System.out.println(g);
 * }
 * }
 * 
 * class negii {
 * public static void main(String[] args) {
 * gaurav o = new gaurav();
 * o.set("gaurav negi");
 * o.disp();
 * o.set("gaurav");
 * o.disp();
 * }
 * }
 * he immutable objects are objects whose value can not be changed after
 * initialization.
 * We can not change anything once the object is created. For example, primitive
 * objects such as int, long, float, double, all legacy classes, Wrapper class,
 * String class, etc.
 * class gaurav {
 * final String g;
 * 
 * gaurav(final String g) {
 * this.g = g;
 * }
 * 
 * public void disp() {
 * System.out.println(g);
 * }
 * }
 * 
 * class negii {
 * public static void main(String[] args) {
 * gaurav o = new gaurav("gaurav negi");
 * 
 * o.disp();
 * 
 * }
 * }
 * JVM (Java Virtual Machine) is an abstract machine.
 * It is a specification that provides runtime environment in which java
 * bytecode can be executed.
 * JVMs are available for many hardware and software platforms (i.e. JVM is
 * platform dependent).
 * super keyword is used to access methods of the parent class while
 * this is used to access methods of the current class.
 * 
 * 
 * this keyword
 * 
 * this is a reserved keyword in java i.e, we can’t use it as an identifier.
 * this is used to refer current-class’s instance as well as static members.
 * super is a reserved keyword in java i.e, we can’t use it as an identifier.
 * super is used to refer super-class’s instance as well as static members.
 * super is also used to invoke super-class’s method or constructor.
 * /////////////////////////////////////////////////////////
 * Method overriding is one of the ways in which Java supports Runtime
 * Polymorphism.
 * Dynamic method dispatch is the mechanism by which a
 * call to an overridden method is resolved at run time, rather than compile
 * time.
 * class gaurav {
 * 
 * public void disp() {
 * System.out.println("hello gaurav");
 * }
 * }
 * 
 * class sagar extends gaurav {
 * 
 * public void disp() {
 * 
 * System.out.println("hello sagar");
 * }
 * 
 * public void hel() {
 * System.out.println("hello ");
 * }
 * }
 * 
 * class negii {
 * public static void main(String[] args) {
 * gaurav obj = new sagar();
 * obj.disp();
 * obj.hel();//not allowed
 * 
 * 
 * }
 * }
 * ////////////////////////////////////////////////////////////////
 * Following are the notable features of Java:
 * Object Oriented. In Java, everything is an Object. ...
 * Platform Independent. ...
 * Simple. ...
 * Secure. ...
 * Architecture-neutral. ...
 * Portable. ...
 * Robust. ...
 * Multithreaded.
 * C++ uses only compiler, whereas Java uses compiler and interpreter both.
 * C++ supports both operator overloading & method overloading whereas Java only
 * supports method overloading.
 * C++ supports manual object management with the help of new and delete
 * keywords whereas Java has built-in
 * automatic garbage collection.
 * C++ supports structures whereas Java doesn’t supports structures.
 * C++ supports unions while Java doesn’t support unions.
 * ///////////////////////////////
 * What is JVM in Java?
 * Java Virtual Machine, or JVM, loads, verifies and executes Java bytecode. It
 * is known as the interpreter
 * or the core of Java programming language because it executes Java
 * programming.
 * Why is java JDK used?
 * Image result for jdk in java
 * The Java Development Kit (JDK) is a software development environment that
 * offers a collection of tools and
 * libraries necessary for developing Java applications.
 * A Java™ runtime environment (JRE) is a set of components to create and run a
 * Java application.
 * A JRE is part of a Java development kit (JDK).
 * A JRE is made up of a Java virtual machine (JVM), Java class libraries, and
 * the Java class loader.
 * Bytecode in Java is an intermediate machine-independent code. It is a set of
 * instructions for Java Virtual Machine
 * and it acts pretty similar to the assembler in C++. In general,
 * bytecode is a code that lies between low-level and high-level language.
 * The bytecode is not processed by the processor.
 * javac////////////////////
 * the javac tool reads class and interface definitions, written in the Java
 * programming language,
 * and compiles them into bytecode class files.
 * It can also process annotations in Java source files and classes.
 * /////////////////////////////////////////////////////////////////////////////
 * /////
 * constructor chaning
 * Constructor chaining is the process of calling one constructor from another
 * constructor with respect to current object.
 * Constructor chaining occurs through inheritance. A sub class constructor’s
 * task is to call super class’s constructor
 * first.
 * class gaurav {
 * gaurav() {
 * System.out.println("hello gaurav");
 * }
 * 
 * gaurav(int x, int y) {
 * this(5);
 * System.out.println(x + y);
 * }
 * 
 * gaurav(int x) {
 * this();
 * System.out.println(x);
 * }
 * 
 * }
 * 
 * class negii {
 * public static void main(String[] args) {
 * new gaurav(10, 20);
 * }
 * }
 * ////////////////////////////////////////
 * Early Binding: The binding which can be resolved at compile time by the
 * compiler is known as static or early binding.
 * Binding of all the static, private and final methods is done at compile-time.
 * 
 * public class NewClass {
 * public static class superclass {
 * static void print()
 * {
 * System.out.println("print in superclass.");
 * }
 * }
 * public static class subclass extends superclass {
 * static void print()
 * {
 * System.out.println("print in subclass.");
 * }
 * }
 * 
 * public static void main(String[] args)
 * {
 * superclass A = new superclass();
 * superclass B = new subclass();
 * A.print();
 * B.print();
 * }
 * }
 * In the late binding or dynamic binding, the compiler doesn’t decide the
 * method to be called.
 * Overriding is a perfect example of dynamic binding.
 * In overriding both parent and child classes have the same method.
 * public class NewClass {
 * public static class superclass {
 * void print()
 * {
 * System.out.println("print in superclass.");
 * }
 * }
 * 
 * public static class subclass extends superclass {
 * 
 * @Override
 * void print()
 * {
 * System.out.println("print in subclass.");
 * }
 * }
 * 
 * public static void main(String[] args)
 * {
 * superclass A = new superclass();
 * superclass B = new subclass();
 * A.print();
 * B.print();
 * }
 * }
 * In Compile time Polymorphism, the call is resolved by the compiler.
 * In Run time Polymorphism, the call is not resolved by the compiler.
 * 2 It is also known as Static binding, Early binding and overloading as well.
 * It is also known as Dynamic binding, Late binding and overriding as well.
 * 3 Method overloading is the compile-time polymorphism where more than one
 * methods share the same name
 * with different parameters or signature and different return type.
 * Method overriding is the runtime polymorphism having same method with same
 * parameters or signature,
 * but associated in different classes.
 * 4 It is achieved by function overloading and operator overloading.
 * It is achieved by virtual functions and pointers.
 * 5 It provides fast execution because the method that needs to be executed is
 * known early at the compile time.
 * It provides slow execution as compare to early binding because the method
 * that needs to be executed
 * is known at the runtime.
 * 6 Compile time polymorphism is less flexible as all things execute at compile
 * time.
 * Run time polymorphism is more flexible as all things execute at run time.
 * /////////////////////////////////////////////////////////////////////////////
 * //
 * access modifier
 * Private: The access level of a private modifier is only within the class
 * . It cannot be accessed from outside the class.
 * Default: The access level of a default modifier is only within the package.
 * It cannot be accessed from outside the package. If you do not specify any
 * access level, it will be the default.
 * Protected: The access level of a protected modifier is within the package and
 * outside the package through child class.
 * If you do not make the child class, it cannot be accessed from outside the
 * package.
 * Public: The access level of a public modifier is everywhere. It can be
 * accessed from within the class, outside the class,
 * within the package and outside the package.
 * /////////////////////////////////////////////////////////////////////
 * Static keyword
 * The static keyword in Java
 * is used for memory management mainly. We can apply static keyword with
 * variables
 * , methods, blocks and nested classes
 * . The static keyword belongs to the class than an instance of the class.
 * ex collge name is same for all
 * ///////////////////////////////////////
 * static method belong to class not object. it can be call directly from class
 * name.
 * it is used for memory manage ment.it cannot refer to this or super keyword
 * anyway.
 * class negi {
 * static void disp() {
 * System.out.println("hello negi");
 * }
 * }
 * 
 * class negii {
 * public static void main(String[] args) {
 * negi.disp();
 * }
 * }
 * static variable are used for memory management.The static variable can be
 * used to refer to the common property
 * of all objects (which is not unique for each object),
 * final/////////////////////////////////////////
 * When a variable is declared with final keyword, its value can’t be modified,
 * essentially, a constant.
 * This also means that you must initialize a final variable. If the final
 * variable is a reference,
 * this means that the variable cannot be re-bound to reference another object,
 * but the internal state of the
 * object pointed by that reference variable can be changed i.e. you can add or
 * remove elements from the final array
 * or final collection. It is good practice to represent final variables in all
 * uppercase, using underscore
 * to separate words.
 * public class Main {
 * final int x = 10;
 * 
 * public static void main(String[] args) {
 * Main myObj = new Main();
 * myObj.x = 25; // will generate an error: cannot assign a value to a final
 * variable
 * System.out.println(myObj.x);
 * }
 * }
 * //////////////////////////////////////////////////
 * The wrapper class in Java provides the mechanism to convert primitive into
 * object and object into primitive.
 * class Main {
 * public static void main(String[] args) {
 * int i = 10;
 * Integer j = Integer.valueOf(i);// boxing;
 * Integer jj = i;// autoboxing
 * System.out.println(j);
 * System.out.println(jj);
 * Integer q = new Integer(20);
 * int ii = q.valueOf(q);// unboxing
 * int jjj = q;// autounboxing
 * System.out.println(ii);
 * System.out.println(jjj);
 * }
 * }
 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// EXCEPION HANDLING
/*
 * an exception is unwanted/ abnormal/unexpected situation that occur in runtime
 * callled exception.
 * 
 */
/*
 * Exception types------------------------------------------------------
 * 1 . Built-in Exceptions
 * Checked Exception
 * Unchecked Exception
 * 2 . User-Defined Exceptions
 * 
 * 
 * /
 * //////////////////////////multithreading using thread
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
 * ////////////////////////////////////generic function
 * The Java Generics allows us to create a single class, interface, and method
 * that can be used with different types of data (objects).
 * This helps us to reuse our code. Note: Generics does not work with primitive
 * types ( int , float , char , etc).
 * /*
 * checked ------------------------------------------------------------exception
 * These are the exceptions that are checked at compile time. If some code
 * within a method throws a checked exception,
 * then the method must either handle the exception or it must specify the
 * exception using the throws keyword.
 * class GFG {
 * 
 * // Main driver method
 * public static void main(String[] args)
 * throws IOException
 * {
 * 
 * // Creating a file and reading from local repository
 * FileReader file = new FileReader("C:\\test\\a.txt");
 * 
 * // Reading content inside a file
 * BufferedReader fileInput = new BufferedReader(file);
 * 
 * // Printing first 3 lines of file "C:\test\a.txt"
 * for (int counter = 0; counter < 3; counter++)
 * System.out.println(fileInput.readLine());
 * 
 * // Closing all file connections
 * // using close() method
 * // Good practice to avoid any memory leakage
 * fileInput.close();
 * }
 * }
 * ////////////////////////////////////////unchecked
 * hese are the exceptions that are not checked at compile time. In C++, all
 * exceptions are unchecked,
 * so it is not forced by the compiler to either handle or specify the
 * exception.
 * It is up to the programmers to be civilized, and specify or catch the
 * exceptions. In Java exceptions under
 * Error and RuntimeException classes are unchecked exceptions, everything else
 * under throwable is checked.
 * class GFG {
 * 
 * // Main driver method
 * public static void main(String args[])
 * {
 * // Here we are dividing by 0
 * // which will not be caught at compile time
 * // as there is no mistake but caught at runtime
 * // because it is mathematically incorrect
 * int x = 0;
 * int y = 10;
 * int z = y / x;
 * }
 * }
 * ///////////////////////////////wait()
 * The wait() method causes the current thread to wait until another thread
 * invokes the notify() or notifyAll() methods for that object
 * class gaurav extends Thread {
 * int total = 0;
 * 
 * public void run() {
 * synchronized (this) {
 * for (int i = 1; i <= 10; i++) {
 * total += 100;
 * 
 * }
 * this.notifyAll();
 * }
 * }
 * }
 * 
 * class Main {
 * public static void main(String[] args) throws InterruptedException {
 * gaurav t1 = new gaurav();
 * t1.start();
 * 
 * synchronized (t1) {
 * t1.wait();
 * System.out.println("total is  " + t1.total);
 * }
 * }
 * }
 * ////////////////////////////////////notify
 * The notify() method wakes up a single thread that is waiting on that object's
 * monitor.
 * The notifyAll() method wakes up all threads that are waiting on that object's
 * monitor
 * ////////////////////////////////////////generic function
 * Generic Java method takes a parameter and returns some value after performing
 * a task.
 * 
 */