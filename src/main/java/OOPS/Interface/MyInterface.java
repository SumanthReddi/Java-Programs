package OOPS.Interface;

public interface MyInterface {
    // Constant declaration
    int MY_CONSTANT = 10;

    // Abstract method (no body)
    void myMethod();

    // Static method (Java 8+)
    static void staticMethod() {
        System.out.println("Static method in interface.");
    }

    // Default method (Java 8+)
    default void defaultMethod() {
        System.out.println("Default method in interface.");
    }
}
