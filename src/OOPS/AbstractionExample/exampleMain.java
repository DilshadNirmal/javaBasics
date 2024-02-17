package OOPS.AbstractionExample;

public class exampleMain {
    public static void main(String[] args) {
        Laptop dell = new Laptop("vostro", "i3-11309");

        System.out.println("Laptop model & processor variant: " + dell.getLaptopName() + " & " + dell.processorName());
    }
}
