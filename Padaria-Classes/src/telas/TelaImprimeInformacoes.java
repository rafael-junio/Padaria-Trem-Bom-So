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
		
		JButton btnProcuraProduto = new JButton("Produtos");
		btnProcuraProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {	
					String codigo = JOptionPane.showInputDialog("Digite o código do produto. (6 Digítos)");
					padaria.imprimeInfoEstoque(codigo);
					}
				catch (Exception exception){
					padaria.imprimeInfoEstoque();
				}
			}
		});
		btnProcuraProduto.setBounds(10, 36, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnProcuraProduto);
		
		JButton btnProcuraCliente = new JButton("Clientes");
		btnProcuraCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String info = JOptionPane.showInputDialog("Digite o CPF do cliente");
				padaria.imprimeInfoClientes(info);
				
				if(info == null || info.equals(""))
					padaria.imprimeInfoClientes();
			}
		});
		btnProcuraCliente.setBounds(10, 104, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnProcuraCliente);
		
		JButton btnProcuraFornecedor = new JButton("Fornecedores");
		btnProcuraFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String info = JOptionPane.showInputDialog("Digite o código do fornecedor. (3 Digítos)");
				padaria.imprimeInfoFornecedores(info);
				
				if(info == null || info.equals(""))
					padaria.imprimeInfoFornecedores();
				
				
			}
		});
		btnProcuraFornecedor.setBounds(224, 36, 200, 23);
		frmImprimeInformacoes.getContentPane().add(btnProcuraFornecedor);
		
		JButton btnProcuraFuncionrio = new JButton("Funcion\u00E1rios");
		btnProcuraFuncionrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String info = JOptionPane.showInputDialog("Digite o código do funcionário. (4 Digítos)");
				padaria.imprimeInfoFuncionarios(info);

				if(info == null || info.equals(""))
					padaria.imprimeInfoFuncionarios();

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
				padaria.imprimeInfoPadaria();
			}
		});
		btnNewButton.setBounds(10, 161, 414, 64);
		frmImprimeInformacoes.getContentPane().add(btnNewButton);
		
		JLabel lblEscolhaUmaOpo = new JLabel("Digite um c\u00F3digo v\u00E1lido ou deixe em branco para todos os elementos.");
		lblEscolhaUmaOpo.setBounds(10, 11, 414, 14);
		frmImprimeInformacoes.getContentPane().add(lblEscolhaUmaOpo);
	}
}
