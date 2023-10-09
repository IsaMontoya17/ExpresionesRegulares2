package vista;

import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.border.Border;

import bean.Usuario;
import logica.LUsuario;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class PanelImpresion extends JPanel implements ActionListener {
	
	private JPanel panelC;
	private JButton btnMostrarArrayList;
	private JButton btnPorcentaje1;
	private JButton btnCantidadCE;
	private JButton btnCantidadP;
	private JButton btnPromedioOtro;
	public ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();

	/**
	 * Create the panel.
	 */
	public PanelImpresion(JPanel panelC, ArrayList<Usuario> usuarios){
		this.panelC = panelC;
		listaDeUsuarios = usuarios;
		setBackground(new Color(255, 234, 244));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		add(panelSuperior, BorderLayout.NORTH);
		panelSuperior.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBackground(new Color(255, 234, 244));
		panelTitulo.setToolTipText("");
		panelSuperior.add(panelTitulo, BorderLayout.CENTER);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setBackground(new Color(255, 234, 244));
		add(panelInferior, BorderLayout.SOUTH);
		
		JPanel panelCentro = new JPanel();
		panelCentro.setBackground(new Color(255, 234, 244));
		add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(new GridLayout(11, 3, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("");
		panelCentro.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		panelCentro.add(lblNewLabel_3);
		
		JLabel lblNewLabel_7 = new JLabel("");
		panelCentro.add(lblNewLabel_7);
		
		JLabel lblNewLabel_4 = new JLabel("");
		panelCentro.add(lblNewLabel_4);
		
		btnMostrarArrayList = new JButton("MostrarArrayList");
		btnMostrarArrayList.setFont(new Font("Nirmala UI", Font.BOLD, 11));
		panelCentro.add(btnMostrarArrayList);
		btnMostrarArrayList.addActionListener(this);
		btnMostrarArrayList.setBackground(new Color(255, 166, 210));
		Color backgroundColor = btnMostrarArrayList.getBackground();
		Border border = BorderFactory.createLineBorder(backgroundColor);
		btnMostrarArrayList.setBorder(border);
		
		JLabel lblNewLabel_5 = new JLabel("");
		panelCentro.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		panelCentro.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("");
		panelCentro.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panelCentro.add(lblNewLabel_1);
		
		JLabel lblNewLabel_10 = new JLabel("");
		panelCentro.add(lblNewLabel_10);
		
		btnPorcentaje1 = new JButton("Porcentaje de personas que al momento de confirmar el correo electrónico no escribieron lo mismo.");
		btnPorcentaje1.setFont(new Font("Nirmala UI", Font.BOLD, 11));
		panelCentro.add(btnPorcentaje1);
		btnPorcentaje1.addActionListener(this);
		btnPorcentaje1.setBackground(new Color(255, 166, 210));
		btnPorcentaje1.setBorder(border);
		
		JLabel lblNewLabel_8 = new JLabel("");
		panelCentro.add(lblNewLabel_8);
		
		JLabel label = new JLabel("");
		panelCentro.add(label);
		
		JLabel lblNewLabel_21 = new JLabel("");
		panelCentro.add(lblNewLabel_21);
		
		JLabel lblNewLabel_11 = new JLabel("");
		panelCentro.add(lblNewLabel_11);
		
		JLabel lblNewLabel_15 = new JLabel("");
		panelCentro.add(lblNewLabel_15);
		
		btnCantidadCE = new JButton("Cantidad de personas que tienen “cédula de extranjería”");
		btnCantidadCE.setBackground(new Color(255, 166, 210));
		btnCantidadCE.setFont(new Font("Nirmala UI", Font.BOLD, 11));
		btnCantidadCE.setBorder(border);
		btnCantidadCE.addActionListener(this);
		panelCentro.add(btnCantidadCE);
		
		JLabel lblNewLabel_9 = new JLabel("");
		panelCentro.add(lblNewLabel_9);
		
		JLabel lblNewLabel_12 = new JLabel("");
		panelCentro.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("");
		panelCentro.add(lblNewLabel_13);
		
		JLabel lblNewLabel_18 = new JLabel("");
		panelCentro.add(lblNewLabel_18);
		
		JLabel lblNewLabel_14 = new JLabel("");
		panelCentro.add(lblNewLabel_14);
		
		btnCantidadP = new JButton("Cantidad de personas que tienen “Pasaporte”");
		btnCantidadP.setFont(new Font("Nirmala UI", Font.BOLD, 11));
		btnCantidadP.addActionListener(this);
		panelCentro.add(btnCantidadP);
		btnCantidadP.setBackground(new Color(255, 166, 210));
		btnCantidadP.setBorder(border);
		
		JLabel lblNewLabel_16 = new JLabel("");
		panelCentro.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("");
		panelCentro.add(lblNewLabel_17);
		
		JLabel lblNewLabel_22 = new JLabel("");
		panelCentro.add(lblNewLabel_22);
		
		JLabel lblNewLabel_19 = new JLabel("");
		panelCentro.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("");
		panelCentro.add(lblNewLabel_20);
		
		btnPromedioOtro = new JButton("Promedio de personas que tienen como nacionalidad “otro”");
		btnPromedioOtro.setFont(new Font("Nirmala UI", Font.BOLD, 11));
		panelCentro.add(btnPromedioOtro);
		btnPromedioOtro.addActionListener(this);
		btnPromedioOtro.setBackground(new Color(255, 166, 210));
		btnPromedioOtro.setBorder(border);
		
		JLabel lblNewLabel_24 = new JLabel("");
		panelCentro.add(lblNewLabel_24);
		
		JLabel lblNewLabel_23 = new JLabel("");
		panelCentro.add(lblNewLabel_23);
		
		JLabel lblNewLabel_25 = new JLabel("");
		panelCentro.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("");
		panelCentro.add(lblNewLabel_26);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 234, 244));
		add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 234, 244));
		add(panel_1, BorderLayout.EAST);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		LUsuario lUsuario = new LUsuario();
		
		if (e.getSource() == btnMostrarArrayList) {
			
			lUsuario.imprimirInformacionUsuarios(listaDeUsuarios);
			
        }
		if (e.getSource() == btnPorcentaje1) {
			
			
			
        }
		if (e.getSource() == btnCantidadCE) {
			
			lUsuario.contarDocumentosCE(listaDeUsuarios);
			
        }
		if (e.getSource() == btnCantidadP) {
			
			lUsuario.contarDocumentosP(listaDeUsuarios);
			
        }
		if (e.getSource() == btnPromedioOtro) {
			
			lUsuario.calcularPromedioNacionalidadOtro(listaDeUsuarios);
        }
		
	}//CIERRE DEL METODO

}//CIERRE DE LA CLASE
