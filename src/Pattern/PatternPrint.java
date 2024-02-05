package Pattern;

public class PatternPrint {
    public static void main(String[] args) {
        
        String name = "racecar";

        System.out.println("forward diagonal");
        PatternFunc.forwardDiagonal(name);
        
        System.out.println("backward diagonal");
        PatternFunc.backwardDiagonal(name);
        
        System.out.println("diamond pattern");
        PatternFunc.diamondPattern(name);
    }
}
