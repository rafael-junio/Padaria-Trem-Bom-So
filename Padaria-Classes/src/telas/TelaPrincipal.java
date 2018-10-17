package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;

import controle.Padaria;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal{
	

	private JFrame frmPadariaTremBo;
	private static Padaria padaria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal(padaria);
					window.frmPadariaTremBo.setVisible(true);

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
	public TelaPrincipal(Padaria padaria) {
		initialize();
		this.padaria = padaria;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmPadariaTremBo = new JFrame();
		frmPadariaTremBo.setTitle("Padaria Trem B\u00E3o S\u00F4");
		frmPadariaTremBo.setBounds(100, 100, 450, 300);
		frmPadariaTremBo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPadariaTremBo.getContentPane().setLayout(null);
		
		JButton btnCadastrarProduto = new JButton("Cadastrar Produto");
		btnCadastrarProduto.addActionListener(new ActionListener() {

			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastraProduto p = new TelaCadastraProduto(padaria);
				p.main(null);
				
			}
		});
		btnCadastrarProduto.setBounds(25, 22, 383, 23);
		frmPadariaTremBo.getContentPane().add(btnCadastrarProduto);
		
		JButton btnVenderProduto = new JButton("Vender produto");
		btnVenderProduto.setBounds(25, 56, 383, 23);
		frmPadariaTremBo.getContentPane().add(btnVenderProduto);
		
		JButton btnImprimirInformaes = new JButton("Imprimir informa\u00E7\u00F5es dos produtos em estoque");
		btnImprimirInformaes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				padaria.imprimeInformacoesEstoque();
			}
		});
		btnImprimirInformaes.setBounds(25, 210, 383, 23);
		frmPadariaTremBo.getContentPane().add(btnImprimirInformaes);
		
		JButton btnNewButton = new JButton("Cadastrar cliente");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				
				TelaCadastraCliente p = new TelaCadastraCliente(padaria);
				p.main(null);
				
			}
		});
		btnNewButton.setBounds(25, 90, 383, 23);
		frmPadariaTremBo.getContentPane().add(btnNewButton);
		
		JButton btnCadastrarFornecedor = new JButton("Cadastrar Fornecedor");
		btnCadastrarFornecedor.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				
				TelaCadastraFornecedor p = new TelaCadastraFornecedor(padaria);
				p.main(null);
			}
		});
		btnCadastrarFornecedor.setBounds(25, 124, 383, 23);
		frmPadariaTremBo.getContentPane().add(btnCadastrarFornecedor);
		
		JButton btnCadastrarFuncionrio = new JButton("Cadastrar Funcion\u00E1rio");
		btnCadastrarFuncionrio.setBounds(25, 158, 383, 23);
		frmPadariaTremBo.getContentPane().add(btnCadastrarFuncionrio);
	}
}
