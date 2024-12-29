import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
       Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: 
            System.out.println(e.getMessage());
		}
		
        terminal.close();
		
		
	}


	public class ParametrosInvalidosException extends Exception{
		public ParametrosInvalidosException(String message){
			super(message);
		}
	}


	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
        	System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
		//realizar o for para imprimir os números com base na variável contagem
		
	    for(int i = parametroUm; i <= parametroDois; i++){
            System.out.println(i);
        }
    }
    }

