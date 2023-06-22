package DAO;

import java.util.Collection;

import domain.Carro;

public interface IGernericDAO <T extends Carro> {
    public Boolean cadastrar(T entity);
    public void excluir(String value);
    public void alterar(T entity);
    public T consultar(String value);
    public Collection<T> buscarTodos();
}
