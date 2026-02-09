class Grandfather {
    public void showG() {
        System.out.println("He is Grandfather.");
    }
}

class Father extends Grandfather {
    public void showF() {
        System.out.println("He is Father.");
    }
}

class Son extends Father {
    public void showS() {
        System.out.println("He is Son.");
    }
}

class Daughter extends Father {
    public void showD() {
        System.out.println("She is Daughter.");
    }
}

public class Family {
    public static void main(String args[]) {
        // Creating and using Son object
        Son obj1 = new Son();
        obj1.showS();
        obj1.showF();
        obj1.showG();

        // Creating and using Daughter object
        Daughter obj2 = new Daughter();
        obj2.showD();
        obj2.showF();
        obj2.showG();
    }
}
