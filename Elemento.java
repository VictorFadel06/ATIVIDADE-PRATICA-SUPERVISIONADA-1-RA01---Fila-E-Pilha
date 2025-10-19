
class Elemento {
    String id;
    String descricao;
    String dataHora;

    
    Elemento(String id, String descricao, String dataHora) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
    }

    
    Elemento(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
}
