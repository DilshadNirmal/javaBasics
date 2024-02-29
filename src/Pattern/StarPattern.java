package Pattern;

public class StarPattern {
    public static void main(String[] args) {
		
		int len = 40;
		int x = len/2, y = len/2, middle = len/5;
		int bLeft = 0+1, bRight = len-1;
		
		
		for (int i = 0; i < len; i++) {
			
			for (int j = 0; j < len; j++) {
				if (middle == i  && j%4 == 0)
					System.out.print("*");
				else if ((i%4) == 0 && middle <= i && (bLeft == j || bRight == j)) {
					System.out.print("*");
				}
				else if((x==j || y==j ) && (i%2) == 0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
			if( (i%2) == 0) {
					x--;
					y++;
			}
			
			if( (i%4) == 0 && middle <= i) {
				bLeft = bLeft + 5;
				bRight = bRight - 5;
			}
		}

	}
}
