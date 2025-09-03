package OOPS.Abstract;

abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Concrete method (has body)
    void sleep() {
        System.out.println("Sleeping");
    }
}
