package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.sql.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double conversion (@WebParam(name = "montant") double mt ){
        return mt*10.54;
    }
    @WebMethod
    public Compte getCompte (@WebParam(name = "code")int code) {
        return new Compte (code, Math.random()*9888,new Date(System.currentTimeMillis()));
    }
    @WebMethod
    public List<Compte> ListComptes(){
        return List.of(
                new Compte (  1,  Math.random()*9888, new Date(System.currentTimeMillis())),
                new Compte ( 2,  Math.random()*9888, new Date(System.currentTimeMillis())),
                new Compte ( 3,  Math.random()*9888, new Date(System.currentTimeMillis()))
        );
    }
}
