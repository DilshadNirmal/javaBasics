package OOPS.Inheritance.Multilevel;

public class MultilevelMain {
    public static void main(String[] args) {
        Mobile samsung = new Mobile("exynos", 16);

        System.out.println("display size of my mobile: " + samsung.getDisplaySize());
        System.out.println("processor used in mobile: " + samsung.getProcessor());
        
    }
}
