class Parent {

    public  void display() {
        System.out.println("Static method from Parent");
    }
}

class Child extends Parent {
    public   void display() {
        System.out.println("Static method from Child");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display(); // Outputs: Static method from Parent

    }
}
