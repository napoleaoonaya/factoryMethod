package factoryMethod;

public class EmissorEmail implements Emissor {
	
	public void envia(String mensagem){
		System.out.println("Enviando mensagem por E-mail ...");
		System.out.println(mensagem);
	}
}
