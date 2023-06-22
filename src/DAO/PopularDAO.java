package DAO;

import domain.Popular;

public class PopularDAO extends GenericDAO<Popular> {

    public PopularDAO() {
        super();
    }

    @Override
    public Class<Popular> getClassType() {
        return Popular.class;
    }

    @Override
    public void atualizarDados(Popular antigo, Popular novo) {
        antigo.setAno(novo.getAno());
        antigo.setCor(novo.getCor());
        antigo.setPlaca(novo.getPlaca());
    }
    
}
