package AtvConta;

public class ContaMain {

	public static void main(String[] args) {
		
//		Conta c = new Conta("Banco do Brasil", 123, 321, 0);
//		
//		if (c.deposito(1000)) {
//			System.out.println("Depósito OK");
//		}
//		System.out.println(c.deposito(-100));
//		
//		c.saque(100);
//		c.saque(901);
//		
//		System.out.println(c);
		
		
//		ContaSimples cs = new ContaSimples("Caixa", 456, 654, 100);
//		System.out.println(cs.depositoPoupanca(40000));
//		System.out.println(cs.saquePoupanca(30000));
//		System.out.println(cs.saquePoupanca(30000));
//		System.out.println(cs.saque(100));
//		System.out.println(cs);
		
		
		ContaEspecial ce = new ContaEspecial("Bradesco", 999, 888, 1500, 10, 1000);

		System.out.println(ce.saque(1500));
		System.out.println(ce.saque(100));
		System.out.println(ce.saque(400));
		System.out.println(ce.deposito(700));
		System.out.println(ce.saque(1000));
		System.out.println(ce.saque(200));
		System.out.println(ce.saque(10));
		System.out.println(ce);
		
	}

}