
public class FullPyramidOfStarsPattern {
	public static void main(String[] args) {
		int a, b,c;
		for (a=1;a <=5 ; a++) {
			for (b=5; b>a; b--) {
				System.out.print(" ");
			}
			for (c=1;c<(2*a) ; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
