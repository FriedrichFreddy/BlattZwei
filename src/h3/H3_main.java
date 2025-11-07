package h3;

public class H3_main {
	public static void main(String[] args) {
		int max = 670;
		int fix = 420;
		int wartend = 23;
		boolean istVoll = false;
		int freiePlaetze = max - fix;
		
		if (freiePlaetze == 0) {
			istVoll = true;
		} else if (freiePlaetze >= wartend) {
			if (freiePlaetze > wartend) istVoll = false;
			if (freiePlaetze == wartend) istVoll = true;
			fix = fix + wartend;
			wartend = 0;
		} else if (freiePlaetze < wartend) {
			fix = fix + freiePlaetze;
			wartend = wartend - freiePlaetze;
			istVoll = true;
		}
		
		System.out.println("max: " + max);
		System.out.println("fix: " + fix);
		System.out.println("wartend: " + wartend);
		System.out.println("istVoll: " + istVoll);
	}
}
