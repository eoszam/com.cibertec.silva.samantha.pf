package problema2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Procesar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlquilerLocalComercial alquilerLocal = new AlquilerLocalComercial(111, "Miguel Silva", 8, 5, 150);
		        mostrarAlquilerLocal(alquilerLocal);

		        AlquilerAirbnb alquilerAirbnb = new AlquilerAirbnb(777, "Paola Perez", 12, 100);
		        mostrarAlquilerAirbnb(alquilerAirbnb);
			}
		    public void mostrarAlquilerLocal(AlquilerLocalComercial alquiler) {
		    	imrpimir("Datos del Alquiler Local Comercial:");
		    	imrpimir("Código: " + alquiler.getCodigoCliente());
		    	imrpimir("Cliente: " + alquiler.getNombreCliente());
		    	imrpimir("Días: " + alquiler.getDiasAlquiler());
		    	imrpimir("Meses: " + alquiler.getMesesAlquiler());
		    	imrpimir("Metraje: " + alquiler.getMetraje());
		    	imrpimir("Costo: " + alquiler.costoAlquiler());
		    	imrpimir("Resumen: " + alquiler.caracterizar()+"\n");
		    }
		    public void mostrarAlquilerAirbnb(AlquilerAirbnb alquiler) {
		    	imrpimir("Datos del Alquiler Airbnb:");
		    	imrpimir("Código: " + alquiler.getCodigoCliente());
		    	imrpimir("Nombre: " + alquiler.getNombreCliente());
		    	imrpimir("Días: " + alquiler.getDiasAlquiler());
		    	imrpimir("Tarifa Diaria: " + alquiler.getTarifaDiaria());
		    	imrpimir("Costo: " + alquiler.costoAlquiler());
		    	imrpimir("Resumen: " + alquiler.caracterizar());
			}
		});
		btnNewButton.setBounds(351, 358, 85, 21);
		contentPane.add(btnNewButton);
		
		txtArea = new JTextArea();
		txtArea.setBounds(10, 10, 426, 338);
		contentPane.add(txtArea);
	}
	public void imrpimir(String texto) {
		txtArea.append(texto+"\n");
	}
}
