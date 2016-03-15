package factoryMethod;

public class EmissorSMS implements Emissor{
	
	public void envia(String mensagem){
		System.out.println("Enviando mensagem por SMS ...");
		System.out.println(mensagem);
	}

}
