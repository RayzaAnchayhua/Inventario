package local;

public class Produto {

	// Declaração de campo de instância
	private String nomeProduto;
	private double preco;
	private double saldo;
	private int id;
	
	// Construtor padrão
	// Inicializa os campos (atributos) da classe
	public Produto() {
		this.nomeProduto = "";
		this.preco = 0.00;
		this.saldo = 0.00;
		this.id = 0;
	}
	
	// Construtor para ser utilizado com todos os 
	// campos no momento de instanciar o objeto.
	public Produto(String nomeProduto, 
				   double preco, 
				   double saldo, 
				   int id) {
		
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.saldo = saldo;
		this.id = id;
		
	}
	
	// Getter nomeProduto
	public String getNomeProduto() {
		return this.nomeProduto;
	}
	
	// Setter nomeProduto
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	// Getter preco
	public double getPreco() {
		return this.preco;
	}
	// Setter preco
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// Getter Saldo
	public double getSaldo() {
		return this.saldo;
	}
	// Setter Saldo
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// Get id
	public int getId() {
		return this.id;
	}
	// Setter id
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		
		String auxiliar = "";
		auxiliar =  "Numero do Item: " + this.getId() + "\n";
		auxiliar += "Nome          : " + this.getNomeProduto() + "\n";
		auxiliar += "Saldo Estoque : " + this.getSaldo() + "\n";
		auxiliar += "Preco Unit    : " + this.getPreco() + "\n";
		return auxiliar;
		
	}
	
}
