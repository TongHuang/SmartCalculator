package com.smart.smartcalculator;

import java.util.Vector;

/**
 * Created by Shan on 2015-02-02.
 */
public class Practice {
    public enum PRACTICE_TYPE {ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION}

    public static enum PRACTICE_SCOPE {ZERO_TEN, ZERO_TWENTY, ZERO_FIFTY, ZERO_HUNDRED}

    private PRACTICE_TYPE type = PRACTICE_TYPE.ADDITION;
    private PRACTICE_SCOPE scope = PRACTICE_SCOPE.ZERO_TEN;
    private String expression = "";
    private Integer answer = 0;

    Integer[] choices = new Integer[4];

    public int getChoiceOne() {
        return choices[0];
    }

    public int getChoiceTwo() {
        return choices[1];
    }

    public int getChoiceThree() {
        return choices[2];
    }

    public int getChoiceFour() {
        return choices[3];
    }

    public String getExpression() {
        return expression;
    }

    public Integer getAnswer() {
        return answer;
    }

    public PRACTICE_TYPE getType() {
        return type;
    }

    public void setType(PRACTICE_TYPE type) {
        this.type = type;
    }

    public PRACTICE_SCOPE getScope() {
        return scope;
    }

    public void setScope(PRACTICE_SCOPE scope) {
        this.scope = scope;
    }

    public void generateTest() {

        Integer firstPara;
        Integer secondPara;

        switch (type) {
            case ADDITION:
                switch (scope) {
                    case ZERO_TEN:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 10);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 10);
                        this.expression = firstPara + "+" + secondPara;
                        this.answer = firstPara + secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, 0, 20).toArray(this.choices);
                        break;
                    case ZERO_TWENTY:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 20);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 20);
                        this.expression = firstPara + "+" + secondPara;
                        this.answer = firstPara + secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, 0, 40).toArray(this.choices);
                        break;
                    case ZERO_FIFTY:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 50);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 50);
                        this.expression = firstPara + "+" + secondPara;
                        this.answer = firstPara + secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, 0, 100).toArray(this.choices);
                        break;
                    case ZERO_HUNDRED:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 100);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 100);
                        this.expression = firstPara + "+" + secondPara;
                        this.answer = firstPara + secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, 0, 200).toArray(this.choices);
                        break;
                }
                break;
            case SUBTRACTION:
                switch (scope) {
                    case ZERO_TEN:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 10);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 10);
                        this.expression = firstPara + "-" + secondPara;
                        this.answer = firstPara - secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, -10, 10).toArray(this.choices);
                        break;
                    case ZERO_TWENTY:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 20);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 20);
                        this.expression = firstPara + "-" + secondPara;
                        this.answer = firstPara - secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, -20, 20).toArray(this.choices);
                        break;
                    case ZERO_FIFTY:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 50);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 50);
                        this.expression = firstPara + "-" + secondPara;
                        this.answer = firstPara - secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, -50, 50).toArray(this.choices);
                        break;
                    case ZERO_HUNDRED:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 100);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 100);
                        this.expression = firstPara + "-" + secondPara;
                        this.answer = firstPara - secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, -100, 100).toArray(this.choices);
                        break;
                }
                break;
            case MULTIPLICATION:
                switch (scope) {
                    case ZERO_TEN:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 10);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 10);
                        this.expression = firstPara + "*" + secondPara;
                        this.answer = firstPara * secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, 0, 100).toArray(this.choices);
                        break;
                    case ZERO_TWENTY:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 20);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 20);
                        this.expression = firstPara + "*" + secondPara;
                        this.answer = firstPara * secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, 0, 400).toArray(this.choices);
                        break;
                    case ZERO_FIFTY:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 50);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 50);
                        this.expression = firstPara + "*" + secondPara;
                        this.answer = firstPara * secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, 0, 2500).toArray(this.choices);
                        break;
                    case ZERO_HUNDRED:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 100);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 100);
                        this.expression = firstPara + "*" + secondPara;
                        this.answer = firstPara * secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, 0, 10000).toArray(this.choices);
                        break;
                }
                break;
            case DIVISION:
                switch (scope) {
                    case ZERO_TEN:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 10);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 10);
                        this.expression = firstPara + "/" + secondPara;
                        this.answer = firstPara / secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, 0, 10).toArray(this.choices);
                        break;
                    case ZERO_TWENTY:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 20);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 20);
                        this.expression = firstPara + "/" + secondPara;
                        this.answer = firstPara / secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, 0, 20).toArray(this.choices);
                        break;
                    case ZERO_FIFTY:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 50);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 50);
                        this.expression = firstPara + "/" + secondPara;
                        this.answer = firstPara / secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, 0, 50).toArray(this.choices);
                        break;
                    case ZERO_HUNDRED:
                        firstPara = (int) StrictMath.round(StrictMath.random() * 100);
                        secondPara = (int) StrictMath.round(StrictMath.random() * 100);
                        this.expression = firstPara + "/" + secondPara;
                        this.answer = firstPara / secondPara;
                        this.choices = (Integer[]) this.mixAnswerIntoOtherChoices(4, this.answer, 0, 100).toArray(this.choices);
                        break;
                }
                break;
        }

    }

    private Vector<Integer> mixAnswerIntoOtherChoices(Integer choiceNumber, Integer answer, Integer min, Integer max) {
        Integer scope = max - min;
        Vector<Integer> answers = new Vector<Integer>();
        Integer choice;
        while (answers.size() < choiceNumber - 1) {
            choice = (int) StrictMath.round(StrictMath.random() * scope) + min;
            if (!answers.contains(choice) && choice != answer) {
                answers.add(choice);
            }
        }
        Integer answerPosition = (int) StrictMath.round(StrictMath.random() * (choiceNumber-1));
        answers.insertElementAt(answer, answerPosition);

        return answers;
    }
}
