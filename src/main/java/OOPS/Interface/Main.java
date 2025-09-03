package OOPS.Interface;

public class Main {
        public static void main(String[] args) {
            ImplementingInterface obj = new ImplementingInterface();
            obj.myMethod();          // Calls implemented method
            obj.defaultMethod();     // Calls default method from interface
            System.out.println(MyInterface.MY_CONSTANT); // Access constant
            MyInterface.staticMethod(); // Calls static method

            // Polymorphism example
            MyInterface intfObj = new ImplementingInterface();
            // Interface objName=new ClassName where abstract methods implemented
            intfObj.myMethod();

        }
    }
