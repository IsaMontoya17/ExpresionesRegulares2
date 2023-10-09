package vista;

import javax.swing.JPanel;
import javax.swing.border.Border;

import bean.Usuario;
import vista.PanelImpresion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PanelMenuPrincipal extends JPanel implements ActionListener{

	private JPanel panelCentro;
	private JButton btnRegresar;
	private JButton btnRegistro;
	private JButton btnImpresión;
	private JButton btnSalir;
	public ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
	/**
	 * Create the panel.
	 */
	public PanelMenuPrincipal(JPanel panelCentro, ArrayList<Usuario> usuarios) {
		setLayout(new GridLayout(0, 4, 0, 0));
		this.panelCentro = panelCentro;
		listaDeUsuarios = usuarios;
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Nirmala UI", Font.BOLD, 11));
		Color backgroundColor = btnRegresar.getBackground();
		Border border = BorderFactory.createLineBorder(backgroundColor);
		btnRegresar.setBorder(border);
		add(btnRegresar);
		btnRegresar.setBackground(new Color(250, 141, 199));
		btnRegresar.addActionListener(this);
		
		btnRegistro = new JButton("Registrarse");
		btnRegistro.setFont(new Font("Nirmala UI", Font.BOLD, 11));
		btnRegistro.setBorder(border);
		add(btnRegistro);
		btnRegistro.setBackground(new Color(250, 141, 199));
		btnRegistro.addActionListener(this);
		
		btnImpresión = new JButton("Impresión");
		btnImpresión.setFont(new Font("Nirmala UI", Font.BOLD, 11));
		btnImpresión.setBorder(border);
		add(btnImpresión);
		btnImpresión.setBackground(new Color(250, 141, 199));
		btnImpresión.addActionListener(this);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Nirmala UI", Font.BOLD, 11));
		btnSalir.setBorder(border);
		add(btnSalir);
		btnSalir.setBackground(new Color(250, 141, 199));
		btnSalir.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource() == btnSalir) {
			System.exit(0);
		}
		
		if (e.getSource() == btnImpresión) {
			
			panelCentro.removeAll();
			PanelImpresion panelImpresion = new PanelImpresion(panelCentro, listaDeUsuarios);
			panelCentro.setLayout(new BorderLayout());
            panelCentro.add(panelImpresion, BorderLayout.CENTER);
            panelCentro.revalidate();
            panelCentro.repaint();
			
		}		
		
		if (e.getSource() == btnRegistro) {
			
			panelCentro.removeAll();
            PanelRegistro panelRegistro = new PanelRegistro(panelCentro, listaDeUsuarios);
            panelCentro.setLayout(new BorderLayout());
            panelCentro.add(panelRegistro, BorderLayout.CENTER);
            panelCentro.revalidate();
            panelCentro.repaint();

		}
		
		
		if(e.getSource() == btnRegresar) {
			
			panelCentro.removeAll();
			PanelRegreso panelRegreso = new PanelRegreso();
			panelCentro.setLayout(new BorderLayout());
            panelCentro.add(panelRegreso, BorderLayout.CENTER);
            panelCentro.revalidate();
            panelCentro.repaint();
		}
		
	}

}
