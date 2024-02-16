package OOPS.Inheritance.Multilevel;

public class Laptop extends Screen {
    String processor;

    public Laptop(String proce, int displaySize) {
        super(displaySize);
        this.processor = proce;
    }

    public String getProcessor() {
        return this.processor;
    }
}
