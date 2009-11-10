package lpcprojects.schoolprograms.SpecialNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Abhishek
 */
public class Magic {

			static int num;
			static BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

			/**
			 * @param args the command line arguments
			 * @throws IOException
			 */
			public static void main(String[] args) throws IOException {
						for (;;) {
									input();
									if (isMagic()) {
												System.out.println("The number is a Magic number.");
									} else {
												System.out.println("The number is not a Magic number.");
									}
									System.out.println();
									System.out.println("Do you want to continue?(yes/no)");
									if (BR.readLine().equalsIgnoreCase("no")) {
												break;
									}
									System.out.println();
						}
			}

			static void input() throws IOException {
						System.out.print("Enter the number: ");
						num = Integer.parseInt(BR.readLine());
			}

			/**
			 *
			 * @param num
			 * @return
			 */
			public static boolean isMagic() {
						int n = num;
						int sum = 0;
						while (n >= 10) {
									sum = 0;
									while (n >= 1) {
												sum += n % 10;
												n /= 10;
									}
									n = sum;
						}
						if (sum == 1) {
									return true;
						} else {
									return false;
						}
			}
}
