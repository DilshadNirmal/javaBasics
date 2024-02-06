package Pattern;

public class PatternFunc {
    // forward diagonal
    static void forwardDiagonal(String name) {
        for (int outerIndex = name.length() - 1; outerIndex >= 0; outerIndex--) {
            for (int innerIndex = name.length() - 1; innerIndex >= 0; innerIndex--) {
                if (outerIndex == innerIndex) {
                    System.out.print(name.charAt(outerIndex));
                } else {
                    System.out.print("*");
                }
            } System.out.println("");
        }
    }

    // backward diagonal
    static void backwardDiagonal(String name) {
        for (int outerIndex = name.length() - 1; outerIndex >= 0; outerIndex--) {
            for (int innerIndex = 0; innerIndex < name.length(); innerIndex++) {
                if (outerIndex == innerIndex) {
                    System.out.print(name.charAt(outerIndex));
                } else {
                    System.out.print("*");
                }
            } System.out.println("");
        }
    }

    static void diamondPattern(String name) {
        int length = name.length();
        if (length % 2 != 0) {
            int left = length / 2;
            int right = length / 2;
            boolean isReverse = true;

            for (int row = 0; row < length; row++) {
                for (int col = 0; col < length; col++) {
                    if (left == col || right == col) {
                        System.out.print(name.charAt(col));
                    } else {
                        System.out.print("*");
                    }
                }

                System.out.println("");

                if (left == 0) {
                    isReverse = false;
                }

                if (isReverse) {
                    left--;
                    right++;
                } else {
                    left++;
                    right--;
                }
            }
        } else {
            System.out.println("enter a odd numbered text to print diagonal");
        }
    }

    
}
