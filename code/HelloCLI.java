import java.util.Arrays;

public class HelloCLI{
    public static void main(String[] args) {
        System.out.println("Welcome to network Programming");
        System.out.println("Hello User");
        // System.out.println(args[0]);
        System.out.println(Arrays.toString(args));
        //We can provide values during compile execution through command line arguments

        //To compile: javac HelloCLI.java
        //After successful compilation a class file(bytecode) is generated with same name
        //To Execute: java HelloCLI <arguments>
        //eg: java HelloCLI bishesh Shyam
    }
}