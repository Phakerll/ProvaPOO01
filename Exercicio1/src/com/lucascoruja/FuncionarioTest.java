package com.lucascoruja;

import java.time.LocalDate;
import java.util.Scanner;

public class FuncionarioTest {

    public static void main(String[] args)
    {
        Funcionario funcionario = new Funcionario();
        Scanner scan = new Scanner(System.in);

        System.out.println("Id do funcionario: ");
        funcionario.setIdFunc(scan.nextInt());

        scan.nextLine();

        System.out.println("Nome do funcionario: ");
        funcionario.setNomeFunc(scan.nextLine());

        System.out.println("Departamento: ");
        funcionario.setDepartamento(scan.nextLine());

        LocalDate hoje = LocalDate.now();
        System.out.println("Data de contratacao: " + hoje);
        funcionario.setDataContratacao(hoje);


        System.out.println("Salario: ");
        funcionario.setSalario(scan.nextDouble());

        scan.nextLine();

        System.out.println("Documento: ");
        funcionario.setDocumento(scan.nextLine());

        System.out.println("Estado: ");
        funcionario.setAtivo(scan.nextBoolean());

        System.out.println("Funcionario cadastrado");
        funcionario.setAtivo(true);

        System.out.println("Aumento salarial: ");
        funcionario.atualizarSalario(scan.nextDouble());

        funcionario.imprimir();

        funcionario.demiteFuncionario();
    }
}