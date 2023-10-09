package logica;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import bean.Usuario;

public class LUsuario {

	public void imprimirInformacionUsuarios(ArrayList<Usuario> usuarios) {
		StringBuilder info = new StringBuilder();

		for (Usuario usuario : usuarios) {
			info.append("Nombre: " + usuario.getNombres() + "\n");
			info.append("Apellidos: " + usuario.getApellidos() + "\n");
			info.append("Tipo de ID: " + usuario.getTipoID() + "\n");
			info.append("ID: " + usuario.getId() + "\n");
			info.append("Lugar de Residencia: " + usuario.getLugarResidencia() + "\n");
			info.append("Número de Celular: " + usuario.getNumeroCel() + "\n");
			info.append("Nacionalidad: " + usuario.getNacionalidad() + "\n");
			info.append("Correo Electrónico: " + usuario.getCorreoElectronico() + "\n");
			info.append("Contraseña: " + usuario.getContraseña() + "\n");
			info.append("-------------------------------------------\n");
		}

		JTextArea textArea = new JTextArea(info.toString());
		textArea.setEditable(false);

		JScrollPane scrollPane = new JScrollPane(textArea);

		JPanel panel = new JPanel(new BorderLayout());
		panel.add(scrollPane, BorderLayout.CENTER);

		// Mostrar la información en un JOptionPane
		JOptionPane.showMessageDialog(null, panel, "Información de Usuarios", JOptionPane.INFORMATION_MESSAGE);
	}

	public void contarDocumentosCE(ArrayList<Usuario> usuarios) {
		int cantidadCedulaExtranjeria = 0;
		int cantidadPasaporte = 0;

		for (Usuario usuario : usuarios) {
			String tipoID = usuario.getTipoID();
			if ("Cédula de Extranjería".equals(tipoID)) {
				cantidadCedulaExtranjeria++;
			} else if ("Pasaporte".equals(tipoID)) {
				cantidadPasaporte++;
			}
		}

		String mensajeCedula = "Cantidad de personas con Cédula de Extranjería: " + cantidadCedulaExtranjeria;
		JOptionPane.showMessageDialog(null, mensajeCedula, "Cédula de Extranjería", JOptionPane.INFORMATION_MESSAGE);

	}

	public void contarDocumentosP(ArrayList<Usuario> usuarios) {
		int cantidadCedulaExtranjeria = 0;
		int cantidadPasaporte = 0;

		for (Usuario usuario : usuarios) {
			String tipoID = usuario.getTipoID();
			if ("Cédula de Extranjería".equals(tipoID)) {
				cantidadCedulaExtranjeria++;
			} else if ("Pasaporte".equals(tipoID)) {
				cantidadPasaporte++;
			}
		}

		String mensajePasaporte = "Cantidad de personas con Pasaporte: " + cantidadPasaporte;
		JOptionPane.showMessageDialog(null, mensajePasaporte, "Pasaporte", JOptionPane.INFORMATION_MESSAGE);

	}

	public double calcularPromedioNacionalidadOtro(ArrayList<Usuario> usuarios) {
		int totalUsuarios = usuarios.size();
		int countNacionalidadOtro = 0;

		for (Usuario usuario : usuarios) {
			if ("otro".equalsIgnoreCase(usuario.getNacionalidad())) {
				countNacionalidadOtro++;
			}
		}

		if (totalUsuarios == 0) {
			return 0.0;
		} else {
			double promedio = (double) countNacionalidadOtro / totalUsuarios;

			// Mostrar el porcentaje en un JOptionPane
			JOptionPane.showMessageDialog(null,
					"El porcentaje de personas con nacionalidad 'otro' es: " + (promedio * 100) + "%",
					"Porcentaje de Nacionalidad 'otro'", JOptionPane.INFORMATION_MESSAGE);

			return promedio;
		}

	}
}
