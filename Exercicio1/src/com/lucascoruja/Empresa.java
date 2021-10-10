package com.lucascoruja;

import java.util.ArrayList;
import java.util.List;

public class Empresa{

    public int idEmpresa;
    public String razaoSocial;
    public int cnpj;
    public List<Funcionario> empregados;

    public Empresa() {
        empregados=new ArrayList<Funcionario>();
    }


    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }


    public void adicionarEmpregados(Funcionario f) {
        empregados.add(f);
    }

    public void mostrarEmpregados() {
        for (Funcionario f : empregados) {
            f.imprimir();
        }
    }

    public boolean contemFuncionario(int idFunc) {
        for (Funcionario f : empregados) {
            if (f.getIdFunc()==idFunc)
                return true;
        }
        return false;
    }

    public void inativarFuncionario(int idFunc) {
        for (Funcionario f : empregados) {
            if (f.getIdFunc()==idFunc && f.getAtivo())
                f.setAtivo(false);
        }
    }

    public void mostrarFuncionariosAtivos() {
        int count = 0;
        for (Funcionario f : empregados) {
            if (f.getAtivo()) {
                f.imprimir();
                count++;
            }
        }
        System.out.println("Numero de funcionarios ativos: " + count);
    }

    public void atualizaSalarioFuncionario(int idFunc, double aumento) {
        for (Funcionario f : empregados) {
            if (f.getIdFunc()==idFunc)
                f.atualizarSalario(aumento);
        }
    }
}
