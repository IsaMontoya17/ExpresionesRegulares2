package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
	private JComboBox<String> comboBoxNacionalidad;
	private JTextField textNumeroID;
	private JTextField textCorreoElectronico;
	private JTextField textConfirmacionCorreo;
	private JTextField textNumeroCel;
	private JPanel panelC;
	private JPasswordField passwordFieldContraseña;
	private JPasswordField passwordField_1ConfirmarContraseña;
	private JButton btnRegistrar;
	public ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
	public Usuario usuario =new Usuario();

	public PanelRegistro(JPanel panelC, ArrayList<Usuario> usuarios) {

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

		comboBoxNacionalidad = new JComboBox();
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

		btnRegistrar = new JButton("Registrar");
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

		if (e.getSource() == btnRegistrar) {
			if (validarCampos()) {
				usuario = capturaDatos();
				listaDeUsuarios.add(usuario);
				panelC.remove(this);
				panelC.revalidate();
				panelC.repaint();
			}
		}

	}// CIERRE DEL METODO

	private boolean validarCampos() {
		String mensajesError = "";

		String apellidos = textApellidos.getText();
		String nombres = textNombres.getText();
		String id = textNumeroID.getText();
		String tipoId = comboBoxTipoID.getSelectedItem().toString();
		String lugarResidencia = comboBoxLugarResidencia.getSelectedItem().toString();
		String nacionalidad = comboBoxNacionalidad.getSelectedItem().toString();
		String numeroCel = textNumeroCel.getText();
		String correo = textCorreoElectronico.getText();
		String confirmacionCorreo = textConfirmacionCorreo.getText();
		String contraseña = passwordFieldContraseña.getText();
		String confirmacionContraseña = passwordField_1ConfirmarContraseña.getText();

		// Validar nombres
		if (nombres.length() < 2 || !nombres.matches("[a-zA-Z]+")) {
			mensajesError += "- El nombre no es válido. Debe tener al menos 2 letras y no debe contener números ni caracteres especiales.\n";
		}

		// Validar apellidos
		String patronApellidos = "^[a-zA-Z]+( [a-zA-Z]+)?$";
		if (!apellidos.matches(patronApellidos)) {
			mensajesError += "- Los apellidos no son válidos. Deben tener al menos 2 letras y no deben contener números ni caracteres especiales, excepto un espacio entre dos palabras.\n";
		}
		// Verificar que haya dos apellidos
		String[] apellidosSeparados = apellidos.split("\\s+"); // Dividir por espacios en blanco
		if (apellidosSeparados.length != 2) {
			mensajesError += "- Deben ingresarse dos apellidos separados por un espacio.\n";
		}

		// Validar ID
		if (!id.matches("\\d{6,10}")) {
			mensajesError += "- El ID no es válido. Debe contener entre 6 y 10 dígitos y solo números.\n";
		}

		// Validar número de celular
		if (!numeroCel.matches("\\d{10}")) {
			mensajesError += "- El número de celular debe contener al menos 10 dígitos.\n";
		}

		// Validar correo
		String patronCorreo = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		if (!correo.matches(patronCorreo)) {
			mensajesError += "- La dirección de correo electrónico no es válida.\n";
		}

		// Validar confirmación de correo
		if (!correo.equals(confirmacionCorreo)) {
			mensajesError += "- La confirmación de correo electrónico no coincide con la dirección de correo electrónico.\n";
			usuario.setError(true);
		}

		// Validar contraseña
		if (!contraseña.equals(confirmacionContraseña)) {
			mensajesError += "- La contraseña y la confirmación de contraseña no coinciden.\n";
		} else {
			// Validar longitud de la contraseña
			if (contraseña.length() < 8) {
				mensajesError += "- La contraseña debe tener al menos 8 caracteres.\n";
			}
			// Validar presencia de al menos una letra minúscula
			if (!contraseña.matches(".*[a-z].*")) {
				mensajesError += "- La contraseña debe contener al menos una letra minúscula.\n";
			}
			// Validar presencia de al menos una letra mayúscula
			if (!contraseña.matches(".*[A-Z].*")) {
				mensajesError += "- La contraseña debe contener al menos una letra mayúscula.\n";
			}
			// Validar presencia de al menos un número
			if (!contraseña.matches(".*\\d.*")) {
				mensajesError += "- La contraseña debe contener al menos un número.\n";
			}
		}

		// Validar confirmacion de contraseña
		if (!contraseña.equals(confirmacionContraseña)) {
			mensajesError += "- La contraseña y la confirmación de contraseña no coinciden.\n";
		}

		if (!mensajesError.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Por favor, corrija los siguientes errores:\n" + mensajesError,
					"Errores", JOptionPane.ERROR_MESSAGE);
			return false;
		}

		return true;
	}// CIERRE DEL METODO

	private Usuario capturaDatos() {

//		Usuario usuario = new Usuario();

		usuario.setNombres(textNombres.getText());
		usuario.setApellidos(textApellidos.getText());
		int selectedIndex = comboBoxTipoID.getSelectedIndex();
		String selectedTipoID = (String) comboBoxTipoID.getSelectedItem();
		usuario.setTipoID(selectedTipoID);
		usuario.setId(textNumeroID.getText());
		selectedIndex = comboBoxLugarResidencia.getSelectedIndex();
		String selectedLugarResidencia = (String) comboBoxLugarResidencia.getSelectedItem();
		usuario.setLugarResidencia(selectedLugarResidencia);
		usuario.setNumeroCel(textNumeroCel.getText());
		selectedIndex = comboBoxNacionalidad.getSelectedIndex();
		String selectedNacionalidad = (String) comboBoxNacionalidad.getSelectedItem();
		usuario.setNacionalidad(selectedNacionalidad);
		usuario.setCorreoElectronico(textCorreoElectronico.getText());
		usuario.setContraseña(passwordFieldContraseña.getText());

		return usuario;

	}// CIERRE DEL METODO

}// CIERRE DE LA CLASE
