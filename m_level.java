class student {
    int roll;
    String name;

    public void set1(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public void disp1() {
        System.out.println("Roll number : " + roll);
        System.out.println("Nmame  : " + name);
    }
}

class marks extends student {
    int m1, m2, m3;

    public void set2(int a, int b, int c) {
        m1 = a;
        m2 = b;
        m3 = c;
    }

    public void disp2() {
        System.out.println("Marks 1 : " + m1);
        System.out.println("Marks 2 : " + m2);
        System.out.println("Marks 3 : " + m3);
    }
}

class grade extends marks {
    char g;

    public void set3(char a) {
        g = a;
    }

    public void disp3() {
        System.out.println("Grade : " + g);
    }
}

class m_level {
    public static void main(String[] args) {
        grade obj1 = new grade();
        obj1.set1(4, "gaurav");
        obj1.set2(100, 100, 100);
        obj1.set3('A');
        obj1.disp1();
        obj1.disp2();
        obj1.disp3();
    }
}
