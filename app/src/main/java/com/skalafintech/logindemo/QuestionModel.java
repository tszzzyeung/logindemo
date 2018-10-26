package com.skalafintech.logindemo;

/**
 * should be converted from backend data
 * dunno how to do
 */
public class QuestionModel {


    private int ID;
    private String strQuestion="";
    private String[] choiceList ;

    public QuestionModel(int ID, String strQuestion, String[] choiceList){
        this.ID = ID;
        this.strQuestion = strQuestion;
        this.choiceList = choiceList;
    }
    public int getID() {
        return ID;
    }

    public String getStrQuestion() {
        return strQuestion;
    }

    public String[] getChoiceList() {
        return choiceList;
    }
}
