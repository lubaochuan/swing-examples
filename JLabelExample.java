import javax.swing.*;

public class JLabelExample{
  JFrame a;

  JLabelExample(){
    a = new JFrame("example");
    String courses[] = { "core Java","advanced Java", "Java Servlet"};
    JComboBox<String> c = new JComboBox<>(courses);
    c.setBounds(40,40,90,20);
    a.add(c);
    a.setSize(400,400);
    a.setLayout(null);
    a.setVisible(true);
  }
  public static void main(String args[]){
    new JLabelExample();
  }
}
