
package estacionamento;

public class DadosEstacionamento {
    
     public String modeloCarro;
     public String placa;
     public double preco;
     public double hora_entrada;
     public double minuto_entrada;
     public double hora_saida;
     public double minuto_saida;
     public double total;
    public double tempo;
   


   
    
      public double totalValor(double preco, double tempo){
         this.total = this.tempo * this.preco;
         setTotal(this.total);
        return this.total;
        
    }
    
    public double conversao(double hora_entrada, double hora_saida, double minuto_entrada, double minuto_saida){
       double conversao_entrada = hora_entrada+ minuto_entrada/60;
       double conversao_saida = hora_saida+ minuto_saida/60;
       this.tempo = Math.ceil(conversao_saida-conversao_entrada);
        setTempo(this.tempo);
        return this.tempo;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
      
    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
     
    

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getHora_entrada() {
        return hora_entrada;}

    public void setHora_entrada(double hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public double getMinuto_entrada() {
        return minuto_entrada;
    }

    public void setMinuto_entrada(double minuto_entrada) {
        this.minuto_entrada = minuto_entrada;
    }

    public double getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(double hora_saida) {
        this.hora_saida = hora_saida;
    }

    public double getMinuto_saida() {
        return minuto_saida;
    }

    public void setMinuto_saida(double minuto_saida) {
        this.minuto_saida = minuto_saida;
    }

    



    

    
    
    
}
