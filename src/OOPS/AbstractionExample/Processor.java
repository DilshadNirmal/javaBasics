package OOPS.AbstractionExample;

public abstract class Processor {

    String processor;

    public Processor(String processor) {
        this.processor = processor;
    }

    abstract String processorName();
}
