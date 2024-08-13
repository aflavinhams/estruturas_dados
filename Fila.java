public class Fila {

    private int[] fila;
    private int primeiro;
    private int ultimo;
    private int valor;
    private int tamanho; 
    private int capacidade;

    public Fila(int capacidade){
        this.fila = new int[capacidade];
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.primeiro = -1;
        this.ultimo = -1;
    }
    public int[] getFila() {
        return fila;
    }

    public void setFila(int[] fila) {
        this.fila = fila;
    }

    public int getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(int primeiro) {
        this.primeiro = primeiro;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void inserir(int valor){

        if(this.tamanho < this.capacidade){
            fila[tamanho] = valor;
            if(this.primeiro == -1){
                this.primeiro = 0;
            }
            this.ultimo = tamanho;
            tamanho++;
        }
        else{
            System.out.println("A fila ta cheia.");
        }
    }

    public void remover(){
        if(this.tamanho > 0){
            for(int i = 0; i < this.tamanho - 1; i++){
                fila[i] = fila[i+1];
            }
            fila[this.tamanho - 1] = 0; // Limpa o último elemento
            tamanho--;
            if(tamanho == 0){
                this.primeiro = -1;
                this.ultimo = -1;
            } else {
                this.ultimo = tamanho - 1;
            }
        } else {
            System.out.println("A fila está vazia.");
        }
    }

    public void imprimir(int[] fila){
        for(int i = 0; i < this.tamanho; i++){
            System.out.println(fila[i]);
        }
    }

    public void cheia(){
        if(this.tamanho == this.capacidade){
            System.out.println("A fila esta cheia");
        }
    }

    public void vazia(){
        if(this.tamanho == 0){
            System.out.println("A fila esta vazia");
        }
    }

}