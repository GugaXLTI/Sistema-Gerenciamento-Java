import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Tarefa> tarefas = new ArrayList<>();
		
		int op;
		int proximoId = 1;
		String usuario = "";
		String senha = "";
		String conta_usuario = "";
		String conta_senha = "";
		boolean conta_criada = false;
		boolean login = false;
		
		
		System.out.println("Escolha uma das opções abaixo: ");
		System.out.println("");
		
		do {
			
		
		
		System.out.println("[1] - Criar conta");
		System.out.println("[2] - Login");
		System.out.println("[3] - Adicionar tarefa");
		System.out.println("[4] - Listar todas as tarefas");
		System.out.println("[5] - Buscar tarefa");
		System.out.println("[6] - Marcar tarefa");
		System.out.println("[7] - Remover tarefa");
		System.out.println("[8] - Logout");
		System.out.println("[9] - Sair");
		op = sc.nextInt();
		sc.nextLine();
		
		switch(op) {
		
		case 1:
			
			if(conta_criada) {
				System.out.println("Conta já criada.");
			}
			else {
				System.out.println("Crie seu usuário: ");
				usuario = sc.nextLine();
				System.out.println("Crie sua senha: ");
				senha = sc.nextLine();
				conta_criada = true;
				System.out.println("");
				System.out.println("Conta criada com sucesso! ");
				System.out.println("");
			}
			break;
			
		case 2:
			
			if(!conta_criada) {
				System.out.println("Crie uma conta.");
			}
			else if(login) {
				System.out.println("Login já realizado.");
			}
			else {
				while(!login) {
					System.out.println("Digite seu usuário: ");
					conta_usuario = sc.nextLine();
					System.out.println("Digite sua senha: ");
					conta_senha = sc.nextLine();
					if(conta_senha.equals(senha) && conta_usuario.equals(usuario)) {
						login = true;
						System.out.println("");
						System.out.println("Login realizado com sucesso!");
						System.out.println("");
					}
				}
			}
			break;
			
		case 3:
			if(!conta_criada) {
				System.out.println("Crie uma conta.");
			}
			else if(!login) {
				System.out.println("Faça login para acessar.");
			}
			else {
				System.out.println("### ADICIONAR TAREFA ###");
				System.out.println("");
				
				Tarefa trf = new Tarefa();	
				trf.id = proximoId;
				proximoId++;
				
				System.out.println("Descrição: ");
				trf.descricao = sc.nextLine();
				System.out.println("Prioridade: (Baixa, média e alta)");
				trf.prioridade = sc.nextLine();
				trf.concluida = false;
				tarefas.add(trf);
				System.out.println("");
				System.out.println("Tarefa adicionado com sucesso! ID: " + trf.id);
				System.out.println("");
			}
			break;
			
		case 4:
			
			if(!conta_criada) {
				System.out.println("Crie uma conta.");
			}
			else if(!login) {
				System.out.println("Faça login para acessar.");
			}
			else {
				System.out.println("### LISTAR TAREFAS ###");
				System.out.println("");	
				
				if(tarefas.isEmpty()) {
					System.out.println("Lista está vazia.");
				}
				else {
					for(Tarefa n : tarefas) {
						System.out.println("ID tarefa: " + n.id);
						System.out.println("Descrição: " + n.descricao);
						System.out.println("Prioridade: " + n.prioridade);
						String status = n.concluida ? "Concluída" : "Pendente";
						System.out.println("Status: " + status);
						System.out.println("");
					}
				}			
			}
			break;
			
		case 5:
			
			if(!conta_criada) {
				System.out.println("Crie uma conta.");
			}
			else if(!login) {
				System.out.println("Faça login para acessar.");
			}
			else {
				System.out.println("### BUSCAR TAREFA ###");
				System.out.println("");
				
				System.out.println("Informe o ID da tarefa: ");
				int id_tarefa = sc.nextInt();
				boolean tarefa_encontrada = false;
				
				for(Tarefa n : tarefas) {
					if(id_tarefa == n.id) {
						tarefa_encontrada = true;
						System.out.println("");
						System.out.println("Tarefa encontrada!");
						System.out.println("");
						
						System.out.println("ID: " + n.id);
						System.out.println("Descrição: " + n.descricao);
						System.out.println("Prioridade: " + n.prioridade);
						String status = n.concluida ? "Concluída" : "Pendente";
						System.out.println("Status: " + status);
						System.out.println("");
					}
				}
				if(!tarefa_encontrada) {
					System.out.println("Tarefa não encontrada.");
					System.out.println("");
				}
			}
			break;
			
		case 6:
			if(!conta_criada) {
				System.out.println("Crie uma conta");
			}
			else if(!login) {
				System.out.println("Faça login para acessar.");
			}
			else {
				System.out.println("### MARCAR TAREFA ###");
				System.out.println("");
				
				System.out.println("Informe o ID da tarefa desejada: ");
				int concluir_tarefa = sc.nextInt();
				sc.nextLine();
				
				boolean tarefa_concluida = false;
				for(Tarefa n : tarefas) {
					if(concluir_tarefa == n.id) {
						n.concluida = true;
						System.out.println("");
						System.out.println("Tarefa ID: " + n.id + " marcada como concluida!");
						System.out.println("");
						tarefa_concluida = true;
						break;
					}
				}
				if(!tarefa_concluida) {
					System.out.println("Tarefa com ID: " + concluir_tarefa + " não encontrada.");
				}
			}
			break;
			
		case 7:
			
			if(!conta_criada) {
				System.out.println("Crie uma conta.");
			}
			else if(!login) {
				System.out.println("Faça login para acessar.");
			}
			else {
				System.out.println("### REMOVER TAREFA ###");
				System.out.println("");
				
				System.out.println("Digite o ID da tarefa: ");
				int remover_id = sc.nextInt();
				int posicao = -1;
				
				for(int i = 0; i < tarefas.size(); i++) {
					if(tarefas.get(i).id == remover_id) {
						posicao = i;
						break;
					}
				}
				if(posicao != -1) {
					tarefas.remove(posicao);
					System.out.println("Tarefa removida com sucesso!");
					System.out.println("");
				}
				else {
					System.out.println("ID: " + remover_id + " não encontrado." );
				}
			}
			break;
			
		case 8:
			
			if(!conta_criada) {
				System.out.println("Crie uma conta.");
			}
			else if(!login) {
				System.out.println("Faça login para acessar.");
			}
			else {
				login = false;
				System.out.println("Logout realizado com sucesso!");
			}
			break;
			
		case 9:
			System.out.println("Programa encerrado.");
			break;
			
		default:
			
			System.out.println("Opção inválida.");
			break;
	
		}
		
		}while(op != 9);
		
		sc.close();
	}
}