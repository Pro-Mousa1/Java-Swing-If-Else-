import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String mark = JOptionPane.showInputDialog("Enter marks");
        int a=Integer.parseInt(mark);
        System.out.println("Your grade is: ");
        if (a>=70 && a<=100) {
            System.out.println('A');
        } else if (a>=60 && a<69) {
            System.out.println('B');
        } else if (a>=50 && a<=59) {
            System.out.println('C');
        } else if (a>=40 && a<=49) {
            System.out.println('D');
        } else if (a>=0 && a<=39) {
            System.out.println('E');
        }else{
            System.out.println("Invalid marks entered. Marks should between 0 to 100");
        }

        String math = JOptionPane.showInputDialog("Enter Mathematics marks");
        int b=Integer.parseInt(math);
        String eng = JOptionPane.showInputDialog("Enter English marks");
        int c=Integer.parseInt(eng);
        String kisw = JOptionPane.showInputDialog("Enter Kiswahili marks");
        int d=Integer.parseInt(kisw);
        double average;
        char grade = 0 ;

        System.out.println("Mathematics: "+b);
        System.out.println("English: "+c);
        System.out.println("Kiswahili: "+d);
        System.out.println();

        average= (float) (b + c + d) /3;
        System.out.println("The average grade of the subjects is: "+average);

        System.out.println();
        if (average>=70 && average<=100) {
            grade='A';
        } else if (average>=60 && average<69) {
            grade='B';
        } else if (average>=50 && average<=59) {
            grade='C';
        } else if (average>=40 && average<=49) {
            grade='D';
        } else if (average>=0 && average<=39) {
            grade='E';
        }else{
            System.out.println("Invalid marks entered. Marks should between 0 to 100");
        }
        System.out.println("Your grade is: "+grade);

        System.out.println();

        if (b>c && b>d) {
            System.out.println("Mathematics is greater than English and Kiswahili.");
        } else if (c>b && c>d) {
            System.out.println("English is greater than Mathematics and Kiswahili.");
        }else if (d>c && d>b){
            System.out.println("Kiswahili is greater than Mathematics and English.");
        }else{
            System.out.println("Marks must be entered");
        }
        System.out.println();

        if (b<c && b<d) {
            System.out.println("Mathematics is less than both English and Kiswahili.");
        } else if (c<b && c<d) {
            System.out.println("English is less than both Mathematics and Kiswahili.");
        }else if (d<c && d<b){
            System.out.println("Kiswahili is less than both Mathematics and English.");
        }else{
            System.out.println("Marks must be entered");
        }
    }
}