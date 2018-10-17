package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
		btnCadastrarProduto.setBounds(10, 22, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnCadastrarProduto);
		
		JButton btnVenderProduto = new JButton("Vender produto");
		btnVenderProduto.setBounds(227, 22, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnVenderProduto);
		
		JButton btnImprimirInformaes = new JButton("Verifique aqui as informa\u00E7\u00F5es que queira mostrar");
		btnImprimirInformaes.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				
				TelaImprimeInformacoes p = new TelaImprimeInformacoes(padaria);
				p.main(null);
			}
		});
		btnImprimirInformaes.setBounds(25, 181, 383, 52);
		frmPadariaTremBo.getContentPane().add(btnImprimirInformaes);
		
		JButton btnNewButton = new JButton("Cadastrar cliente");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				
				TelaCadastraCliente p = new TelaCadastraCliente(padaria);
				p.main(null);
				
			}
		});
		btnNewButton.setBounds(10, 56, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnNewButton);
		
		JButton btnCadastrarFornecedor = new JButton("Cadastrar Fornecedor");
		btnCadastrarFornecedor.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				
				TelaCadastraFornecedor p = new TelaCadastraFornecedor(padaria);
				p.main(null);
			}
		});
		btnCadastrarFornecedor.setBounds(10, 90, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnCadastrarFornecedor);
		
		JButton btnCadastrarFuncionrio = new JButton("Cadastrar Funcion\u00E1rio");
		btnCadastrarFuncionrio.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				TelaCadastraFuncionario p = new TelaCadastraFuncionario(padaria);
				p.main(null);
				
			}
		});
		btnCadastrarFuncionrio.setBounds(10, 124, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnCadastrarFuncionrio);
		
		JButton btnRemoverCliente = new JButton("Remover cliente");
		btnRemoverCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente que deseja remover do sistema. (N�o use caracteres especiais)");
				if(cpf == null)
					JOptionPane.showMessageDialog(null, "Opera��o cancelada");
				else if(padaria.descadastrarCliente(cpf)){
					JOptionPane.showMessageDialog(null, "Cliente descadastrado com suecsso");
				}
				else {
					JOptionPane.showMessageDialog(null, "CPF n�o encontrado no sistema");
				}
			}
		});
		btnRemoverCliente.setBounds(227, 56, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnRemoverCliente);
		
		JButton btnRemoverFornecedor = new JButton("Remover Fornecedor");
		btnRemoverFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cnpj = JOptionPane.showInputDialog("Digite o CNPJ do fornecedor que deseja remover do sistema. (N�o use caracteres especiais)");
				if(cnpj == null)
					JOptionPane.showMessageDialog(null, "Opera��o cancelada");
				else if(padaria.descadastrarFornecedores(cnpj)) {
					JOptionPane.showMessageDialog(null, "Fornecedor descadastrado com suecsso");
				}
				else
					JOptionPane.showMessageDialog(null, "CNPJ n�o encontrado no sistema");
			}
		});
		btnRemoverFornecedor.setBounds(227, 90, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnRemoverFornecedor);
		
		JButton btnRemoverFuncionrio = new JButton("Remover funcion\u00E1rio");
		btnRemoverFuncionrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = JOptionPane.showInputDialog("Digite o CPF do funcionario que deseja remover do sistema. (N�o use caracteres especiais)");
				if(cpf == null)
					JOptionPane.showMessageDialog(null, "Opera��o cancelada");
				else if(padaria.descadastrarFuncionarios(cpf)){
					JOptionPane.showMessageDialog(null, "Funcionario descadastrado com suecsso");
				}
				else {
					JOptionPane.showMessageDialog(null, "CPF n�o encontrado no sistema");
				}
			}
		});
		btnRemoverFuncionrio.setBounds(227, 124, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnRemoverFuncionrio);
	}
}