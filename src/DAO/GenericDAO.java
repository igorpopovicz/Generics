package DAO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import domain.Carro;

public abstract class GenericDAO<T extends Carro> implements IGernericDAO<T> {

    protected Map<Class, Map<String, T>> map;

    public GenericDAO() {
        if (this.map == null) {
            this.map = new HashMap<>();
            Map<String, T> mapaInterno = this.map.get(getClassType());
            if(mapaInterno == null) {
                mapaInterno = new HashMap<>();
                this.map.put(getClassType(), mapaInterno);
            }
        }
    }

    public abstract Class<T> getClassType();
    public abstract void atualizarDados(T antigo, T novo);

    @Override
    public Boolean cadastrar(T entity) {
        Map<String, T> mapInterno = this.map.get(getClassType());
        
        if (mapInterno.containsKey(entity.getPlaca())) { return false; }
        
        mapInterno.put(entity.getPlaca(), entity);
        return true;
    }

    @Override
    public void excluir(String value) {
        Map<String, T> mapInterno = this.map.get(getClassType());
        T objetoCadastrado = mapInterno.get(value);
        
        if (objetoCadastrado != null) { 
            mapInterno.remove(value, objetoCadastrado);
        }
        return;
    }

    @Override
    public void alterar(T entity) {
        Map<String, T> mapInterno = this.map.get(getClassType());
        T objetoCadastrado = mapInterno.get(entity.getPlaca());
        if (objetoCadastrado != null) {
            atualizarDados(objetoCadastrado, entity);
        }
    }

    @Override
    public T consultar(String value) {
        Map<String, T> mapInterno = this.map.get(getClassType());
        return mapInterno.get(value); 
    }

    @Override
    public Collection<T> buscarTodos() {
        Map<String, T> mapInterno = this.map.get(getClassType());
        return mapInterno.values();
    }
    
}
