package org.Exercicio2;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;
    private static final Banco banco = new Banco();
    public Banco ()
    {
        clientes = new ArrayList<>();
    }
    public void adicionarCliente(Cliente novocliente)
    {
        clientes.add(novocliente);

    }
    public int getNumerodeClientes()
    {
        return this.clientes.size();
    }

    public ArrayList<Cliente> getClientes(String nome, String sobrenome)
    {
        ArrayList<Cliente> result = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome) && cliente.getSobrenome().equals(sobrenome)) {
                result.add(cliente);

            }

        }
        return result;

    }

    public static Banco getBanco() {
        return banco;
    }
}
