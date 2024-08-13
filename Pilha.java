public class Pilha {
    private int capacidade;
    private int tamanho;
    private int[] pilha;

    public Pilha(int capacidade){
        this.pilha = new int[capacidade];
        this.capacidade = capacidade;
        this.tamanho = 0;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int[] getPilha() {
        return pilha;
    }

    public void setPilha(int[] pilha) {
        this.pilha = pilha;
    }


    public void inserir(int valor){
        if(this.tamanho < this.capacidade){
            pilha[tamanho] = valor;
            tamanho++;
        }
    }

    public void cheia(){
        if(this.tamanho == this.capacidade){
            System.out.println("A fila esta cheia");
        }
    }

    public void vazia(){
        if (this.tamanho == 0){
            System.out.println("A pilha esta vazia");
        }
    }

    public void remover(){
        if (this.tamanho == 0) {
        System.out.println("Pilha vazia");
        } 
        else {
        pilha[tamanho - 1] = 0;
        tamanho--;
        }
    }

    public void imprimir(int[] pilha){
        for(int i = 0; i < this.tamanho; i++){
            System.out.println(pilha[i]);
        }
    }
}