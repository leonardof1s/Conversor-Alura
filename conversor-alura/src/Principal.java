import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal extends JFrame {

	public static void main(String[] args) {
		  String[] opcoes = {"Conversor de ValoresMoeda", "Conversor de ValoresTemperatura",};

	        String type = JOptionPane.showInputDialog(null, "Escolha:","Menu",
	                        JOptionPane.PLAIN_MESSAGE, null,opcoes,null).toString();
	        if (type == "Conversor de ValoresMoeda"){
	            new ControleMoeda();
	        }else if (type == "Conversor de ValoresTemperatura"){
	            new ValoresTemperatura();
	        }
	    }
	    public void loop(){
	        String[] opcoes = {"Conversor de ValoresMoeda", "Conversor de ValoresTemperatura"};

	        String type = JOptionPane.showInputDialog(null, "Escolha:","Menu",
	                JOptionPane.PLAIN_MESSAGE, null,opcoes,null).toString();
	        if (type == "Conversor de ValoresMoeda"){
	            new ControleMoeda();
	        }else if (type == "Conversor de ValoresTemperatura"){
	            new ValoresTemperatura();
	        }
	        

	}

}
