import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(7600));
        Compte compte = stub.getCompte(7600);
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
    }
}
