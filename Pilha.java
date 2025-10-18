// Implementação da Pilha (Histórico)
class Pilha {
    private Node topo = null;

    public boolean estaVazia() {
        return topo == null;
    }

    public void adicionar(Elemento e) {
        Node novo = new Node(e);
        novo.proximo = topo;
        topo = novo;
    }

    public Elemento remover() throws Exception {
        if (estaVazia()) throw new Exception("Pilha vazia!");
        Elemento removido = topo.dado;
        topo = topo.proximo;
        return removido;
    }

    public void mostrar() {
        if (estaVazia()) {
            System.out.println("Histórico vazio.");
            return;
        }
        System.out.println("\n--- Histórico de Solicitações ---");
        Node atual = topo;
        while (atual != null) {
            System.out.println("ID: " + atual.dado.id +
                               " | Descrição: " + atual.dado.descricao +
                               " | Data/Hora: " + atual.dado.dataHora);
            atual = atual.proximo;
        }
    }
}