import javax.swing.*;

public class GitExempel {
    public static void main(String[] args) {
        int antal = Integer.parseInt(JOptionPane.showInputDialog("antal siffror?"));
        int[] siffror = new int[antal];
        int i = 0;
        int e = 1;
        double average = 0;
                while(i<antal){
                    siffror[i] = Integer.parseInt(JOptionPane.showInputDialog("tal nummer " + e + "?"));
                            average = average + siffror[i];
                            i = i + 1;
                            e = e + 1;
                }
        average = average / antal;

                System.out.println("medelvärdet på dina tal är " + average);
    }
}
