public class Abecedarian {
	public static void main(String[] args) {
		System.out.print(isAbecedarian("acorsy"));
	}
	public static boolean isAbecedarian(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) > str.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}
}
