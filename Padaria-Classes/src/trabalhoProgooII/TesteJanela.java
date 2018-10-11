package trabalhoProgooII;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TesteJanela {

	private JFrame frmPadariaTrmBom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteJanela window = new TesteJanela();
					window.frmPadariaTrmBom.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TesteJanela() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//AQUI TEMOS QUE INICIAR OS 5 FUNCIONÁRIOS E OS 20 PRODUTOS INICIAIS
		
		EstoqueVendas estoque = new EstoqueVendas();
		
		Vendedor v1 = new Vendedor("Rafael", "Rua Recife", 5642.50f, "25462", 23f, 154f);
		
		FornecedorRecorrente fornecedor = new FornecedorRecorrente("Rede Globo", "Av. Projac", "3458468745/42", 1f);
		
		String[] apelido = new String[] {"Colherzão", "Colherzinha", "Colherão", "Colherzim", "Colherzom"};
		
		frmPadariaTrmBom = new JFrame();
		frmPadariaTrmBom.setTitle("Padaria Tr\u00EAm Bom S\u00F4");
		frmPadariaTrmBom.setBounds(100, 100, 450, 300);
		frmPadariaTrmBom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPadariaTrmBom.getContentPane().setLayout(null);
		
		JButton btnEstoque = new JButton("Gest\u00E3o de Estoque");
		btnEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean continuarPerguntas = true;
				
				int opProduto = JOptionPane.showConfirmDialog(null, "Deseja adicionar um produto?");
				if(opProduto == 0 && continuarPerguntas) {
					
					continuarPerguntas = false;
					boolean continuarCadastro = false;
					float precoCompra = 0, precoVenda;
					
					String nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
					
					while(!continuarCadastro) {
						try {
							precoCompra = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço de compra: "));
							continuarCadastro = true;
						}
						catch (Exception NumberFormatException) {
							JOptionPane.showMessageDialog(null, "Número inválido, tente novamente.");
						}
					}
					precoVenda = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço de venda: "));
					int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto: "));
					int quantidadeEstoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade inicial do estoque: "));
					
					if(estoque.cadastrarProduto(nome, fornecedor, precoCompra, precoVenda, apelido, codigo, quantidadeEstoque));
						JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
				}
				
				else if (opProduto == 2)
					continuarPerguntas = false;
				
				if (continuarPerguntas) {
					opProduto = JOptionPane.showConfirmDialog(null, "Deseja vender um produto");
					if(opProduto == 0) {
						String codigo = JOptionPane.showInputDialog("Qual o código do produto que você quer vender: ");
						if(estoque.venderProduto(Integer.parseInt(codigo), 11, 10, 2018, v1))
							JOptionPane.showMessageDialog(null, "Produto vendido!");
						else
							JOptionPane.showMessageDialog(null, "Produto não diponível no estoque!");
						continuarPerguntas = false;
						
					}
				}
				if (continuarPerguntas) {
					opProduto = JOptionPane.showConfirmDialog(null, "Deseja informações");
					if (opProduto == 0) {
						estoque.imprimeInformacoesProdutosVendidos();
					}
				}
				
			}
		});
		btnEstoque.setBounds(104, 11, 230, 23);
		frmPadariaTrmBom.getContentPane().add(btnEstoque);
		
		JButton btnInformacoes = new JButton("Gest\u00E3o de informa\u00E7\u00F5es");
		btnInformacoes.setBounds(104, 45, 230, 23);
		frmPadariaTrmBom.getContentPane().add(btnInformacoes);
		
		JButton btnImprimeInformacoes = new JButton("Produtos vendidos");
		btnImprimeInformacoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				estoque.imprimeInformacoesProdutosVendidos();
			
			}
		});
		btnImprimeInformacoes.setBounds(10, 227, 203, 23);
		frmPadariaTrmBom.getContentPane().add(btnImprimeInformacoes);
		
		JButton btnNewButton = new JButton("Produtos no estoque");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				estoque.imprimeInformacoesProdutosEstoque();
			}
		});
		btnNewButton.setBounds(223, 227, 201, 23);
		frmPadariaTrmBom.getContentPane().add(btnNewButton);
	}
}
