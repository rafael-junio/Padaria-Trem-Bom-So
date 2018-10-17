package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import controle.Padaria;
import funcionalidades.ValidaDocumento;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class TelaCadastraFuncionario {
	
	private static Padaria padaria;
	private ValidaDocumento documentos;

	private JFrame frmCadastrarFuncionrios;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtCPF;
	private JTextField txtCodigo;
	private JTextField txtSalario;
	private JTextField txtTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastraFuncionario window = new TelaCadastraFuncionario(padaria);
					window.frmCadastrarFuncionrios.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	@SuppressWarnings("static-access")
	public TelaCadastraFuncionario(Padaria padaria) {
		initialize();
		this.padaria = padaria;
		documentos = new ValidaDocumento();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmCadastrarFuncionrios = new JFrame();
		frmCadastrarFuncionrios.setTitle("Cadastrar Funcion\u00E1rios");
		frmCadastrarFuncionrios.setBounds(100, 100, 450, 300);
		frmCadastrarFuncionrios.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCadastrarFuncionrios.getContentPane().setLayout(null);
		
		JRadioButton rdbtnVendedor = new JRadioButton("Vendedor");

		frmCadastrarFuncionrios.getContentPane().add(rdbtnVendedor);
		
		JRadioButton rdbtnPadeiro = new JRadioButton("Padeiro");

		frmCadastrarFuncionrios.getContentPane().add(rdbtnPadeiro);
		
		JRadioButton rdbtnGerente = new JRadioButton("Gerente");

		frmCadastrarFuncionrios.getContentPane().add(rdbtnGerente);
		
		
		
		rdbtnVendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnVendedor.isSelected() == true) {
					rdbtnPadeiro.setSelected(false);
					rdbtnVendedor.setSelected(true);
					rdbtnGerente.setSelected(false);
				}				
			}
		});
		rdbtnVendedor.setBounds(6, 35, 109, 23);
		
		rdbtnGerente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnGerente.isSelected() == true) {
					rdbtnPadeiro.setSelected(false);
					rdbtnVendedor.setSelected(false);
					rdbtnGerente.setSelected(true);	
				}
			}
		});
		rdbtnGerente.setBounds(228, 35, 109, 23);
		
		
		rdbtnPadeiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnPadeiro.isSelected() == true) {
					rdbtnPadeiro.setSelected(true);
					rdbtnVendedor.setSelected(false);
					rdbtnGerente.setSelected(false);
				}
			}
		});
		rdbtnPadeiro.setBounds(117, 35, 109, 23);
		
		JLabel lblQualTipoDe = new JLabel("Qual tipo de funcion\u00E1rio voc\u00EA quer cadastrar?");
		lblQualTipoDe.setBounds(10, 14, 296, 14);
		frmCadastrarFuncionrios.getContentPane().add(lblQualTipoDe);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 65, 46, 14);
		frmCadastrarFuncionrios.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 90, 190, 20);
		frmCadastrarFuncionrios.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 121, 86, 14);
		frmCadastrarFuncionrios.getContentPane().add(lblEndereo);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(10, 146, 190, 20);
		frmCadastrarFuncionrios.getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(214, 65, 46, 14);
		frmCadastrarFuncionrios.getContentPane().add(lblNewLabel);
		
		txtCPF = new JFormattedTextField(createFormatter("###.###.###-##"));
		txtCPF.setColumns(10);
		txtCPF.setBounds(212, 90, 101, 20);
		frmCadastrarFuncionrios.getContentPane().add(txtCPF);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(214, 121, 46, 14);
		frmCadastrarFuncionrios.getContentPane().add(lblCdigo);
		
		txtCodigo = new JFormattedTextField(createFormatter("####"));
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(212, 146, 94, 20);
		frmCadastrarFuncionrios.getContentPane().add(txtCodigo);
		
		JLabel lblNewLabel_1 = new JLabel("Sal\u00E1rio");
		lblNewLabel_1.setBounds(326, 121, 46, 14);
		frmCadastrarFuncionrios.getContentPane().add(lblNewLabel_1);
		
		txtSalario = new JFormattedTextField(createFormatter("####.##"));
		txtSalario.setBounds(323, 146, 101, 20);
		frmCadastrarFuncionrios.getContentPane().add(txtSalario);
		txtSalario.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar Funcion\u00E1rio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean jaCadastrado = false, CPF = false;
				
				if(documentos.isCPF(txtCPF.getText())) {
					CPF = true;
				}
				else
					JOptionPane.showMessageDialog(null, "CPF inv�lido");
				
				if(padaria.encontraFuncionario(txtCodigo.getText()) != null) {
					JOptionPane.showMessageDialog(null, "Funcionario j� cadastrado");
					jaCadastrado = true;
				}
				
				
				if (rdbtnVendedor.isSelected() == true && !jaCadastrado && CPF) {
					padaria.cadastrarVendedor(txtNome.getText(), txtEndereco.getText(), txtCPF.getText(), txtTelefone.getText(), txtCodigo.getText(),Float.parseFloat(txtSalario.getText()));
					JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso!");
					frmCadastrarFuncionrios.setVisible(false);
				}
				else if (rdbtnPadeiro.isSelected() == true && !jaCadastrado && CPF) {
					padaria.cadastrarPadeiro(txtNome.getText(), txtEndereco.getText(), txtCPF.getText(), txtTelefone.getText(), txtCodigo.getText(),Float.parseFloat(txtSalario.getText()));
					JOptionPane.showMessageDialog(null, "Padeiro cadastrado com sucesso!");
					frmCadastrarFuncionrios.setVisible(false);
				}
				else if (rdbtnGerente.isSelected() == true && !jaCadastrado && CPF) {
					padaria.cadastrarGerente(txtNome.getText(), txtEndereco.getText(), txtCPF.getText(), txtTelefone.getText(), txtCodigo.getText(),Float.parseFloat(txtSalario.getText()));
					JOptionPane.showMessageDialog(null, "Gerente cadastrado com sucesso!");
					frmCadastrarFuncionrios.setVisible(false);
				}

			}
		});
		btnNewButton.setBounds(10, 190, 414, 60);
		frmCadastrarFuncionrios.getContentPane().add(btnNewButton);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(326, 65, 46, 14);
		frmCadastrarFuncionrios.getContentPane().add(lblTelefone);
		
		txtTelefone = new JFormattedTextField(createFormatter("(##) ####-####"));
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(323, 90, 101, 20);
		frmCadastrarFuncionrios.getContentPane().add(txtTelefone);
		
		
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