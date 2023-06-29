import java.util.Scanner;

class testInput {
	public static void main(String[] args) {
		var s1 = new Scanner(System.in);
		var s2 = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			var s1Has = s1.hasNextInt();
			System.out.println("s1 has int: " + s1Has);
			if (s1Has) System.out.println("s1: " + s1.nextInt());

			var s2Has = s2.hasNextInt();
			System.out.println("s2 has int: " + s2Has);
			if (s2Has) System.out.println("s2: " + s2.nextInt());
		}
	}
}
