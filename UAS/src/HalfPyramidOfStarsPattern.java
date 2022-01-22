
public class HalfPyramidOfStarsPattern {
	public static void main(String[] args) {
		int i, j;
		for (i=1; i<=7; i++) {
			for (j=1; j<=i; j++) {
				//untuk mencetak bintang tanpa baris baru gunakan print bukan println//
				System.out.print("* "); 
			}
			System.out.println(); //membuat line baru//
		}
	}
}
