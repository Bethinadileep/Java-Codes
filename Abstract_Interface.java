//code by: Dileep

abstract class abt {
    public abstract void animalsound();

    public void sleep(){
        System.out.println("Zzz");
    }
}

class Pig extends abt {
    public void animalsound() {
        System.out.println("Pig: Wee Wee");
    }
}

class MyClass {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalsound();
        myPig.sleep();
    }
}
