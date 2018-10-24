package ca141.robward;



public enum Outcome {

    Loss(0),Draw(0),Win(1);

    private final int value;



    private Outcome(int value) {

        this.value = value;

    }

    public int getValue() {

        return this.value;

    }

}