package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import controle.Padaria;
import funcionalidades.ValidaData;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;

public class TelaCadastraProduto {

	private static Padaria padaria;
	
	private JFrame frmCadastrarProduto;
	private JLabel lblNomeDoProduto;
	private JTextField txtNomeProduto;
	private JLabel lblCodigo;
	private JTextField txtCodigoProduto;
	private JLabel lblPreoDeCompra;
	private JTextField txtCompra;
	private JLabel lblPreoDeVenda;
	private JTextField txtVenda;
	private JLabel lblCodigoDoFornecedor;
	private JTextField txtCodigo;
	private JLabel lblApelidos;
	private JTextField txtApelido1;
	private JTextField txtApelido2;
	private JTextField txtApelido3;
	private JTextField txtApelido4;
	private JTextField txtApelido5;
	private JLabel lblQuantidadeInicialNo;
	private JTextField txtQuantidade;
	private JButton btnCadastrarProduto;
	private JLabel lblDataDeValidade;
	private JTextField txtDia;
	private JTextField txtMes;
	private JTextField txtAno;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblcamposObrigtorios;
	private JLabel lblApelido;
	private JLabel lblApelido_1;
	private JLabel lblApelido_2;
	private JLabel lblApelido_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastraProduto window = new TelaCadastraProduto(padaria);
					window.frmCadastrarProduto.setVisible(true);
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
	public TelaCadastraProduto(Padaria padaria) {
		initialize();
		this.padaria = padaria;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		
		frmCadastrarProduto = new JFrame();
		frmCadastrarProduto.setTitle("Cadastrar produto");
		frmCadastrarProduto.setBounds(100, 100, 450, 300);
		frmCadastrarProduto.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCadastrarProduto.getContentPane().setLayout(null);
		
		lblNomeDoProduto = new JLabel("Nome do produto*");
		lblNomeDoProduto.setBounds(10, 11, 121, 14);
		frmCadastrarProduto.getContentPane().add(lblNomeDoProduto);
		
		txtNomeProduto = new JFormattedTextField(createFormatter("***********************************"));
		txtNomeProduto.setBounds(10, 27, 121, 20);
		frmCadastrarProduto.getContentPane().add(txtNomeProduto);
		txtNomeProduto.setColumns(10);
		
		lblCodigo = new JLabel("Codigo*");
		lblCodigo.setBounds(152, 11, 121, 14);
		frmCadastrarProduto.getContentPane().add(lblCodigo);
		
		txtCodigoProduto = new JFormattedTextField(createFormatter("######"));
		txtCodigoProduto.setColumns(10);
		txtCodigoProduto.setBounds(152, 27, 121, 20);
		frmCadastrarProduto.getContentPane().add(txtCodigoProduto);
		
		lblPreoDeCompra = new JLabel("Pre\u00E7o de compra*");
		lblPreoDeCompra.setBounds(10, 58, 121, 14);
		frmCadastrarProduto.getContentPane().add(lblPreoDeCompra);
		
		txtCompra = new JFormattedTextField(createFormatter("##.##"));
		txtCompra.setColumns(10);
		txtCompra.setBounds(10, 74, 121, 20);
		frmCadastrarProduto.getContentPane().add(txtCompra);
		
		lblPreoDeVenda = new JLabel("Pre\u00E7o de venda*");
		lblPreoDeVenda.setBounds(152, 58, 121, 14);
		frmCadastrarProduto.getContentPane().add(lblPreoDeVenda);
		
		txtVenda = new JFormattedTextField(createFormatter("##.##"));
		txtVenda.setColumns(10);
		txtVenda.setBounds(152, 74, 121, 20);
		frmCadastrarProduto.getContentPane().add(txtVenda);
		
		lblCodigoDoFornecedor = new JLabel("Codigo do fornecedor*");
		lblCodigoDoFornecedor.setBounds(287, 11, 121, 14);
		frmCadastrarProduto.getContentPane().add(lblCodigoDoFornecedor);
		
		txtCodigo = new JFormattedTextField(createFormatter("###"));
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(287, 27, 121, 20);
		frmCadastrarProduto.getContentPane().add(txtCodigo);
		
		lblApelidos = new JLabel("Apelido 1");
		lblApelidos.setBounds(10, 105, 121, 14);
		frmCadastrarProduto.getContentPane().add(lblApelidos);
		
		txtApelido1 = new JTextField();
		txtApelido1.setToolTipText("Apelido 1");
		txtApelido1.setBounds(10, 121, 121, 20);
		frmCadastrarProduto.getContentPane().add(txtApelido1);
		txtApelido1.setColumns(10);
		
		txtApelido2 = new JTextField();
		txtApelido2.setToolTipText("Apelido 2");
		txtApelido2.setColumns(10);
		txtApelido2.setBounds(152, 121, 121, 20);
		frmCadastrarProduto.getContentPane().add(txtApelido2);
		
		txtApelido3 = new JTextField();
		txtApelido3.setToolTipText("Apelido 3");
		txtApelido3.setColumns(10);
		txtApelido3.setBounds(287, 121, 121, 20);
		frmCadastrarProduto.getContentPane().add(txtApelido3);
		
		txtApelido4 = new JTextField();
		txtApelido4.setToolTipText("Apelido 4");
		txtApelido4.setColumns(10);
		txtApelido4.setBounds(10, 168, 121, 20);
		frmCadastrarProduto.getContentPane().add(txtApelido4);
		
		txtApelido5 = new JTextField();
		txtApelido5.setToolTipText("Apelido 5");
		txtApelido5.setColumns(10);
		txtApelido5.setBounds(152, 168, 121, 20);
		frmCadastrarProduto.getContentPane().add(txtApelido5);
		
		lblQuantidadeInicialNo = new JLabel("Quantidade inicial*");
		lblQuantidadeInicialNo.setBounds(287, 58, 150, 14);
		frmCadastrarProduto.getContentPane().add(lblQuantidadeInicialNo);
		
		JCheckBox chckbxPerecvel = new JCheckBox("\u00C9 perec\u00EDvel?");
		chckbxPerecvel.setSelected(true);
		chckbxPerecvel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxPerecvel.isSelected()) {
					txtDia.setEnabled(true);
					txtMes.setEnabled(true);
					txtAno.setEnabled(true);
				}
				else {
					txtDia.setEnabled(false);
					txtMes.setEnabled(false);
					txtAno.setEnabled(false);
				}
			}
		});
		chckbxPerecvel.setBounds(287, 148, 121, 23);
		frmCadastrarProduto.getContentPane().add(chckbxPerecvel);
		
		txtQuantidade = new JFormattedTextField(createFormatter("##"));
		txtQuantidade.setBounds(287, 74, 121, 20);
		frmCadastrarProduto.getContentPane().add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		btnCadastrarProduto = new JButton("Cadastrar produto!");
		btnCadastrarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				boolean existeFornecedor = false;
				boolean estoqueValido = false;
				
				String[] apelido = new String[] {txtApelido1.getText(), txtApelido2.getText(), txtApelido3.getText(), txtApelido4.getText(), txtApelido5.getText()};
				if(txtApelido1.getText().equals("")) {
					apelido[0] = null;
				}
				if(txtApelido2.getText().equals("")) {
					apelido[1] = null;
				}
				if(txtApelido3.getText().equals("")) {
					apelido[2] = null;
				}
				if(txtApelido4.getText().equals("")) {
					apelido[3] = null;
				}
				if(txtApelido5.getText().equals("")) {
					apelido[4] = null;
				}
				
				boolean data = false;
				if (chckbxPerecvel.isSelected()){
					try {
						data = ValidaData.isDateValid(Integer.parseInt(txtDia.getText()), Integer.parseInt(txtMes.getText()), Integer.parseInt(txtAno.getText()));
					}
					catch (NumberFormatException exception) {
						JOptionPane.showMessageDialog(null, "Por favor, preencha com uma data válida no formato XX/XX/XXXX");
					}
				}
				if(data && (txtCodigo.getText().equals("   ") || padaria.encontraFornecedor(txtCodigo.getText()) == null)){
					JOptionPane.showMessageDialog(null, "Fornecedor inválido");
				}
				else if(data && (txtQuantidade.getText().equals("  ") || Integer.parseInt(txtQuantidade.getText()) > 30 || Integer.parseInt(txtQuantidade.getText()) < 0 )) {
					JOptionPane.showMessageDialog(null, "Quantidade para cadastro no estoque inválido");
				}
				else if(data && (txtCodigoProduto.getText().equals("      ") || padaria.encontraFornecedor(txtCodigo.getText()) == null)){
					JOptionPane.showMessageDialog(null, "Código inválido, deve ter 6 dígitos");
				}
				else {	
						existeFornecedor = true;
						estoqueValido = true;
				}	
				if(existeFornecedor && estoqueValido && !chckbxPerecvel.isSelected()) {
						padaria.getEstoque().cadastrarProdutoNaoPerecivel(txtNomeProduto.getText(), txtCodigoProduto.getText(), padaria.encontraFornecedor(txtCodigo.getText()), 
								Float.parseFloat(txtCompra.getText()), Float.parseFloat(txtVenda.getText()), apelido, Integer.parseInt(txtQuantidade.getText()));
						JOptionPane.showMessageDialog(null, "Produto não perecível cadastrado com sucesso!");
						frmCadastrarProduto.setVisible(false);			
				}
				else if (existeFornecedor && estoqueValido && data && chckbxPerecvel.isSelected()) {
					try {	
						padaria.getEstoque().cadastrarProdutoPerecivel(txtNomeProduto.getText(), txtCodigoProduto.getText(), padaria.encontraFornecedor(txtCodigo.getText()), 
								Float.parseFloat(txtCompra.getText()), Float.parseFloat(txtVenda.getText()), Integer.parseInt(txtDia.getText()), Integer.parseInt(txtMes.getText()), Integer.parseInt(txtAno.getText()), apelido, Integer.parseInt(txtQuantidade.getText()));
						JOptionPane.showMessageDialog(null, "Produto perecível cadastrado com sucesso!");
						frmCadastrarProduto.setVisible(false);
					}
					catch (NumberFormatException exception) {
						JOptionPane.showMessageDialog(null, "Percebemos algum problema, preencha tudo corretamente!");
					}
				}
			}
		});
		btnCadastrarProduto.setBounds(10, 227, 414, 23);
		frmCadastrarProduto.getContentPane().add(btnCadastrarProduto);
		
		lblDataDeValidade = new JLabel("Data de validade");
		lblDataDeValidade.setBounds(287, 180, 122, 14);
		frmCadastrarProduto.getContentPane().add(lblDataDeValidade);
		
		txtDia = new JFormattedTextField(createFormatter("##"));
		txtDia.setBounds(287, 196, 28, 20);
		frmCadastrarProduto.getContentPane().add(txtDia);
		txtDia.setColumns(10);
		
		txtMes = new JFormattedTextField(createFormatter("##"));
		txtMes.setColumns(10);
		txtMes.setBounds(335, 196, 28, 20);
		frmCadastrarProduto.getContentPane().add(txtMes);
		
		txtAno = new JFormattedTextField(createFormatter("####"));
		txtAno.setColumns(10);
		txtAno.setBounds(380, 196, 44, 20);
		frmCadastrarProduto.getContentPane().add(txtAno);
		
		label = new JLabel("/");
		label.setBounds(325, 199, 46, 14);
		frmCadastrarProduto.getContentPane().add(label);
		
		label_1 = new JLabel("/");
		label_1.setBounds(371, 199, 73, 14);
		frmCadastrarProduto.getContentPane().add(label_1);
		
		lblcamposObrigtorios = new JLabel("*Campos obrig\u00E1torios");
		lblcamposObrigtorios.setBounds(9, 202, 122, 14);
		frmCadastrarProduto.getContentPane().add(lblcamposObrigtorios);
		
		lblApelido = new JLabel("Apelido 2");
		lblApelido.setBounds(152, 105, 121, 14);
		frmCadastrarProduto.getContentPane().add(lblApelido);
		
		lblApelido_1 = new JLabel("Apelido 3");
		lblApelido_1.setBounds(287, 105, 121, 14);
		frmCadastrarProduto.getContentPane().add(lblApelido_1);
		
		lblApelido_2 = new JLabel("Apelido 4");
		lblApelido_2.setBounds(10, 152, 121, 14);
		frmCadastrarProduto.getContentPane().add(lblApelido_2);
		
		lblApelido_3 = new JLabel("Apelido 5");
		lblApelido_3.setBounds(152, 152, 121, 14);
		frmCadastrarProduto.getContentPane().add(lblApelido_3);
		
		
		
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
