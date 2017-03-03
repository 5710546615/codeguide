package SplitYourCodeIntoShort;

/**
 * ListNumber is the class for list of odd or even number.
 * 
 * @author Visurt Anuttivong
 * @version 5710546615
 */

public class ListNumber {

	// TODO rebuild ListOddNumber to be more shorter.
	/**
	 * List odd number from 1 to limit.
	 * 
	 * @param limit
	 *            is the maximum number to be list.
	 */
	public void ListOddNumber(int limit) {
		int i = 0;
		while (true) {
			i++;
			if (i <= limit) {
				if (i % 2 != 0) {
					System.out.print(i + " ");
				}
			} else {
				break;
			}
		}
	}

	// TODO rebuild ListEvenNumber to be more shorter.
	/**
	 * List even number from 1 to limit.
	 * 
	 * @param limit
	 *            is the maximum number to be list.
	 */
	public void ListEvenNumber(int limit) {
		int i = 0;
		while (true) {
			i++;
			if (i <= limit) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			} else {
				break;
			}
		}
	}
}
