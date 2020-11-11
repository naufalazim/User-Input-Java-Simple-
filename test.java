import javax.swing.JOptionPane;

public class test {

    public static void main(String[] args) {
        
String programmingmarkString = JOptionPane.showInputDialog("Enter programming markah");
double  programmingmark = Double.parseDouble(programmingmarkString);

String computermarkString = JOptionPane.showInputDialog("Enter architecture markah");
double  computermark = Double.parseDouble(computermarkString);

if (programmingmark >= 80)
if (computermark >=80)
   JOptionPane.showMessageDialog(null, "Tahniah! Teruskan konsisten!");
else
   JOptionPane.showMessageDialog(null, "Usaha lagi bossku!");

    }

}


