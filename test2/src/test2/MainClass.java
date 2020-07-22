package test2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void manage() {
		int[] age = { 27, 34, 28, 26, 41, 28, 42, 29, 29, 32 };
		char[] gender = { 'F', 'M', 'F', 'M', 'M', 'F', 'M', 'M', 'F', 'M' };
		int sumAge= 0;
		int countAge=0;
		char c='M';
		for (int idx = 0; idx < gender.length; idx++) {
			if (gender[idx] == 'c') {
				sumAge= sumAge+age[idx];
				countAge++;
				System.out.println(sumAge);
			}
		}
	}
}
