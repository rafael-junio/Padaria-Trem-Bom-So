package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;

import controle.Padaria;
import funcionalidades.ValidaDocumento;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastraCliente{


	private static Padaria padaria;
	private ValidaDocumento documentos;

	private JFrame frmCadastrarCliente;
	private JTextField txtNomeCliente;
	private JTextField txtEndereco;
	private JTextField txtCPF;
	private JLabel lblTelefone;
	private JTextField txtTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastraCliente window = new TelaCadastraCliente(padaria);
					window.frmCadastrarCliente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param padaria 
	 */
	@SuppressWarnings("static-access")
	public TelaCadastraCliente(Padaria padaria) {
		initialize();
		this.padaria = padaria;
		documentos = new ValidaDocumento();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastrarCliente = new JFrame();
		frmCadastrarCliente.setTitle("Cadastrar Cliente");
		frmCadastrarCliente.setBounds(100, 100, 450, 300);
		frmCadastrarCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCadastrarCliente.getContentPane().setLayout(null);
		
		JLabel lblNomeDoCliente = new JLabel("Nome do cliente");
		lblNomeDoCliente.setBounds(10, 11, 129, 14);
		frmCadastrarCliente.getContentPane().add(lblNomeDoCliente);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setBounds(10, 36, 414, 20);
		frmCadastrarCliente.getContentPane().add(txtNomeCliente);
		txtNomeCliente.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 67, 129, 14);
		frmCadastrarCliente.getContentPane().add(lblEndereo);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(10, 92, 414, 20);
		frmCadastrarCliente.getContentPane().add(txtEndereco);
		
		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setBounds(10, 123, 46, 14);
		frmCadastrarCliente.getContentPane().add(lblCpf);
		
		txtCPF = new JFormattedTextField(createFormatter("###.###.###-##"));
		txtCPF.setBounds(10, 148, 105, 20);
		frmCadastrarCliente.getContentPane().add(txtCPF);
		txtCPF.setColumns(10);
		
		lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(219, 123, 55, 14);
		frmCadastrarCliente.getContentPane().add(lblTelefone);
		
		txtTelefone = new JFormattedTextField(createFormatter("(##) ####-####"));
		txtTelefone.setBounds(218, 148, 105, 20);
		frmCadastrarCliente.getContentPane().add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar cliente!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(padaria.encontraCliente(txtCPF.getText()) != null) {
					JOptionPane.showMessageDialog(null, "Cliente já cadastrado");
				}
				
				else if(documentos.isCPF(txtCPF.getText())) {
					padaria.cadastrarClienteRegular(txtNomeCliente.getText(), txtEndereco.getText(), txtCPF.getText(), txtTelefone.getText());
					JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
					frmCadastrarCliente.setVisible(false);
				}
				else
					JOptionPane.showMessageDialog(null, "CPF inválido");
				
			}
		});
		btnNewButton.setBounds(10, 207, 414, 43);
		frmCadastrarCliente.getContentPane().add(btnNewButton);
	}
	
	protected MaskFormatter createFormatter(String s) {
	    MaskFormatter formatter = null;
	    try {
	        formatter = new MaskFormatter(s);
	    } catch (java.text.ParseException exc) {
	        System.err.println("formatter is bad: " + exc.getMessage());
	        System.exit(-1);
	    }
	    return formatter;
	}
}
