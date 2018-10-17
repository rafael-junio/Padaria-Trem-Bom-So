package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;

import controle.Padaria;
import funcionalidades.ValidaDocumento;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class TelaCadastraFornecedor {
	
	private static Padaria padaria;
	private ValidaDocumento documentos;

	private JFrame CadastrarFornecedores;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtCodigo;
	private JTextField txtCNPJ;
	private JTextField txtDesconto;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastraFornecedor window = new TelaCadastraFornecedor(padaria);
					window.CadastrarFornecedores.setVisible(true);
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
	public TelaCadastraFornecedor(Padaria padaria) {
		initialize();
		this.padaria = padaria;
		documentos = new ValidaDocumento();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		CadastrarFornecedores = new JFrame();
		CadastrarFornecedores.setTitle("Cadastrar Fornecedores");
		CadastrarFornecedores.setBounds(100, 100, 450, 300);
		CadastrarFornecedores.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		CadastrarFornecedores.getContentPane().setLayout(null);
		
		JLabel lblFornecedor = new JLabel("Fornecedor:");
		lblFornecedor.setBounds(10, 11, 106, 14);
		CadastrarFornecedores.getContentPane().add(lblFornecedor);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 36, 178, 20);
		CadastrarFornecedores.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 67, 118, 14);
		CadastrarFornecedores.getContentPane().add(lblEndereo);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(10, 92, 178, 20);
		CadastrarFornecedores.getContentPane().add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblCnpj = new JLabel("C\u00F3digo: ");
		lblCnpj.setBounds(10, 123, 46, 14);
		CadastrarFornecedores.getContentPane().add(lblCnpj);
		
		txtCodigo = new JFormattedTextField(createFormatter("###"));
		txtCodigo.setBounds(10, 148, 178, 20);
		CadastrarFornecedores.getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblCnpj_1 = new JLabel("CNPJ:");
		lblCnpj_1.setBounds(209, 11, 46, 14);
		CadastrarFornecedores.getContentPane().add(lblCnpj_1);
		
		txtCNPJ = new JFormattedTextField(createFormatter("##.###.###/####-##"));
		txtCNPJ.setBounds(208, 36, 178, 20);
		CadastrarFornecedores.getContentPane().add(txtCNPJ);
		txtCNPJ.setColumns(10);
		
		JCheckBox checaRecorrente = new JCheckBox("\u00C9 recorrente?");

		checaRecorrente.setBounds(207, 91, 123, 23);
		CadastrarFornecedores.getContentPane().add(checaRecorrente);

		txtDesconto = new JFormattedTextField(createFormatter("0.##"));
		txtDesconto.setBounds(340, 120, 46, 20);
		CadastrarFornecedores.getContentPane().add(txtDesconto);
		txtDesconto.setEnabled(false);
		txtDesconto.setColumns(10);
		
		JLabel lblTaxaDeDesconto = new JLabel("Taxa de desconto:");
		lblTaxaDeDesconto.setBounds(209, 123, 121, 14);
		CadastrarFornecedores.getContentPane().add(lblTaxaDeDesconto);
		lblTaxaDeDesconto.setEnabled(false);
		
		checaRecorrente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean b = checaRecorrente.isSelected();
				txtDesconto.setEnabled(b);
				lblTaxaDeDesconto.setEnabled(b);
			}
		});		
		
		
		btnNewButton = new JButton("Cadastrar Fornecedor");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean CNPJ = false, jaCadastrado = false, codigo = false;
				if(documentos.isCNPJ(txtCNPJ.getText())) {
					CNPJ = true;
				}
				else
					JOptionPane.showMessageDialog(null, "CNPJ inválido");
				
				if(txtCodigo.getText().equals("   ")) {
					JOptionPane.showMessageDialog(null, "Preencha o código do fornecedor");
					codigo = true;
				}
				if(padaria.encontraFornecedor(txtCodigo.getText()) != null) {
					JOptionPane.showMessageDialog(null, "Fornecedor já cadastrado");
					jaCadastrado = true;
				}
				if(checaRecorrente.isSelected() && txtDesconto.getText().equals("0.  ")) {
					JOptionPane.showMessageDialog(null, "Desmarque a opção de recorrente ou insira um valor válido");
				}
				else if (checaRecorrente.isSelected() && CNPJ && !jaCadastrado && !codigo) {
					padaria.cadastrarFornecedorRecorrente(txtNome.getText(), txtEndereco.getText(), txtCodigo.getText(), txtCNPJ.getText(), Float.parseFloat(txtDesconto.getText()));
					CadastrarFornecedores.setVisible(false);
				}
				else if (!checaRecorrente.isSelected() && CNPJ && !jaCadastrado && !codigo){
					padaria.cadastrarFornecedorOcasional(txtNome.getText(), txtEndereco.getText(), txtCodigo.getText(), txtCNPJ.getText());
					CadastrarFornecedores.setVisible(false);
				}	
			}
		});
		btnNewButton.setBounds(10, 202, 402, 48);
		CadastrarFornecedores.getContentPane().add(btnNewButton);
		
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
