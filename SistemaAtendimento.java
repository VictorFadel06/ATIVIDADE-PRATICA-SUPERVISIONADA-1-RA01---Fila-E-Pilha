// Programa principal

import java.util.Scanner;

public class SistemaAtendimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha historico = new Pilha();
        Fila fila = new Fila();

        
        historico.adicionar(new Elemento("REQ010", "Consulta técnica", "2024-08-20 15:00"));
        historico.adicionar(new Elemento("REQ009", "Restauração de dados", "2024-08-20 14:30"));
        historico.adicionar(new Elemento("REQ008", "Configuração de rede", "2024-08-20 14:00"));
        historico.adicionar(new Elemento("REQ007", "Reparo de impressora", "2024-08-20 13:30"));
        historico.adicionar(new Elemento("REQ006", "Consulta de garantia", "2024-08-20 13:00"));
        historico.adicionar(new Elemento("REQ005", "Troca de equipamento", "2024-08-20 12:30"));
        historico.adicionar(new Elemento("REQ004", "Suporte técnico", "2024-08-20 12:00"));
        historico.adicionar(new Elemento("REQ003", "Atualização de sistema", "2024-08-20 11:30"));
        historico.adicionar(new Elemento("REQ002", "Manutenção preventiva", "2024-08-20 11:00"));
        historico.adicionar(new Elemento("REQ001", "Instalação de software", "2024-08-20 10:30"));

        
        fila.adicionar(new Elemento("CLI001", "Dúvida sobre produto"));
        fila.adicionar(new Elemento("CLI002", "Reclamação de serviço"));
        fila.adicionar(new Elemento("CLI003", "Solicitação de reembolso"));
        fila.adicionar(new Elemento("CLI004", "Informações de entrega"));
        fila.adicionar(new Elemento("CLI005", "Agendamento de visita"));
        fila.adicionar(new Elemento("CLI006", "Alteração de pedido"));
        fila.adicionar(new Elemento("CLI007", "Cancelamento de contrato"));
        fila.adicionar(new Elemento("CLI008", "Renovação de assinatura"));
        fila.adicionar(new Elemento("CLI009", "Suporte para instalação"));
        fila.adicionar(new Elemento("CLI010", "Pedido de orçamento"));

        int opcao = 0;

        while (opcao != 7) {
            System.out.println("\n====== MENU ======");
            System.out.println("1 - Adicionar Solicitação ao Histórico");
            System.out.println("2 - Remover Solicitação do Histórico");
            System.out.println("3 - Mostrar Histórico");
            System.out.println("4 - Adicionar Cliente à Fila");
            System.out.println("5 - Atender Cliente");
            System.out.println("6 - Mostrar Fila");
            System.out.println("7 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());
                switch (opcao) {
                    case 1:
                        System.out.print("ID: ");
                        String idS = sc.nextLine();
                        System.out.print("Descrição: ");
                        String descS = sc.nextLine();
                        System.out.print("Data/Hora: ");
                        String data = sc.nextLine();
                        historico.adicionar(new Elemento(idS, descS, data));
                        System.out.println("Solicitação adicionada!");
                        break;
                    case 2:
                        Elemento removido = historico.remover();
                        System.out.println("Removido: " + removido.id + " - " + removido.descricao);
                        break;
                    case 3:
                        historico.mostrar();
                        break;
                    case 4:
                        System.out.print("Nome do Cliente: ");
                        String nome = sc.nextLine();
                        System.out.print("Motivo do Atendimento: ");
                        String motivo = sc.nextLine();
                        fila.adicionar(new Elemento(nome, motivo));
                        System.out.println("Cliente adicionado à fila!");
                        break;
                    case 5:
                        Elemento atendido = fila.atender();
                        System.out.println("Atendido: " + atendido.id + " - " + atendido.descricao);
                        break;
                    case 6:
                        fila.mostrar();
                        break;
                    case 7:
                        System.out.println("Encerrando o sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        sc.close();
    }
}