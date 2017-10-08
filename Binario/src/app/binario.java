package app;

public class binario {

	public static String bin(int n) {
		int resu = n % 2;
		if (n <= 1)
			return "" + resu;
		else
			return "" + bin((n - resu) / 2) + " " + resu;
	}
}
