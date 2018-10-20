package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controle.Padaria;
import pessoa.funcionario.Funcionario;
import pessoa.funcionario.Padeiro;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TelaPrincipal{
	

	private JFrame frmPadariaTremBo;
	private static Padaria padaria;
	private Padeiro padeiros;

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
	 * @param <funcionarios>
	 */
	private <funcionarios> void initialize() {
		
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
		btnVenderProduto.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				TelaVendeProduto p = new TelaVendeProduto(padaria);
				p.main(null);
			}
		});
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
		btnImprimirInformaes.setBounds(25, 198, 383, 52);
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
				String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente que deseja remover do sistema. (Não use caracteres especiais)");
				if(cpf == null)
					JOptionPane.showMessageDialog(null, "Operação cancelada");
				else if(padaria.descadastrarCliente(cpf)){
					JOptionPane.showMessageDialog(null, "Cliente descadastrado com suecsso");
				}
				else {
					JOptionPane.showMessageDialog(null, "CPF não encontrado no sistema");
				}
			}
		});
		btnRemoverCliente.setBounds(227, 56, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnRemoverCliente);
		
		JButton btnRemoverFornecedor = new JButton("Remover Fornecedor");
		btnRemoverFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = JOptionPane.showInputDialog("Digite o código do fornecedor que deseja remover do sistema.");
				if(codigo == null)
					JOptionPane.showMessageDialog(null, "Operação cancelada");
				else if(padaria.descadastrarFornecedor(codigo)) {
					JOptionPane.showMessageDialog(null, "Fornecedor descadastrado com suecsso");
				}
				else
					JOptionPane.showMessageDialog(null, "Código não encontrado no sistema");
			}
		});
		btnRemoverFornecedor.setBounds(227, 90, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnRemoverFornecedor);
		
		JButton btnRemoverFuncionrio = new JButton("Remover funcion\u00E1rio");
		btnRemoverFuncionrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codigo = JOptionPane.showInputDialog("Digite o código do funcionário que deseja remover do sistema.");
				if(codigo == null)
					JOptionPane.showMessageDialog(null, "Operação cancelada");
				else if(padaria.descadastrarFuncionario(codigo)){
					JOptionPane.showMessageDialog(null, "Funcionario descadastrado com suecsso");
				}
				else {
					JOptionPane.showMessageDialog(null, "Código não encontrado no sistema");
				}
			}
		});
		btnRemoverFuncionrio.setBounds(227, 124, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnRemoverFuncionrio);
		
		JButton btnHoraExtraPadeiro = new JButton("Adicional noturno (Padeiros)");
		btnHoraExtraPadeiro.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnHoraExtraPadeiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String codigo = "";
				boolean codigoValido = false;
				try {
					codigo = JOptionPane.showInputDialog("Digite o código do padeiro");
					if(padaria.encontraFuncionario(codigo) != null)
						codigoValido = true;					
				}
				catch (Exception NullPointerException) {
					JOptionPane.showMessageDialog(null, "Código invalido");
				}		
				try {
					if(codigoValido) {
						String horasTrabalhadas = JOptionPane.showInputDialog("Digite quantas horas extras o padeiro trabalhou");
						Padeiro padeiro = (Padeiro) padaria.encontraFuncionario(codigo);
						padeiro.setHorasTrabalhadas(160 + Integer.parseInt(horasTrabalhadas));
						padeiro.calcularSalarioFinal();
					}
				}
				catch (Exception NumberFormatException) {
					JOptionPane.showMessageDialog(null, "Número inválido");
				}
			}
		});
		btnHoraExtraPadeiro.setBounds(10, 158, 197, 23);
		frmPadariaTremBo.getContentPane().add(btnHoraExtraPadeiro);
	}
}
