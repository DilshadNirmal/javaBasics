package OOPS.AbstractionExample;

public class Laptop extends Processor {
    String laptopName;

    public Laptop(String laptopName, String processor) {
        super(processor);
        this.laptopName = laptopName;
    }

    public String getLaptopName() {
        return laptopName;
    }

    @Override
    String processorName() {
        return processor;
    }
}
