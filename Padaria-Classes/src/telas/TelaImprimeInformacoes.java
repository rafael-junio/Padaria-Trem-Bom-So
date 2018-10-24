package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;

import controle.Padaria;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaImprimeInformacoes {

	private JFrame frmImprimeInformacoes;
	
	private static Padaria padaria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaImprimeInformacoes window = new TelaImprimeInformacoes(padaria);
					window.frmImprimeInformacoes.setVisible(true);
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
	public TelaImprimeInformacoes(Padaria padaria) {
		initialize();
		this.padaria = padaria;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmImprimeInformacoes = new JFrame();
		frmImprimeInformacoes.setTitle("Imprime Informacoes");
		frmImprimeInformacoes.setBounds(100, 100, 450, 300);
		frmImprimeInformacoes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmImprimeInformacoes.getContentPane().setLayout(null);
		
		JButton btnProdutosVendidos = new JButton("Produtos Vendidos");
		btnProdutosVendidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				padaria.imprimeInfoVendas();
				JOptionPane.showMessageDialog(null, "Informações impressas no console");
			}
		});
		btnProdutosVendidos.setBounds(224, 70, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnProdutosVendidos);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 138, 414, 2);
		frmImprimeInformacoes.getContentPane().add(separator);
		
		JButton btnProcuraProduto = new JButton("Estoque");
		btnProcuraProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String info = JOptionPane.showInputDialog("Digite o codigo do produto (6 dígitos)");
				try {
					if(info == null || info.equals("")) {
						JOptionPane.showMessageDialog(null, "Informações impressas no console!");
						padaria.imprimeInfoEstoque();
					}
					else if(padaria.getEstoque().produdoEmEstoque(info)){
						JOptionPane.showMessageDialog(null, "Informações impressas no console!");
						padaria.imprimeInfoEstoque(info);
					}
					else
						JOptionPane.showMessageDialog(null, "Código inválido");
				}
				catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Ocorreu um problema, digite o código número do produto ou deixe o campo vazio!");
				}
			}
		});
		btnProcuraProduto.setBounds(10, 36, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnProcuraProduto);
		
		JButton btnProcuraCliente = new JButton("Clientes");
		btnProcuraCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String info = JOptionPane.showInputDialog("Digite o CPF do cliente");
				try {
					if(info == null || info.equals("")) {
						JOptionPane.showMessageDialog(null, "Informações impressas no console!");
						padaria.imprimeInfoClientes();
					}
					else if(padaria.clienteEstaCadastrado(info)){
						JOptionPane.showMessageDialog(null, "Informações impressas no console!");
						padaria.imprimeInfoClientes(info);
					}
					else
						JOptionPane.showMessageDialog(null, "Código inválido");
				}
				catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Ocorreu um problema, digite o cpf sem pontuação do cliente ou deixe o campo vazio!");
				}
					
			}
		});
		btnProcuraCliente.setBounds(10, 104, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnProcuraCliente);
		
		JButton btnProcuraFornecedor = new JButton("Fornecedores");
		btnProcuraFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String info = JOptionPane.showInputDialog("Digite o código do fornecedor. (3 Digítos)");
				try {
					if(info == null || info.equals("")) {
						JOptionPane.showMessageDialog(null, "Informações impressas no console!");
						padaria.imprimeInfoFornecedores();
					}
					else if(padaria.fornecedorEstaCadastrado(info)){
						JOptionPane.showMessageDialog(null, "Informações impressas no console!");
						padaria.imprimeInfoFornecedores(info);
					}
					else
						JOptionPane.showMessageDialog(null, "Código inválido");
				}
				catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Ocorreu um problema, digite o código númerico do fornecedor ou deixe o campo vazio!");
				}	
				
				
			}
		});
		btnProcuraFornecedor.setBounds(224, 36, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnProcuraFornecedor);
		
		JButton btnProcuraFuncionrio = new JButton("Funcion\u00E1rios");
		btnProcuraFuncionrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String info = JOptionPane.showInputDialog("Digite o código do funcionário. (4 Digítos)");
				try {
					if(info == null || info.equals("")) {
						JOptionPane.showMessageDialog(null, "Informações impressas no console!");
						padaria.imprimeInfoFuncionarios();
					}
					else if(padaria.funcionarioEstaCadastrado(info)){
						JOptionPane.showMessageDialog(null, "Informações impressas no console!");
						padaria.imprimeInfoFuncionarios(info);
					}
					else
						JOptionPane.showMessageDialog(null, "Código inválido");
				}
				catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Ocorreu um problema, digite o código númerico do funcionário ou deixe o campo vazio!");
				}
				
			}
		});
		btnProcuraFuncionrio.setBounds(10, 70, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnProcuraFuncionrio);
		
		JLabel lblAsInformaes = new JLabel("* As informa\u00E7\u00F5es ser\u00E3o mostradas no console");
		lblAsInformaes.setBounds(157, 236, 267, 14);
		frmImprimeInformacoes.getContentPane().add(lblAsInformaes);
		
		JButton btnNewButton = new JButton("Imprime informa\u00E7\u00F5es de toda a padaria");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Informações impressas no console!");
				padaria.imprimeInfoPadaria();
			}
		});
		btnNewButton.setBounds(10, 161, 414, 64);
		frmImprimeInformacoes.getContentPane().add(btnNewButton);
		
		JLabel lblEscolhaUmaOpo = new JLabel("Digite um c\u00F3digo v\u00E1lido ou deixe em branco para todos os elementos.");
		lblEscolhaUmaOpo.setBounds(10, 11, 414, 14);
		frmImprimeInformacoes.getContentPane().add(lblEscolhaUmaOpo);
		
		JButton btnNewButton_1 = new JButton("Imprime imposto");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Informações impressas no console!");
				padaria.imprimeInfoImposto();
			}
		});
		btnNewButton_1.setBounds(224, 104, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnNewButton_1);
	}
}
