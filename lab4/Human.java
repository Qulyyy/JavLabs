package lab4;

public class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }
    public Head getHead() {
        return head;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

}

class Head {
    private String hairColor;
    private int eyeColor;

    public Head(String hairColor, int eyeColor) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getEyeColor() {
        return eyeColor;
    }

}

class Leg {
    private int length;

    public Leg(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

}

class Hand {
    private boolean hasFingers;
    private int fingerCount;

    public Hand(boolean hasFingers, int fingerCount) {
        this.hasFingers = hasFingers;
        this.fingerCount = fingerCount;
    }

    public boolean hasFingers() {
        return hasFingers;
    }

    public int getFingerCount() {
        return fingerCount;
    }

}