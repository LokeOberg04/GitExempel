import javax.swing.*;

public class GitExempel {
    public static void main(String[] args) {
        int antal = Integer.parseInt(JOptionPane.showInputDialog("antal siffror?"));
        int[] siffror = new int[antal];
        int i = 1;
                while(i<antal){
                    int[i] siffror = JOptionPane.showInputDialog("tal nummer " + i + "?");
                            i = i + 1;
                }
    }
}
