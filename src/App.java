import DAO.*;
import domain.*;

public class App {
    public static void main(String[] args) {
        IGernericDAO<Popular> iPopularDAO = new PopularDAO();
        IGernericDAO<Luxo> iLuxoDAO = new LuxoDAO();
        
        Popular fusca = new Fusca();
        fusca.setPlaca("AME6709");
        fusca.setCor("Rosa");
        fusca.setAno(1997);

        Popular civic = new Civic();
        civic.setPlaca("XPE2312");
        civic.setCor("Prata");
        civic.setAno(1999);
        
        Luxo impreza = new Subaru(); 
        impreza.setPlaca("GJK3125");
        impreza.setCor("Azul");
        impreza.setAno(2008);

        iPopularDAO.cadastrar(civic);
        iPopularDAO.cadastrar(fusca);
        iLuxoDAO.cadastrar(impreza);

        Popular consultadoP = iPopularDAO.consultar("XPE2312");
        System.out.println(consultadoP.toString());
        Luxo consultadoL = iLuxoDAO.consultar("GJK3125");
        System.out.println(consultadoL.toString());

    }
}
