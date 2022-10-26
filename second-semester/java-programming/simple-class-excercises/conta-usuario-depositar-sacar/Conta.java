public class Conta {
      private int numero;
      private double saldo;
      public Conta(){
      
      }

      public Conta(int numero){
            this.numero = numero;
      }

      public Conta(int numero, double saldo){
            this.numero = numero;
            this.saldo = saldo;
      }

      public int getNumero() {
            return numero;
      }
      public void setNumero(int numero) {
            this.numero = numero;
      }
      public double getSaldo() {
            return saldo;
      }

      public void retirar(double quantia) {
            if(quantia > saldo) {
                  System.out.printf("Quantia insuficiente!\n");
                  return;
            }

            saldo = saldo - quantia;
      }

      public void depositar(double valor){
            saldo = saldo + valor;
      }
      public void transferir(double valor, Conta destino){
            if(saldo>=valor){
                   saldo = saldo - valor;
                   destino.depositar(valor);
            }else System.out.printf("Valor indisponível!\n");
      }

}