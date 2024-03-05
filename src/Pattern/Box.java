package Pattern;

public class Box {

	public static void main(String[] args) {
		int n=17;
		box(n);
	}
	public static void box(int n) {
		int mid=n/2;
		for(int row=0;row<n;row++) {
			for(int col=0;col<n;col++) {
				// int up=mid+col;
				if(row==0&&col<=mid||col==mid||row==mid||col==0&&row<=mid||
						row==n-1&&col>=mid&&row>=mid||col==n-1&&row>=mid||
						row+col==mid||mid>=col&&row+col==mid||
						mid>=col&&mid>=row&&mid+col==row||row==col||row+col-(mid)==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
    }
}
