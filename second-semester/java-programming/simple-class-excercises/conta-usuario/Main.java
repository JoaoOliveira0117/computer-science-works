public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Conta conta2 = new Conta(123456, 55.00);
        Conta conta3 = new Conta(789101, 894.95);
        
        System.out.println(conta.getSaldo());
        System.out.println(conta.getNumero());
        System.out.println(conta2.getSaldo());
        System.out.println(conta2.getNumero());
        System.out.println(conta3.getSaldo());
        System.out.println(conta3.getNumero());
    }
}
