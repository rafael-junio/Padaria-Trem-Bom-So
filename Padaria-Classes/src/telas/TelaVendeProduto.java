package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;

import controle.Padaria;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaVendeProduto {

	private JFrame frmVendaDeProdutos;
	private static Padaria padaria;
	private JTextField txtCodigo;
	private JTextField txtCPF;
	private JTextField txtQuantidade;
	private JTextField txtData;
	private JTextField txtParcela;
	private JTextField txtCodigoVendedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVendeProduto window = new TelaVendeProduto(padaria);
					window.frmVendaDeProdutos.setVisible(true);
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
	public TelaVendeProduto(Padaria padaria) {
		initialize();
		this.padaria = padaria;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVendaDeProdutos = new JFrame();
		frmVendaDeProdutos.setTitle("Venda de produtos");
		frmVendaDeProdutos.setBounds(100, 100, 450, 300);
		frmVendaDeProdutos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmVendaDeProdutos.getContentPane().setLayout(null);
		
		JLabel lblCdigoDoProduto = new JLabel("C\u00F3digo do produto");
		lblCdigoDoProduto.setBounds(10, 11, 144, 14);
		frmVendaDeProdutos.getContentPane().add(lblCdigoDoProduto);
		
		txtCodigo = new JFormattedTextField(createFormatter("######"));
		txtCodigo.setBounds(10, 36, 119, 20);
		frmVendaDeProdutos.getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblCpfDoCliente = new JLabel("CPF do cliente");
		lblCpfDoCliente.setBounds(10, 67, 94, 14);
		frmVendaDeProdutos.getContentPane().add(lblCpfDoCliente);
		
		txtCPF = new JFormattedTextField(createFormatter("###.###.###-##"));
		txtCPF.setBounds(10, 92, 119, 20);
		frmVendaDeProdutos.getContentPane().add(txtCPF);
		txtCPF.setColumns(10);
		
		JRadioButton rdbtnCrdito = new JRadioButton("Cr\u00E9dito");
		
		frmVendaDeProdutos.getContentPane().add(rdbtnCrdito);
		
		JRadioButton rdbtnVista = new JRadioButton("\u00C0 vista / d\u00E9bito");
		
		frmVendaDeProdutos.getContentPane().add(rdbtnVista);
		
		JLabel lblMtodoDePagamento = new JLabel("M\u00E9todo de pagamento");
		lblMtodoDePagamento.setBounds(163, 11, 155, 14);
		frmVendaDeProdutos.getContentPane().add(lblMtodoDePagamento);
		
		JLabel lblQuantidadeComprada = new JLabel("Quantidade comprada");
		lblQuantidadeComprada.setBounds(157, 123, 161, 14);
		frmVendaDeProdutos.getContentPane().add(lblQuantidadeComprada);
		
		txtQuantidade = new JFormattedTextField(createFormatter("##"));
		txtQuantidade.setBounds(157, 148, 33, 20);
		frmVendaDeProdutos.getContentPane().add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		JLabel lblDataDaCompra = new JLabel("Data da compra");
		lblDataDaCompra.setBounds(10, 123, 94, 14);
		frmVendaDeProdutos.getContentPane().add(lblDataDaCompra);
		
		txtData = new JFormattedTextField(createFormatter("##/##/####"));
		txtData.setBounds(10, 148, 119, 20);
		frmVendaDeProdutos.getContentPane().add(txtData);
		txtData.setColumns(10);
		
		JLabel lblNmerosDeParcela = new JLabel("N\u00FAmeros de parcela");
		lblNmerosDeParcela.setBounds(157, 67, 119, 14);
		frmVendaDeProdutos.getContentPane().add(lblNmerosDeParcela);
		
		txtParcela = new JFormattedTextField(createFormatter("##"));
		
		frmVendaDeProdutos.getContentPane().add(txtParcela);
		txtParcela.setColumns(10);
		
		JButton btnNewButton = new JButton("Vender produto!");

		frmVendaDeProdutos.getContentPane().add(btnNewButton);
		
		
		txtParcela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		txtParcela.setBounds(157, 92, 33, 20);
		
		rdbtnVista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnVista.isSelected()) {
					rdbtnCrdito.setSelected(false);
					txtParcela.setEnabled(false);
					txtParcela.setText("01");
					lblNmerosDeParcela.setEnabled(false);
				}					
			}
		});
		rdbtnVista.setBounds(280, 35, 119, 23);
		
		rdbtnCrdito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnCrdito.isSelected()) {
					rdbtnVista.setSelected(false);
					txtParcela.setEnabled(true);
					txtParcela.setText("  ");
					lblNmerosDeParcela.setEnabled(true);
				}	
			}
		});
		rdbtnCrdito.setBounds(157, 35, 109, 23);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int dia = Integer.parseInt(txtData.getText().substring(0, 1));
				int mes = Integer.parseInt(txtData.getText().substring(3, 4));
				int ano = Integer.parseInt(txtData.getText().substring(6, 7));
				
				String pagamento = "";
				if(rdbtnCrdito.isSelected()) {
					pagamento = "Crédito";
				}
				else
					pagamento = "Vista";
				
				boolean cpfValido = false;
				
				if(padaria.encontraCliente(txtCPF.getText()) != null) {
					cpfValido = true;
				}
				else
					JOptionPane.showMessageDialog(null, "CPF inválido");
				
				if(cpfValido) {
					padaria.adicionarProdutoVenda(txtCodigoVendedor.getText(), Integer.parseInt(txtQuantidade.getText()));
					padaria.realizarVenda(txtCPF.getText(), txtCodigo.getText(), pagamento, Integer.parseInt(txtParcela.getText()), dia, mes, ano);
				}
			
			}
		});
		btnNewButton.setBounds(10, 193, 414, 57);
		
		JLabel lblCodigoDoVendedor = new JLabel("Codigo do vendedor");
		lblCodigoDoVendedor.setBounds(280, 67, 119, 14);
		frmVendaDeProdutos.getContentPane().add(lblCodigoDoVendedor);
		
		txtCodigoVendedor = new JFormattedTextField(createFormatter("######"));
		txtCodigoVendedor.setBounds(280, 92, 119, 20);
		frmVendaDeProdutos.getContentPane().add(txtCodigoVendedor);
		txtCodigoVendedor.setColumns(10);
		
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
