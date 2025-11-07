package h2;

public class H2_main {
	public static void main(String[] args) {
		int jahr = 1818;
		boolean schalt = false;
		int a = jahr % 4;
		int b = jahr % 100;
		int c = jahr % 400;
		if (a == 0) {
			schalt = true;			//durch 4 teilbar
			if (b == 0) {
				schalt = false;		//durch 100 teilbar
				if (c == 0) {
					schalt = true;	//durch 400 teilbar
				}
			}
		}
		System.out.println("schalt: " + schalt);
	}
}
