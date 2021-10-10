package com.lucascoruja;

import java.time.LocalDate;

public class Funcionario
{
    public int idFunc;
    public String nomeFunc;
    public String departamento;
    public LocalDate dataContratacao;
    public Double salario;
    public String documento;
    public Boolean ativo;

    public Funcionario() {

    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public void atualizarSalario(double aumento){
        if (aumento > 0.0)
            salario += aumento;
    }

    public void demiteFuncionario(){
        this.ativo = false;
    }

    public void imprimir()    {

        System.out.println("Nome do funcionario: " + nomeFunc +
                "\n Departamento: " + departamento +
                "\n Data da contratação: " + dataContratacao +
                "\n Salario: "+ salario +
                "\n Documento: " + documento +
                "\n Estado: " + ativo);
    }
}