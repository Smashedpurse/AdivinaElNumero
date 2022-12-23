package com.cofacademy.exercise;

import javax.swing.*;

public class Exercise {
    public static void main(String[] args) {

        String math = JOptionPane.showInputDialog("Insert the Math calification");
        float mathScore = Float.parseFloat(math);
        String spanish = JOptionPane.showInputDialog("Insert the Spanish calification");
        float spanishScore = Float.parseFloat(spanish);
        String french = JOptionPane.showInputDialog("Insert the French calification");
        float frenchScore = Float.parseFloat(french);
        String History = JOptionPane.showInputDialog("Insert the History calification");
        float HistoryScore = Float.parseFloat(History);
        String Chemistry = JOptionPane.showInputDialog("Insert the Chemistry calification");
        float ChemistryScore = Float.parseFloat(Chemistry);


        float schoolGrades [] = {mathScore + spanishScore + frenchScore + HistoryScore + ChemistryScore};
        float schoolSubjects [] = {mathScore , spanishScore , frenchScore, HistoryScore,ChemistryScore };

        for (float result: schoolGrades
             ) {
            JOptionPane.showMessageDialog(null,"The result of your school Grades is  " + result / schoolSubjects.length);
        }
    }
}
