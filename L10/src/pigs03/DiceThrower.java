package pigs03;

public class DiceThrower {
	// 2 dice with face count of 6 each
	private Die die1, die2;
	private int rollCount;
	private int allFaceValue;
	private int value6;
	private int sameFace;
	private int maxSumRoll;

	// TODO: Add fields.
	// Fields:
	// 1. The roll count.
	// 2. The total of all face values rolled.
	// 3. The count of face value 6.
	// 4. The count of same face value on both dice.
	// 5. The maximum sum of the face values in one roll.
	// Remember to update fields, when the dice are rolled.

	/**
	 * Creates a DiceThrower object.
	 */
	// TODO: Make a constructor that initialises all fields.
	public DiceThrower(){
		die1 = new Die();
		die2 = new Die();
		this.rollCount = 0;
		this.allFaceValue = 0;
		this.value6 = 0;
		this.sameFace = 0;
		this.maxSumRoll = 0;
	}

	// TODO: Add get methods for the fields.


	public Die getDie1() {
		return die1;
	}

	public Die getDie2() {
		return die2;
	}

	public int getRollCount() {
		return rollCount;
	}

	public int getAllFaceValue() {
		return allFaceValue;
	}

	public int getValue6() {
		return value6;
	}

	public int getSameFace() {
		return sameFace;
	}

	public int getMaxSumRoll() {
		return maxSumRoll;
	}

	/**
	 * Rolls the 2 dice.
	 */
	public void roll() {
		// TODO: Roll the 2 dice.
		die1.roll();
		die2.roll();
		rollCount = rollCount + 1;
		allFaceValue = die1.getFaceValue() + die2.getFaceValue() + allFaceValue;
		if (die1.getFaceValue() == 6){
			value6 = value6 + 1;
		}
		if (die2.getFaceValue() == 6){
			value6 = value6 + 1;
		}
		if (die1.getFaceValue() == die2.getFaceValue()){
			sameFace = sameFace + 1;
		}
		if (die1.getFaceValue() + die2.getFaceValue() >= maxSumRoll){
			maxSumRoll = die1.getFaceValue() + die2.getFaceValue();
		}
	}

	/**
	 * Returns the sum of the face values in a roll.
	 */
	public int sum() {
		// TODO
		return die1.getFaceValue() + die2.getFaceValue();
	}

	/**
	 * Returns a textual description of the roll of the 2 dice.
	 * Example: Returns "(4,5)" for a roll of 4 and 5.
	 */
	public String rollDescription() {
		// TODO: Use the method: String.format().
		return String.format("(%d,%d)", die1.getFaceValue(),die2.getFaceValue());
	}
}
