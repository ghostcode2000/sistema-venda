import java.math.BigDecimal;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Módulo orientação a objetos");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Modulo de Spring Boot API REST");
		produto2.setValor(BigDecimal.valueOf(300));

		
		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Modulo Angular 8");
		produto3.setValor(BigDecimal.valueOf(197));

		Produto produto4 = new Produto();
		produto4.setId(4L);
		produto4.setNome("Modulo Angular 8");
		produto4.setValor(BigDecimal.valueOf(250));
		Venda venda = new Venda();
		
		venda.setDescricaoVenda("Venda Curso Formação Java");
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		venda.setId(10L);
		venda.setNomeCliente("Natã Moreira");
		//venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		venda.getListProdutos().add(produto1);
		venda.getListProdutos().add(produto2);/*Não consigo fazer validações*/
		venda.addProduto(produto3);/*Posso fazer validações antes de adicionar na lista*/
		venda.addProduto(produto4);
	
		
		System.out.println("Valor da variável total Venda: " + venda.getValorTotal());
	}

}
