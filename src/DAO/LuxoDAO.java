package DAO;

import domain.Luxo;

public class LuxoDAO extends GenericDAO<Luxo> {

    public LuxoDAO() {
        super();
    }

    @Override
    public Class<Luxo> getClassType() {
        return Luxo.class;
    }

    @Override
    public void atualizarDados(Luxo antigo, Luxo novo) {
        antigo.setAno(novo.getAno());
        antigo.setCor(novo.getCor());
        antigo.setPlaca(novo.getPlaca());
    }
    
}