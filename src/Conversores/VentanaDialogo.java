package Conversores;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaDialogo extends JFrame{
	JFrame ventana, ventana2, ventana3;
	public JPanel panelPrincipal, panel, panelUnidades;
	public JComboBox<String> divisasIDesplegable;
	public JComboBox<String> divisasFDesplegable;
	public JComboBox<String> ListOpciones, UnidIDesplegable, UnidFDesplegable;
	public JTextField valorDe;
	public JLabel etiqueta2, etiqueta3, etiqImagen, etiqImagen2;
	public JButton btnSeleccionar, btnCerrarPrinc;
	public JButton btnConvertir, btnLimpiar, btnCerrar;
	public JButton btnConvertirUnid, btnCerrarunid, btnLimpiarUnid;
	public EquivalenciaDolar info;
	public EquivalenciaMetros infoUnidades;
	public JTextArea result;

	public VentanaDialogo() {
		VentanaPrincipal();	
	}

	private void iniciarComponentesPrincipal() {
		PanelPrincipal();
		ListasPrincipal();
		BotonesPrincipal();
	}

	private void iniciarComponentesConvMoneda() {
		PanelConversorMoneda();
		Etiquetas();
		cajasDeTexto();
		AreDeTexto();
		Botones();
		Listas();
	}
	
	private void iniciarComponentesConvUnidades() {
		PanelConversorUnidades();
		EtiquetasIunidades();
		ListasUnidades();
		cajasDeTextoUnidades();
		AreDeTextoUnidades();
		BotonesUnidades();
	}

	private void VentanaPrincipal() {
		ventana = new JFrame();
		ventana.setSize(400, 300); // Establecer el tamaño de la ventana - setSize(int width = ancho, int height =
									// largo)
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cuando se cierre la ventana, automaticamente el
																// programa se cierre.
		ventana.setTitle("Menú"); // Indicando el titulo de la ventana.
		iniciarComponentesPrincipal();
		// setLocation(300, 400);// Establecer la posicion de la ventana en la pantalla.
		// setBounds(600, 400, 500, 500); // esto resume el setLocation y el setsize.
		ventana.setLocationRelativeTo(null); // con este metodo garantizamos que quede en la ventana centrada.
		// Creamos un arreglo con los elementos que queremos en la lista desplegable
		ventana.setVisible(true);
	}

	private void VentanaConverMoneda() {
		ventana2 = new JFrame();
		ventana2.setSize(500, 600); // Establecer el tamaño de la ventana - setSize(int width = ancho, int height =
		// largo)
		ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Cuando se cierre la ventana, automaticamente el
																// programa se cierre.
		ventana2.setTitle("Conversor de Divisas"); // Indicando el titulo de la ventana.
		iniciarComponentesConvMoneda();
		ventana2.setLocationRelativeTo(null); // con este metodo garantizamos que quede en la ventana centrada.
		// Creamos un arreglo con los elementos que queremos en la lista desplegable
		ventana2.setVisible(true);
		ventana.setVisible(false);
	}

	private void VentanaConverUnidades() {
		ventana3 = new JFrame();
		ventana3.setSize(500, 600); // Establecer el tamaño de la ventana - setSize(int width = ancho, int height = largo)
		ventana3.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando se cierre la ventana, automaticamente el programa se cierre.
		ventana3.setTitle("Conversor de Unidades de Longitud"); // Indicando el titulo de la ventana.
		iniciarComponentesConvUnidades();
		ventana3.setLocationRelativeTo(null); // con este metodo garantizamos que quede en la ventana centrada.
		// Creamos un arreglo con los elementos que queremos en la lista desplegable
		ventana3.setVisible(true);
		ventana.setVisible(false);
	}

	private void PanelPrincipal() {
		
		panelPrincipal = new JPanel();//Se crea el panel
		panelPrincipal.setBackground(Color.white); // establecer color al panel.
		panelPrincipal.setLayout(null);// desactivo el diseño del panel para que no me quede centrado los elementos que le vaya a colocar al panel.
		ventana.getContentPane().add(panelPrincipal); // agregamos el panel a la ventana.
	}

	private void PanelConversorMoneda() {

		panel = new JPanel();
		panel.setBackground(Color.white); // establecer color al panel.
		panel.setLayout(null);
		ventana2.getContentPane().add(panel); // agregamos el panel a la ventana.
	}

	private void PanelConversorUnidades() {

		panelUnidades = new JPanel();
		panelUnidades.setBackground(Color.white); // establecer color al panel.
		panelUnidades.setLayout(null);
		ventana3.getContentPane().add(panelUnidades); // agregamos el panel a la ventana.
	}
	private void Etiquetas() {

		// Creamos la etiqueta
		JLabel etiqueta = new JLabel();
		// Se establece el texto de la etiqueta.
		etiqueta.setText("De : ");
		// posicion de la eiqueta, como el alto y el ancho.
		etiqueta.setBounds(70, 135, 50, 30);
		// agregar color a la etiqueta
		etiqueta.setForeground(Color.black);
		etiqueta.setVisible(true);
		// se agrega la etiqwuta al panel
		panel.add(etiqueta);

		// Creamos la etiqueta
		JLabel etiqueta2 = new JLabel();
		// Se establece el texto de la etiqueta.
		etiqueta2.setText("A : ");
		// posicion de la eiqueta, como el alto y el ancho.
		etiqueta2.setBounds(270, 135, 50, 30);
		// agregar color a la etiqueta
		etiqueta2.setForeground(Color.black);
		// se agrega la etiqwuta al panel
		panel.add(etiqueta2);

		// Creamos la etiqueta
		etiqImagen = new JLabel(new ImageIcon("CambioDivisas.jpg"));
		// posicion de la eiqueta, como el alto y el ancho.
		etiqImagen.setBounds(40, 13, 411, 107);
		// se agrega la etiqwuta al panel
		panel.add(etiqImagen);

	}
	
	private void EtiquetasIunidades() {

		// Creamos la etiqueta
		JLabel etiqueta = new JLabel();
		// Se establece el texto de la etiqueta.
		etiqueta.setText("De : ");
		// posicion de la eiqueta, como el alto y el ancho.
		etiqueta.setBounds(70, 135, 50, 30);
		// agregar color a la etiqueta
		etiqueta.setForeground(Color.black);
		etiqueta.setVisible(true);
		// se agrega la etiqwuta al panel
		panelUnidades.add(etiqueta);

		// Creamos la etiqueta
		JLabel etiqueta2 = new JLabel();
		// Se establece el texto de la etiqueta.
		etiqueta2.setText("A : ");
		// posicion de la eiqueta, como el alto y el ancho.
		etiqueta2.setBounds(270, 135, 50, 30);
		// agregar color a la etiqueta
		etiqueta2.setForeground(Color.black);
		// se agrega la etiqwuta al panel
		panelUnidades.add(etiqueta2);

		// Creamos la etiqueta
		etiqImagen = new JLabel(new ImageIcon("UnidadesLongitud.png"));
		// posicion de la eiqueta, como el alto y el ancho.
		etiqImagen.setBounds(40, 13, 411, 107);
		// se agrega la etiqwuta al panel
		panelUnidades.add(etiqImagen);

	}

	private void ListasPrincipal() {
		// -----------------Listas Principal--------------------
		String[] opc = { "Seleccionar Opción", "Conversor de Monedas", "Conversor de unidades Longitud" };
		// Creamos la lista desplegable y le pasamos los elementos como parámetro
		ListOpciones = new JComboBox<>(opc);
		Font font = new Font("Arial", Font.BOLD, 15);
		ListOpciones.setFont(font);
		ListOpciones.setBounds(80, 70, 250, 50);
		panelPrincipal.add(ListOpciones);
	}

	private void Listas() {
		// -----------------Listas panel--------------------
		// Creamos un arreglo con los elementos que queremos en la lista desplegable
		String[] divisasI = { "Peso Colombiano", "Dolar", "Euros", "Libra Esterlina (GBP)", "Yen Japones",
				"Won (KRW)" };
		// Creamos la lista desplegable y le pasamos los elementos como parámetro
		divisasIDesplegable = new JComboBox<>(divisasI);
		divisasIDesplegable.setBounds(70, 160, 150, 30);
		panel.add(divisasIDesplegable);

		// Creamos un arreglo con los elementos que queremos en la lista desplegable
		String[] divisasF = { "Peso Colombiano", "Dolar", "Euros", "Libra Esterlina (GBP)", "Yen Japones",
				"Won (KRW)" };
		// Creamos la lista desplegable y le pasamos los elementos como parámetro
		divisasFDesplegable = new JComboBox<>(divisasF);
		// Agregar objetos al comboBox
		// DivisasFDesplegable.addItem("Lira Turca");
		// Seleccionar el item que se ba a mostrar por defecto
		divisasFDesplegable.setSelectedItem("Dolar");
		divisasFDesplegable.setBounds(270, 160, 150, 30);
		panel.add(divisasFDesplegable);
	}
	
	private void ListasUnidades() {
		// -----------------Listas panel--------------------
		// Creamos un arreglo con los elementos que queremos en la lista desplegable
		String[] UniI = { "Nanometro", "Micrometro(um)", "Milimetro(ml)", "Centimetro(cm)", "Metro", "Kilometro(km)", "Milla(mi)", "Yarda(yd)",
				"Pie", "Pulgada", "Milla Nautica" };
		// Creamos la lista desplegable y le pasamos los elementos como parámetro
		UnidIDesplegable = new JComboBox<>(UniI);
		UnidIDesplegable.setBounds(70, 160, 150, 30);
		panelUnidades.add(UnidIDesplegable);

		// Creamos un arreglo con los elementos que queremos en la lista desplegable
		String[] UniF = { "Nanometro", "Micrometro(um)", "Milimetro(ml)", "Centimetro(cm)", "Metro", "Kilometro(km)", "Milla(mi)", "Yarda(yd)",
				"Pie", "Pulgada", "Milla Nautica"};
		// Creamos la lista desplegable y le pasamos los elementos como parámetro
		UnidFDesplegable = new JComboBox<>(UniF);
		// Agregar objetos al comboBox
		// DivisasFDesplegable.addItem("Lira Turca");
		// Seleccionar el item que se ba a mostrar por defecto
		UnidFDesplegable.setSelectedItem("Dolar");
		UnidFDesplegable.setBounds(270, 160, 150, 30);
		panelUnidades.add(UnidFDesplegable);
	}


	private void cajasDeTexto() {
		valorDe = new JTextField();
		valorDe.setBounds(70, 210, 350, 30);
		valorDe.setText("0");
		valorDe.getText();
		valorDe.requestFocus();
		panel.add(valorDe);
	}
	
	private void cajasDeTextoUnidades() {
		valorDe = new JTextField();
		valorDe.setBounds(70, 210, 350, 30);
		valorDe.setText("0");
		valorDe.getText();
		valorDe.requestFocus();
		panelUnidades.add(valorDe);
	}

	private void AreDeTexto() {
		Color color3 = new Color(hex("050505"));
		Color color4 = new Color(hex("C1D6D7"));
		// Crear la instancia para la feunte del textarea.
		Font font = new Font("Arial", Font.BOLD, 15);
		result = new JTextArea();
		result.setBounds(100, 420, 300, 100);
		result.setBackground(color4);
		result.setEditable(false);
		result.setVisible(false);
		// cambio la fuente y el color del texto que se indique en el textarea.
		result.setFont(font);
		// Cambio el color de la letra
		result.setForeground(color3);
		result.getText();
		result.requestFocus();
		panel.add(result);
	}
	
	private void AreDeTextoUnidades() {
		Color color3 = new Color(hex("050505"));
		Color color4 = new Color(hex("C1D6D7"));
		// Crear la instancia para la feunte del textarea.
		Font font = new Font("Arial", Font.BOLD, 15);
		result = new JTextArea();
		result.setBounds(100, 420, 300, 100);
		result.setBackground(color4);
		result.setEditable(false);
		result.setVisible(false);
		// cambio la fuente y el color del texto que se indique en el textarea.
		result.setFont(font);
		// Cambio el color de la letra
		result.setForeground(color3);
		result.getText();
		result.requestFocus();
		panelUnidades.add(result);
	}

	private void BotonesPrincipal() {
		// -----------------Botones Panel Principal--------------------
		Color color4 = new Color(hex("278F64"));
		// Crear un botton
		btnSeleccionar = new JButton();
		// Dar posicion y dimension
		btnSeleccionar.setBounds(25, 150, 150, 40);
		// Asignar nombre al boton
		btnSeleccionar.setText("Ingresar");
		btnSeleccionar.setBackground(color4);
		panelPrincipal.add(btnSeleccionar);

		Color color5 = new Color(hex("93AEB8"));
		// Crear un botton
		btnCerrarPrinc = new JButton();
		// Dar posicion y dimension
		btnCerrarPrinc.setBounds(215, 150, 150, 40);
		// Asignar nombre al boton
		btnCerrarPrinc.setText("Cerrar");
		btnCerrarPrinc.setBackground(color5);
		panelPrincipal.add(btnCerrarPrinc);

		EventosSeleccionar();
		EventosCerrarPrincipal();
	}

	private void Botones() {
		Color color = new Color(hex("278F64"));
		// Crear un botton
		btnConvertir = new JButton();
		// Dar posicion y dimension
		btnConvertir.setBounds(50, 280, 100, 40);
		// Asignar nombre al boton
		btnConvertir.setText("Convertir");
		btnConvertir.setBackground(color);
		panel.add(btnConvertir);

		Color color2 = new Color(hex("93AEB8"));
		btnLimpiar = new JButton();
		btnLimpiar.setBounds(190, 280, 100, 40);
		btnLimpiar.setText("Limpiar");
		btnLimpiar.setBackground(color2);
		// Para que se desactive el boton.
		btnLimpiar.setEnabled(true);
		panel.add(btnLimpiar);

		Color color3 = new Color(hex("F1B9A2"));
		btnCerrar = new JButton();
		btnCerrar.setBounds(330, 280, 100, 40);
		btnCerrar.setText("Cerrar");
		btnCerrar.setBackground(color3);
		// Para que se desactive el boton.
		btnCerrar.setEnabled(true);
		panel.add(btnCerrar);

		EventosConvertir();
		EventosLimpiar();
		EventosCerrar();
	}
	
	private void BotonesUnidades() {
		Color color = new Color(hex("278F64"));
		// Crear un botton
		btnConvertirUnid = new JButton();
		// Dar posicion y dimension
		btnConvertirUnid.setBounds(50, 280, 100, 40);
		// Asignar nombre al boton
		btnConvertirUnid.setText("Convertir");
		btnConvertirUnid.setBackground(color);
		panelUnidades.add(btnConvertirUnid);

		Color color2 = new Color(hex("93AEB8"));
		btnLimpiarUnid = new JButton();
		btnLimpiarUnid.setBounds(190, 280, 100, 40);
		btnLimpiarUnid.setText("Limpiar");
		btnLimpiarUnid.setBackground(color2);
		// Para que se desactive el boton.
		btnLimpiarUnid.setEnabled(true);
		panelUnidades.add(btnLimpiarUnid);

		Color color3 = new Color(hex("F1B9A2"));
		btnCerrarunid = new JButton();
		btnCerrarunid.setBounds(330, 280, 100, 40);
		btnCerrarunid.setText("Cerrar");
		btnCerrarunid.setBackground(color3);
		// Para que se desactive el boton.
		btnCerrarunid.setEnabled(true);
		panelUnidades.add(btnCerrarunid);

		
		EventosCerrarUnid();
		EventosLimpiarUnid();
		EventosConvertirUnid();
	}

	private void EventosSeleccionar() {
		// Agregando evento de tipo ActionListener
		ActionListener btnIngresar = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					String seleccion = (String) ListOpciones.getSelectedItem();
					SeleccionConversor codSeleccion = new SeleccionConversor(seleccion);
					if(codSeleccion.getCodConv() == 1) {
						VentanaConverMoneda();
					}else if(codSeleccion.getCodConv() == 2) {
						VentanaConverUnidades();
					} 
			}
		};
		btnSeleccionar.addActionListener(btnIngresar);
	}

	private void EventosConvertir() throws NumberFormatException {
		// Agregando evento de tipo ActionListener
		ActionListener btnAct = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String di = (String) divisasIDesplegable.getSelectedItem();
					String df = (String) divisasFDesplegable.getSelectedItem();
					double valor = Integer.parseInt(valorDe.getText());
					info = new EquivalenciaDolar(di, df, valor);
					result.setText("El monto ingresado es: " + info.getValor() + "\nEl monto indicado equivale a: \n"
							+ info.getValorConvertido() + " " + info.getAMoneda());

					// Creamos la etiqueta para colocar el logo de la divisa
					etiqImagen2 = new JLabel(new ImageIcon(info.getImagenMoneda()));
					// posicion de la eiqueta, como el alto y el ancho.
					etiqImagen2.setBounds(200, 350, 70, 60);
					// se agrega la etiqwuta al panel
					panel.add(etiqImagen2);
					etiqImagen2.setVisible(false);
					btnConvertir.setEnabled(false);
					result.setVisible(true);
					etiqImagen2.setVisible(info.isEstadoImagen());

				} catch (NumberFormatException excep) {
					JOptionPane.showMessageDialog(null,
							"Debes ingresar sólo números, por favor ingresa un dato númerico");
				}
			}
		};
		btnConvertir.addActionListener(btnAct);
	}
	
	private void EventosConvertirUnid() throws NumberFormatException {
		// Agregando evento de tipo ActionListener
		ActionListener btnAct = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String di = (String) UnidIDesplegable.getSelectedItem();
					String df = (String) UnidFDesplegable.getSelectedItem();
					double valor = Integer.parseInt(valorDe.getText());
					infoUnidades = new EquivalenciaMetros(di, df, valor);
					result.setText("El valor ingresado es: " + infoUnidades.getValor() + "\nEl valor indicado equivale a: \n"
							+ infoUnidades.getValorConvertido() + " " + infoUnidades.getAMoneda());
					
					btnConvertirUnid.setEnabled(false);
					result.setVisible(true);
	
				} catch (NumberFormatException excep) {
					JOptionPane.showMessageDialog(null,
							"Debes ingresar sólo números, por favor ingresa un dato númerico");
				}
			}
		};
		btnConvertirUnid.addActionListener(btnAct);
	}

	private void EventosLimpiar() throws NullPointerException {
		// Agregando evento de tipo ActionListener
		ActionListener btnLimp = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					valorDe.setText("0");
					// etiqueta3.setText("");
					result.setText("");
					etiqImagen2.setVisible(false);
					btnConvertir.setEnabled(true);
					result.setVisible(false);
				} catch (NullPointerException excep) {
					JOptionPane.showMessageDialog(null,
							"No has ingresado el valor para convertir, por favor ingresa el valor");
				}
			}
		};
		btnLimpiar.addActionListener(btnLimp);
	}
	
	private void EventosLimpiarUnid() throws NullPointerException {
		// Agregando evento de tipo ActionListener
		ActionListener btnLimp = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					valorDe.setText("0");
					// etiqueta3.setText("");
					result.setText("");
					result.setVisible(false);
					btnConvertirUnid.setEnabled(true);
				} catch (NullPointerException excep) {
					JOptionPane.showMessageDialog(null,
							"No has ingresado el valor para convertir, por favor ingresa el valor");
				}
			}
		};
		btnLimpiarUnid.addActionListener(btnLimp);
	}
	
	private void EventosCerrarPrincipal() throws NullPointerException {
		// Agregando evento de tipo ActionListener
		ActionListener btnClose = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ventana.dispose();
			}
		};
		btnCerrarPrinc.addActionListener(btnClose);
	}

	private void EventosCerrar() throws NullPointerException {
		// Agregando evento de tipo ActionListener
		ActionListener btnClose = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ventana2.dispose();
				ventana.setVisible(true);
				EventosLimpiar();
			}
		};
		btnCerrar.addActionListener(btnClose);
	}
	
	private void EventosCerrarUnid() throws NullPointerException {
		// Agregando evento de tipo ActionListener
		ActionListener btnClose = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ventana3.dispose();
				ventana.setVisible(true);
				EventosLimpiarUnid();
			}
		};
		btnCerrarunid.addActionListener(btnClose);
	}

	// Metodo Para indicar los colores en hexadecimal
	private int hex(String color_hex) {
		return Integer.parseInt(color_hex, 16);
	}

}
