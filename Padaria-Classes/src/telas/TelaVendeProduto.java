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

import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class TelaVendeProduto {

	private JFrame frmVendaDeProdutos;
	private static Padaria padaria;
	
	protected int cont;
	
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
		this.cont = 0;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Calendar c = Calendar.getInstance();
		
		int dia = c.get(Calendar.DAY_OF_MONTH);
		int mes = c.get(Calendar.MONTH) + 1;
		int ano = c.get(Calendar.YEAR);

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
		
		JLabel lblDataDaCompra = new JLabel("Data de hoje:");
		lblDataDaCompra.setBounds(10, 123, 94, 14);
		frmVendaDeProdutos.getContentPane().add(lblDataDaCompra);
		
		txtData = new JFormattedTextField(createFormatter(dia + "/" + mes + "/" + ano));
		txtData.setEditable(false);
		txtData.setHorizontalAlignment(SwingConstants.CENTER);
		txtData.setBounds(10, 148, 119, 20);
		frmVendaDeProdutos.getContentPane().add(txtData);
		txtData.setColumns(10);
		
		JLabel lblNmerosDeParcela = new JLabel("N\u00FAmeros de parcela");
		lblNmerosDeParcela.setBounds(157, 67, 119, 14);
		frmVendaDeProdutos.getContentPane().add(lblNmerosDeParcela);
		
		txtParcela = new JFormattedTextField(createFormatter("#"));
		
		frmVendaDeProdutos.getContentPane().add(txtParcela);
		txtParcela.setColumns(10);
		
		JButton btnNewButton = new JButton("Vender produto!");
		btnNewButton.setEnabled(false);

		frmVendaDeProdutos.getContentPane().add(btnNewButton);
		
		
		
		txtParcela.setBounds(157, 92, 33, 20);
		
		rdbtnVista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnVista.isSelected()) {
					rdbtnCrdito.setSelected(false);
					txtParcela.setEnabled(false);
					txtParcela.setText("0");
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
					txtParcela.setText("#");
					lblNmerosDeParcela.setEnabled(true);
				}	
			}
		});
		rdbtnCrdito.setBounds(157, 35, 109, 23);
		
		JLabel lblCodigoDoVendedor = new JLabel("Codigo do vendedor");
		lblCodigoDoVendedor.setBounds(280, 67, 119, 14);
		frmVendaDeProdutos.getContentPane().add(lblCodigoDoVendedor);
		
		txtCodigoVendedor = new JFormattedTextField(createFormatter("####"));
		txtCodigoVendedor.setBounds(280, 92, 119, 20);
		frmVendaDeProdutos.getContentPane().add(txtCodigoVendedor);
		txtCodigoVendedor.setColumns(10);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String pagamento = "";
					String CPF = txtCPF.getText();
					String codigoVendedor = txtCodigoVendedor.getText();
					int parcela = Integer.parseInt(txtParcela.getText());

					if(rdbtnCrdito.isSelected()) {
						pagamento = "credito";
					}
					else
						pagamento = "Dinheiro";
					
					boolean cpfValido = false;
					
					if(padaria.encontraCliente(txtCPF.getText()) != null) {
						cpfValido = true;
					}
					else
						JOptionPane.showMessageDialog(null, "CPF inválido");
					
					if(cpfValido && cont > 0) {
						padaria.realizarVenda(CPF, codigoVendedor, pagamento, parcela, dia, mes, ano);
						JOptionPane.showMessageDialog(null, "Venda concluída!");
						if(padaria.cadastrarClienteGold(txtCPF.getText()))
							JOptionPane.showMessageDialog(null, "Cliente de CPF: " + txtCPF.getText() + " agora é Cliente Gold!");
						if(padaria.cadastrarClientePlatinum(txtCPF.getText()))
							JOptionPane.showMessageDialog(null, "Cliente de CPF: " + txtCPF.getText() + " agora é Cliente Platinum!");
						frmVendaDeProdutos.dispose();
					}
					else
						JOptionPane.showMessageDialog(null, "Adicione produtos ao carrinho");
				}
				catch(Exception exception) {
					JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos corretamente!");
				}
			
			}
		});
		btnNewButton.setBounds(10, 214, 414, 36);
		
		JCheckBox chckbxFinalizarVenda = new JCheckBox("Finalizar venda?");
		chckbxFinalizarVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxFinalizarVenda.isSelected()) {
					btnNewButton.setEnabled(true);
				}
				else
					btnNewButton.setEnabled(false);
			}
		});
		chckbxFinalizarVenda.setBounds(10, 184, 137, 23);
		frmVendaDeProdutos.getContentPane().add(chckbxFinalizarVenda);
		
		JLabel lblProdutosNoCarrinho = new JLabel("Produtos no carrinho(0)");
		lblProdutosNoCarrinho.setBounds(280, 135, 184, 14);
		frmVendaDeProdutos.getContentPane().add(lblProdutosNoCarrinho);
		
		JButton btnNewButton_1 = new JButton("Adicionar produto ao carrinho");
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent e) {
				
				
				if(txtCodigo.getText().equals("      ")) {
					JOptionPane.showMessageDialog(null, "Código do produto inválido");
				}
				else if(txtCodigoVendedor.getText().equals("    ") || padaria.encontraVendedor(txtCodigoVendedor.getText()) == null) {
					JOptionPane.showMessageDialog(null, "Código do vendedor inválido");
				}
				else if(padaria.encontraCliente(txtCPF.getText()) == null) {
					JOptionPane.showMessageDialog(null, "CPF do cliente inválido");
				}
				else if(txtQuantidade.getText().equals("  ") || Integer.parseInt(txtQuantidade.getText()) > 30 || Integer.parseInt(txtQuantidade.getText()) < 0)
					JOptionPane.showMessageDialog(null, "Quantidade para compra inválido");
				else if(txtData.equals("  /  /    "))
					JOptionPane.showMessageDialog(null, "Data inválida");
				else if(((rdbtnCrdito.isSelected() && Integer.parseInt(txtParcela.getText()) > 0) || rdbtnVista.isSelected())){	
					try {
						padaria.adicionarProdutoVenda(txtCodigo.getText(), Integer.parseInt(txtQuantidade.getText()));
					} catch (Exception NumberFormatException) {
						JOptionPane.showMessageDialog(null, "Ocorreu um erro, por favor preencha todos os campos corretamente.");				
					}
					JOptionPane.showMessageDialog(null, "Produto adicionado no carrinho com sucesso");
					cont++;
					lblProdutosNoCarrinho.setText(String.valueOf("Produtos no carrinho("+ String.valueOf(cont) + ")"));
				}
				else
					JOptionPane.showMessageDialog(null, "Selecione a opção de crédito ou a vista e preencha a quantidade de parcelas caso for crédito");
			}
		});
		btnNewButton_1.setBounds(200, 161, 224, 46);
		frmVendaDeProdutos.getContentPane().add(btnNewButton_1);
		
		
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
