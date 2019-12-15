public class SquaringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 5, 10, 2 };
		int[] answers = squareArray(numbers);
		for (int i = 0; i <= answers.length - 1; i++) {
			System.out.print(answers[i] + " ");
		}
			
	}

	public static int[] squareArray(int[] numbers) {
		int[] result = new int[numbers.length];
		for (int i = 0; i <= numbers.length - 1; i = i++) {
			result[i] = numbers[i] * numbers[i];
		}
		return result;
	}
}
