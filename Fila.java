

class Fila {
    private Node frente = null;
    private Node tras = null;

    public boolean estaVazia() {
        return frente == null;
    }

    public void adicionar(Elemento e) {
        Node novo = new Node(e);
        if (estaVazia()) {
            frente = novo;
            tras = novo;
        } else {
            tras.proximo = novo;
            tras = novo;
        }
    }

    public Elemento atender() throws Exception {
        if (estaVazia()) throw new Exception("Fila vazia!");
        Elemento atendido = frente.dado;
        frente = frente.proximo;
        if (frente == null) tras = null;
        return atendido;
    }

    public void mostrar() {
        if (estaVazia()) {
            System.out.println("Nenhum cliente aguardando.");
            return;
        }
        System.out.println("\n--- Fila de Atendimento ---");
        Node atual = frente;
        while (atual != null) {
            System.out.println("ID: " + atual.dado.id +
                               " | Motivo: " + atual.dado.descricao);
            atual = atual.proximo;
        }
    }
}