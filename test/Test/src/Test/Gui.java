//Imports are listed in full to show what's being used
//could just import javax.swing.* and java.awt.* etc..

package Test;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Gui {
//Note: Typically the main method will be in a
//separate class. As this is a simple one class
//example it's all in the one class.
public static void main(String[] args) {
new Gui();
}
public Gui()
{
JFrame guiFrame = new JFrame();
//make sure the program exits when the frame closes
guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
guiFrame.setTitle("Fruits");
guiFrame.setSize(500,250);
guiFrame.setAlwaysOnTop(true);
//This will center the JFrame in the middle of the screen
guiFrame.setLocationRelativeTo(null);
//Options for the JComboBox
String[] fruitOptions = {"Apple", "Apricot", "Banana"
,"Cherry", "Date", "Kiwi", "Orange", "Pear", "Strawberry"};
//Options for the JList
String[] vegOptions = {"Asparagus", "Beans", "Broccoli", "Cabbage"
, "Carrot", "Celery", "Cucumber", "Leek", "Mushroom"
, "Pepper", "Radish", "Shallot", "Spinach", "Swede"
, "Turnip","xyz"};
//The first JPanel contains a JLabel and JCombobox
final JPanel comboPanel = new JPanel();
comboPanel.setVisible(true);
JLabel comboLbl = new JLabel("Fruits:");
JComboBox fruits = new JComboBox(vegOptions);
comboPanel.add(comboLbl);
comboPanel.add(fruits);
//Create the second JPanel. Add a JLabel and JList and
//make use the JPanel is not visible.
final JPanel listPanel = new JPanel();
listPanel.setVisible(true);
JLabel listLbl = new JLabel("Vegetables:");
JList vegs = new JList(fruitOptions);
vegs.setLayoutOrientation(JList.HORIZONTAL_WRAP);
listPanel.add(listLbl);
listPanel.add(vegs);
JButton vegFruitBut = new JButton( "Fruit or Veg");
//The ActionListener class is used to handle the
//event that happens when the user clicks the button.
//As there is not a lot that needs to happen we can
//define an anonymous inner class to make the code simpler.
vegFruitBut.addActionListener(new ActionListener()
{
@Override
public void actionPerformed(ActionEvent event)
{
//When the fruit of veg button is pressed
//the setVisible value of the listPanel and
//comboPanel is switched from true to
//value or vice versa.
listPanel.setVisible(!listPanel.isVisible());
comboPanel.setVisible(!comboPanel.isVisible());
}
});
//The JFrame uses the BorderLayout layout manager.
//Put the two JPanels and JButton in different areas.
guiFrame.add(comboPanel, BorderLayout.SOUTH);
guiFrame.add(listPanel, BorderLayout.WEST);
guiFrame.add(vegFruitBut,BorderLayout.PAGE_START);
//make sure the JFrame is visible
guiFrame.setVisible(true);
}
}
