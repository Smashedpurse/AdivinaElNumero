package com.cofacademy.exercise;

import javax.swing.*;

public class Exercise {
    public static void main(String[] args) {

        String math = JOptionPane.showInputDialog("Insert the math calification");
        float mathScore = Float.parseFloat(math);
        String spanish = JOptionPane.showInputDialog("Insert the spanish calification");
        float spanishScore = Float.parseFloat(spanish);
        String french = JOptionPane.showInputDialog("Insert the spanish calification");
        float frenchScore = Float.parseFloat(french);
        String History = JOptionPane.showInputDialog("Insert the spanish calification");
        float HistoryScore = Float.parseFloat(History);

        float schoolGrades [] = {mathScore + spanishScore + frenchScore + HistoryScore};
        float schoolSubjects [] = {mathScore , spanishScore , frenchScore, HistoryScore };

        for (float result: schoolGrades
             ) {
            System.out.println(result / schoolSubjects.length);
        }
    }
}
