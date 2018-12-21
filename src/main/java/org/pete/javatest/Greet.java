package org.pete.javatest;

public class Greet {
    public static void main(String args[]) {
        Greet test = new Greet();
        if (args.length > 0) {
            System.out.println(test.makeGreeting(args[0]));
        } else {
            System.out.println("must enter name");
        }
    }

    public String makeGreeting(String arg) {
        return "HI: " + arg;
    }
}
