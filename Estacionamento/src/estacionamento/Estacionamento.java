
package estacionamento;

import javax.swing.JOptionPane;

public class Estacionamento {

    public static void main(String[] args) {
       DadosEstacionamento dados = new DadosEstacionamento();
       
       dados.setModeloCarro(JOptionPane.showInputDialog("Digite o modelo: "));
       dados.setPlaca(JOptionPane.showInputDialog("Digite a  placa: "));
       dados.setHora_entrada(Double.parseDouble(JOptionPane.showInputDialog("Hora da entrada: ")));
       dados.setMinuto_entrada(Double.parseDouble(JOptionPane.showInputDialog("Minuto da saída: ")));
       dados.setHora_saida(Double.parseDouble(JOptionPane.showInputDialog("Hora da entrada: ")));
       dados.setMinuto_saida(Double.parseDouble(JOptionPane.showInputDialog("Minuto da saída: ")));
       dados.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço por hora: ")));
       
      dados.conversao(dados.getHora_entrada(), dados.getHora_saida(),dados.getMinuto_entrada(), dados.getMinuto_saida());
      
       
       JOptionPane.showMessageDialog(null,"*************COMPROVANTE*************\n\n Modelo do carro: "
               + dados.getModeloCarro()
               + "\nPlaca: "
               + dados.getPlaca()
               + "\n Valor cobrado por hora: $"
               + dados.getPreco() 
               +"\n Hora da entrada: "
               + dados.getHora_entrada()
               +" h \n minuto da entrada: "
               +dados.getMinuto_entrada()
               +" min \n Hora da saída: "
               + dados.getHora_saida()
               +" h \n minuto da saida: "
               +dados.getMinuto_saida()
               +" min \n \n Total a pagar: $"
               + dados.totalValor(dados.getPreco(), dados.getTempo())
               + "\n\n *************VOLTE SEMPRE*************");
    }

    
    
}
