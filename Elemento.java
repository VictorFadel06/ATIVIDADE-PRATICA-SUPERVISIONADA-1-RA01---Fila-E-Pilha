// Classe de elemento genérico (pode representar solicitação ou cliente)
class Elemento {
    String id;
    String descricao;
    String dataHora;

    // Construtor para solicitações (pilha)
    Elemento(String id, String descricao, String dataHora) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
    }

    // Construtor para clientes (fila)
    Elemento(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
}
