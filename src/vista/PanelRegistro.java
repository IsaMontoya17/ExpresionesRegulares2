package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

import bean.Usuario;
import logica.LUsuario;
import javax.swing.JPasswordField;

public class PanelRegistro extends JPanel implements ActionListener {

	private JTextField textApellidos;
	private JTextField textNombres;
	private JComboBox<String> comboBoxTipoID;
	private JComboBox<String> comboBoxLugarResidencia;
	private JTextField textNumeroID;
	private JTextField textCorreoElectronico;
	private JTextField textConfirmacionCorreo;
	private JTextField textNumeroCel;
	private JPanel panelC;
	private JPasswordField passwordFieldContraseña;
	private JPasswordField passwordField_1ConfirmarContraseña;

	public PanelRegistro(JPanel panelC) {

		this.panelC = panelC;

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
		panelCentro.setLayout(new GridLayout(13, 2, 0, 0));

		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(lblNombres);

		textNombres = new JTextField();
		textNombres.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(textNombres);
		textNombres.setColumns(10);

		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblApellidos.setBackground(new Color(255, 234, 244));
		panelCentro.add(lblApellidos);

		textApellidos = new JTextField();
		textApellidos.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(textApellidos);
		textApellidos.setColumns(10);

		JLabel lblTipoID = new JLabel("Tipo de identificación");
		lblTipoID.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(lblTipoID);

		String[] opcionesSexo = { "1. Femenino", "2. Masculino" };
		comboBoxTipoID = new JComboBox<>();
		comboBoxTipoID.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		comboBoxTipoID.setModel(new DefaultComboBoxModel(
				new String[] { "Cédula de Ciudadanía", "Cédula de Extranjería", "Pasaporte" }));
		panelCentro.add(comboBoxTipoID);

		JLabel lblNumeroID = new JLabel("Número de documento");
		lblNumeroID.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(lblNumeroID);

		textNumeroID = new JTextField();
		textNumeroID.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(textNumeroID);
		textNumeroID.setColumns(10);

		JLabel lblLugarResidencia = new JLabel("Lugar donde vives");
		lblLugarResidencia.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(lblLugarResidencia);
		comboBoxLugarResidencia = new JComboBox<>();
		comboBoxLugarResidencia.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		comboBoxLugarResidencia.setModel(new DefaultComboBoxModel(
				new String[] { "Los Santos", "Liberty City", "Vice City", "San Fierro", "Las Venturas", "Blaine County",
						"Grove Street", "Mount Chiliad", "Bahía de Paleto", "El Desierto de Aldea del El Quebrados" }));
		panelCentro.add(comboBoxLugarResidencia);

		JLabel lblNumeroCel = new JLabel("Número celular");
		lblNumeroCel.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(lblNumeroCel);

		textNumeroCel = new JTextField();
		textNumeroCel.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(textNumeroCel);
		textNumeroCel.setColumns(10);

		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(lblNacionalidad);

		JComboBox comboBoxNacionalidad = new JComboBox();
		comboBoxNacionalidad.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		comboBoxNacionalidad.setModel(new DefaultComboBoxModel(new String[] { "Colombiano(a)", "otro" }));
		panelCentro.add(comboBoxNacionalidad);

		JLabel lblCorreoElectronico = new JLabel("Correo electrónico");
		lblCorreoElectronico.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(lblCorreoElectronico);

		textCorreoElectronico = new JTextField();
		textCorreoElectronico.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(textCorreoElectronico);
		textCorreoElectronico.setColumns(10);

		JLabel lblConfirmacionCorreo = new JLabel("Confirmar correo electrónico");
		lblConfirmacionCorreo.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(lblConfirmacionCorreo);

		textConfirmacionCorreo = new JTextField();
		textConfirmacionCorreo.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(textConfirmacionCorreo);
		textConfirmacionCorreo.setColumns(10);

		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(lblContraseña);

		String[] opcionesSeguimiento = { "1. Actividad física", "2. Alimentación", "3. Sueño" };

		passwordFieldContraseña = new JPasswordField();
		passwordFieldContraseña.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(passwordFieldContraseña);

		JLabel lblConfirmarContraseña = new JLabel("Confirmar contraseña");
		lblConfirmarContraseña.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(lblConfirmarContraseña);

		passwordField_1ConfirmarContraseña = new JPasswordField();
		passwordField_1ConfirmarContraseña.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		panelCentro.add(passwordField_1ConfirmarContraseña);

		JLabel lblNewLabel_4 = new JLabel();
		panelCentro.add(lblNewLabel_4);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBackground(new Color(255, 128, 191));
		btnRegistrar.setFont(new Font("Nirmala UI", Font.BOLD, 11));
		Color backgroundColor = btnRegistrar.getBackground();
		Border border = BorderFactory.createLineBorder(backgroundColor);
		btnRegistrar.setBorder(border);
		btnRegistrar.addActionListener(this);
		panelCentro.add(btnRegistrar);

		JLabel lblNewLabel_6 = new JLabel();
		panelCentro.add(lblNewLabel_6);

		JLabel lblNewLabel_8 = new JLabel();
		panelCentro.add(lblNewLabel_8);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 234, 244));
		add(panel, BorderLayout.WEST);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 234, 244));
		add(panel_1, BorderLayout.EAST);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Registrar")) {
			if (validarCampos()) {
				Usuario usuario = capturaDatos();
				LUsuario lUsuario = new LUsuario();
				lUsuario.registrarUsuario(usuario);
				panelC.remove(this);
				panelC.revalidate();
				panelC.repaint();
			}
		}

	}// CIERRE DEL METODO

	private boolean validarCampos() {

		String apellidos = textApellidos.getText();
		String nombres = textNombres.getText();
		String id = textNumeroID.getText();
		String numeroCel = textNumeroCel.getText();
		String correo = textCorreoElectronico.getText();
		String confirmacionCorreo = textConfirmacionCorreo.getText();

		if (!numeroCel.matches("[0-9]+")) {
			JOptionPane.showMessageDialog(this, "El número de celular debe ser un número entero.", "Error",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}

		return true;

	}// CIERRE DEL METODO

	private Usuario capturaDatos() {

		Usuario usuario = new Usuario();

		usuario.setNombres(textNombres.getText());
		usuario.setApellidos(textApellidos.getText());
		// tipo id
		usuario.setId(textNumeroID.getText());
		// lugar residencia
		usuario.setNumeroCel(textNumeroCel.getText());
		// nacionalidad
		usuario.setCorreoElectronico(textCorreoElectronico.getText());
		usuario.setContraseña(passwordFieldContraseña.getText());

		return usuario;

	}// CIERRE DEL METODO

}// CIERRE DE LA CLASE
