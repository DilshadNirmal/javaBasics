package Pattern;

public class NumberPyramid {
    public static void main(String[] args) {
        int num = 7;
        
        leftFaced(num);
        System.out.println();
        middle(num);
        System.out.println();
        rightFaced(num);
        System.out.println();
        
    }

    public static void leftFaced(int l) {
        for (int outerIndex = 1; outerIndex <= l; outerIndex++) {
            if (outerIndex % 2 != 0)  {
                for (int innerIndex = 1; innerIndex <= outerIndex; innerIndex++) {
                    System.out.print(innerIndex + " ");
                } System.out.println(" ");
            }
        }
    }

    public static void middle(int l) {
        for (int outerIndex = 1; outerIndex <= l; outerIndex++) {
            for (int innerIndex = 1; innerIndex <= outerIndex; innerIndex++) {
                if (outerIndex != innerIndex) {
                    System.out.print(innerIndex);
                } else {
                    System.out.print(" ");
                }
            } System.out.println();
        }
    }

    public static void rightFaced(int l) {
        for (int outerIndex = 1; outerIndex <= l; outerIndex++) {
            if (outerIndex % 2 != 0)  {
                for (int innerIndex = l; innerIndex >= 1; innerIndex--) {
                    if (outerIndex >= innerIndex) {
                        System.out.print(innerIndex);
                    } else {
                        System.out.print(" ");
                    }
                } System.out.println();
            }
        }
    }

    // same for right faced

    // for (int outerIndex = 1; outerIndex <= l; outerIndex++) {
    //     if (outerIndex % 2 != 0)  {
    //         for (int space = 0; space < l - outerIndex; space++) {
    //             System.out.print(" ");
    //         }
    //         for (int innerIndex = outerIndex; innerIndex >= 1; innerIndex--) {
    //             System.out.print(innerIndex);
    //         } System.out.println(" ");
    //     }
    // }
}
