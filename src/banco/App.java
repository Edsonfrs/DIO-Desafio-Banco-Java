package banco;
public class App {
    public static void main(String[] args) throws Exception {

        Cliente manoel = new Cliente();
        manoel.setNome("Manoel");
        
        Conta cCorrente = new ContaCorrente(manoel);
        Conta cPoupanca = new ContaPoupanca(manoel);

        cCorrente.depositar(150);
        cPoupanca.depositar(180);
        cCorrente.depositar(560);

        
        cCorrente.depositar(296);

        cCorrente.transferir(106, cPoupanca);

        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();


    }
}
