package crapsGame01;


public class DiceThrower {
    // 2 dice with face count of 6 each
    private Die die1, die2;
    private int rollCount;
    private int allFaceValue;
    private int Value6;
    private int same;
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
        this.allFaceValue = 0;
        this.rollCount = 0;
        this.Value6 = 0;
        this.same = 0;
        this.maxSumRoll = 0;
    }


    // TODO: Add get methods for the fields.


    public Die getDie1() {
        return die1;
    }

    public Die getDie2() {
        return die2;
    }

    public int getAllFaceValue() {
        return allFaceValue;
    }

    public int getMaxSumRoll() {
        return maxSumRoll;
    }

    public int getRollCount() {
        return rollCount;
    }

    public int getSame() {
        return same;
    }

    public int getValue6() {
        return Value6;
    }


    /**
     * Rolls the 2 dice.
     */
    // TODO: Roll the 2 dice.
    public void roll() {
        die1.roll();
        die2.roll();
        rollCount = rollCount +1;
        allFaceValue = die1.getFaceValue() + die2.getFaceValue() + allFaceValue;
        if (die1.getFaceValue() == 6){
            Value6 = Value6 +1;
        }
        if (die2.getFaceValue() == 6){
            Value6 = Value6 +1;
        }
        if (die1.getFaceValue()+die2.getFaceValue() >=maxSumRoll){
            maxSumRoll = die1.getFaceValue()+die2.getFaceValue();
        }


        if (die2.getFaceValue() == die1.getFaceValue()){
            same = same+1;
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
        return String.format("(%d , %d)", die1.getFaceValue(), die2.getFaceValue());
    }
}
