public class Armstrong {
	public static void main(String args[]) {

		int temp,cube=0,lastDigit=0,num=371;

		temp = num;
		int i = 0;
		while (temp > 0) {
			System.out.println(i + " Iteration");
			lastDigit = temp % 10;
			cube += Math.pow(lastDigit,3);
			temp /= 10;
			System.out.println("lastDigit = " + lastDigit);
			System.out.println("Cube = " + cube);
			System.out.println("temp = " + temp);
			i++;
		}

		if (num == cube) {
			System.out.println(num + " Armstrong Number");
		} else {
			System.out.println(num + " not a Armstrong Number");
		}

	}
}