package h1;

public class H1_main {
	public static void main(String[] args) {
		double guthaben = 9376.95;
		double monEingang = 48.05;
		int rating = 5;
		boolean warnhinweis = false;
		boolean negativ = false;
		if (guthaben < 0) {
			negativ = true;
		} else negativ = false;
		if (guthaben > 0) {
			rating = rating + 3;
		}
		if (guthaben == 0) {
			rating = rating + 2;
		}
		if (guthaben < 0 && monEingang >= (guthaben * -1)) {
			rating = rating + 1;
		}
		if (guthaben < 0 && monEingang < (guthaben * -1)) {
			rating = rating - 1;
		}
		if (guthaben < 0 && monEingang < (guthaben * -1) && rating < 0) {
			warnhinweis = true;
		}
		System.out.println("rating: " + rating);
		System.out.println("warnhinweis: " + warnhinweis);
		System.out.println("negativ: " + negativ);
	}
}
