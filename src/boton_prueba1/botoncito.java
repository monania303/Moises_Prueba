
package boton_prueba1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
public class botoncito extends JFrame{
	//CREAMOS LOS BOTONES
	JButton aceptar = new JButton("Sumar");
	JButton cancelar = new JButton("Restar");
 
	//CREAMOS UN PANEL PARA COLOCAR LOS BOTONES
	JPanel principal = new JPanel(new BorderLayout());
 
	public botoncito(){
		super("Botones");
		principal.add("North", aceptar);
		principal.add("South", cancelar);
 
		getContentPane().add(principal);
 
		//AGREGAMOS TOOL TIPS A LOS BOTONES
		aceptar.setToolTipText("Botón ACEPTAR...");
		cancelar.setToolTipText("Botón CANCELAR...");
 
		pack();
		setResizable(false);
		Dimension pantalla, cuadro;
		pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		cuadro = this.getSize();
 
		this.setLocation(((pantalla.width - cuadro.width)/2), (pantalla.height - cuadro.height)/2);
	}//FIN DEL CONSTRUCTOR DE LA CLASE
 
	public static void main(String g[]){
		double x,y,z;
		x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Primer Parámetro"));
		y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Segundo Parámetro"));
		botoncito p = new botoncito();
		p.show();
 
		p.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				System.exit(0);
			}
		});
		
	}//FIN DEL MAIN
}//FIN DE LA CLASE
