import javax.swing.*;

public class CUI1_JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창이름");
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼 -> 끝
    }
}
