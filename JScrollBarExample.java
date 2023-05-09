import javax.swing.*;

class JScrollBarExample{
  public static void main(String args[]) {
    JFrame a = new JFrame("example");
    JScrollBar b = new JScrollBar();
    b.setBounds(90,90,40,90);
    a.add(b);
    a.setSize(300,300);
    a.setLayout(null);
    a.setVisible(true);
  }
}
