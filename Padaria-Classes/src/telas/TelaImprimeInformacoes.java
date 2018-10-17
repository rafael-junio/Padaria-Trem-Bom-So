
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
		
		JLabel lblEscolhaAOpo = new JLabel("Escolha a op\u00E7\u00E3o para mostrar as informa\u00E7\u00F5es de todos os elementos:");
		lblEscolhaAOpo.setBounds(10, 11, 374, 14);
		frmImprimeInformacoes.getContentPane().add(lblEscolhaAOpo);
		
		JButton btnProdutosEmEstoque = new JButton("Produtos em estoque");
		btnProdutosEmEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				padaria.imprimeInfoProdutos();
				JOptionPane.showMessageDialog(null, "Informações impressas no console");
			}
		});
		btnProdutosEmEstoque.setBounds(10, 36, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnProdutosEmEstoque);
		
		JButton btnProdutosVendidos = new JButton("Produtos vendidos");
		btnProdutosVendidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				padaria.imprimeInfoVendas();
				JOptionPane.showMessageDialog(null, "Informações impressas no console");
			}
		});
		btnProdutosVendidos.setBounds(224, 36, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnProdutosVendidos);
		
		JButton btnClientesCadastrados = new JButton("Clientes cadastrados");
		btnClientesCadastrados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				padaria.imprimeInfoClientes();
				JOptionPane.showMessageDialog(null, "Informações impressas no console");
			}
		});
		btnClientesCadastrados.setBounds(10, 70, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnClientesCadastrados);
		
		JButton btnFornecedoresCadastrados = new JButton("Fornecedores cadastrados");
		btnFornecedoresCadastrados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				padaria.imprimeInfoFornecedores();
				JOptionPane.showMessageDialog(null, "Informações impressas no console");
			}
		});
		btnFornecedoresCadastrados.setBounds(224, 70, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnFornecedoresCadastrados);
		
		JButton btnFuncionariosCadastrados = new JButton("Funcionarios cadastrados");
		btnFuncionariosCadastrados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				padaria.imprimeInfoFuncionarios();
				JOptionPane.showMessageDialog(null, "Informações impressas no console");
			}
		});
		btnFuncionariosCadastrados.setBounds(10, 104, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnFuncionariosCadastrados);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 138, 414, 2);
		frmImprimeInformacoes.getContentPane().add(separator);
		
		JLabel lblCasoQueiraPesquisar = new JLabel("Caso queira pesquisar por um elemento espec\u00EDfico:");
		lblCasoQueiraPesquisar.setBounds(10, 148, 314, 14);
		frmImprimeInformacoes.getContentPane().add(lblCasoQueiraPesquisar);
		
		JButton btnProcuraProduto = new JButton("Procura produto");
		btnProcuraProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				padaria.imprimeInfoProdutos(JOptionPane.showInputDialog("Digite o código do produto. (6 Digítos)"));
				
				
				//AINDA FALTA FAZER
			}
		});
		btnProcuraProduto.setBounds(10, 167, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnProcuraProduto);
		
		JButton btnProcuraCliente = new JButton("Procura cliente");
		btnProcuraCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String info = JOptionPane.showInputDialog("Digite o CPF do cliente. (11 Digítos)");
				
				if(info == null)
					JOptionPane.showMessageDialog(null, "Operação cancelada");
				else if (info != null){
					padaria.imprimeInfoClientes(info);
				}
				
				
			}
		});
		btnProcuraCliente.setBounds(224, 201, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnProcuraCliente);
		
		JButton btnProcuraFornecedor = new JButton("Procura Fornecedor");
		btnProcuraFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String info = JOptionPane.showInputDialog("Digite o código do fornecedor. (3 Digítos)");
				
				if(info == null)
					JOptionPane.showMessageDialog(null, "Operação cancelada");
				else if (info != null){
					padaria.imprimeInfoFornecedores(info);
				}
				
			}
		});
		btnProcuraFornecedor.setBounds(224, 167, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnProcuraFornecedor);
		
		JButton btnProcuraFuncionrio = new JButton("Procura funcion\u00E1rio");
		btnProcuraFuncionrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String info = JOptionPane.showInputDialog("Digite o código do funcionário. (4 Digítos)");
				
				if(info == null)
					JOptionPane.showMessageDialog(null, "Operação cancelada");
				else if (info != null){
					padaria.imprimeInfoFuncionarios(info);
				}	
			}
		});
		btnProcuraFuncionrio.setBounds(10, 201, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnProcuraFuncionrio);
		
		JLabel lblAsInformaes = new JLabel("* As informa\u00E7\u00F5es ser\u00E3o mostradas no console");
		lblAsInformaes.setBounds(157, 235, 267, 14);
		frmImprimeInformacoes.getContentPane().add(lblAsInformaes);
	}
}
