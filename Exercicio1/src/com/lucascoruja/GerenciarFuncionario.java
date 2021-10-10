package com.lucascoruja;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarFuncionario {
    public static void main(String[] args) {
        int controlMenu=0;
        int idEmpresa;
        int idFuncionario;
        boolean erro = true;
        Scanner scan = new Scanner(System.in);
        List<Empresa> empresas = new ArrayList<Empresa>();
        Funcionario funcionario = new Funcionario();
        while(controlMenu!=9) {

            System.out.println("MENU PROGRAMA EMPRESAS - FUNCIONARIOS \n"
                    + "\n"
                    + "1 - Cadastrar Funcionario \n"
                    +"2 - Cadastrar Empresa \n"
                    + "3 - Atualizar Salario \n"
                    + "4 - Demitir Funcionario \n"
                    + "5 - Listar Funcionarios -  Uma Empresa \n"
                    + "6 - Listar Funcionarios -  Todas as Empresas \n"
                    + "7 - Adicionar Funcionario a uma Empresa \n"
                    + "8 - Verificar existencia de Funcionario \n"
                    + "9 - SAIR \n");

            controlMenu=scan.nextInt();

            switch (controlMenu) {
                case 1:

                    System.out.println("----------------------CADASTRO DE FUNCIONARIO ----------------------");
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

                    System.out.println("--------------------------------------------");
                    break;
                case 2:
                    System.out.println("----------------------CADASTRO DE EMPRESA ----------------------");
                    Empresa empresa = new Empresa();
                    System.out.println("Id da Empresa: ");
                    empresa.setIdEmpresa(scan.nextInt());

                    scan.nextLine();

                    System.out.println("Razao Social: ");
                    empresa.setRazaoSocial(scan.nextLine());

                    System.out.println("CNPJ: ");
                    empresa.setCnpj(scan.nextInt());
                    empresas.add(empresa);

                    System.out.println("--------------------------------------------");
                    break;
                case 3:

                    System.out.println("----------------------ATUALIZAR SALARIO ----------------------");
                    System.out.println("Qual o Id da Empresa ? ");
                    idEmpresa=scan.nextInt();
                    for(Empresa e : empresas){
                        if (e.getIdEmpresa()==idEmpresa){
                            erro = false;
                            System.out.println("Qual o Id do Funcionario? ");
                            idFuncionario=scan.nextInt();
                            if (e.contemFuncionario(idFuncionario)){
                                System.out.println("Qual o salario novo do Funcionario? ");
                                double salario=scan.nextDouble();
                                e.atualizaSalarioFuncionario(idFuncionario,salario);
                            }else {
                                System.out.println("Funcionario não encontrado na Empresa " + idEmpresa);
                            }
                            break;
                        }
                    }

                    if(erro) {
                        System.out.println("Empresa não encontrada");
                    }

                    System.out.println("--------------------------------------------");
                    break;
                case 4:

                    System.out.println("----------------------DEMITIR FUNCIONARIO ----------------------");
                    System.out.println("Qual o Id da Empresa ? ");
                    idEmpresa=scan.nextInt();
                    for(Empresa e : empresas){
                        if (e.getIdEmpresa()==idEmpresa){
                            erro = false;
                            System.out.println("Qual o Id do Funcionario? ");
                            idFuncionario=scan.nextInt();
                            if (e.contemFuncionario(idFuncionario)){
                                e.inativarFuncionario(idFuncionario);
                            }
                            break;
                        }
                    }

                    if(erro) {
                        System.out.println("Empresa não encontrada");
                    }

                    System.out.println("--------------------------------------------");
                    break;
                case 5:

                    System.out.println("----------------------FUNCIONARIOS DA EMPRESA ----------------------");
                    System.out.println("Qual o Id da Empresa ? ");
                    idEmpresa=scan.nextInt();
                    for(Empresa e : empresas){
                        if (e.getIdEmpresa()==idEmpresa){
                            erro = false;
                            e.mostrarEmpregados();
                            break;
                        }
                    }

                    if(erro)
                        System.out.println("Empresa não encontrada");
                    System.out.println("--------------------------------------------");
                    break;
                case 6:

                    System.out.println("----------------------FUNCIONARIOS DE TODAS EMPRESAS ----------------------");

                    if(empresas.size() == 0) {
                        System.out.println("Nenhuma empresa cadastrada");
                    }
                    for(Empresa e : empresas){
                        e.mostrarEmpregados();
                    }

                    System.out.println("--------------------------------------------");
                    break;
                case 7:

                    System.out.println("----------------------ADICIONAR FUNCIONARIO A EMPRESA ----------------------");
                    System.out.println("Qual o Id da Empresa que quer adicionar o ultimo funcionario cadastrado ? ");
                    idEmpresa=scan.nextInt();
                    for(Empresa e : empresas){
                        if (e.getIdEmpresa()==idEmpresa){
                            erro = false;
                            e.adicionarEmpregados(funcionario);
                            break;
                        }
                    }

                    if(erro) {
                        System.out.println("Empresa não encontrada");
                    }

                    System.out.println("--------------------------------------------");
                    break;
                case 8:

                    System.out.println("----------------------VERIFICAR SE FUNCIONAR EXISTE ----------------------");
                    System.out.println("Qual o Id da Empresa? ");
                    idEmpresa=scan.nextInt();
                    for(Empresa e : empresas){
                        if (e.getIdEmpresa()==idEmpresa){
                            erro = false;
                            System.out.println("Qual o Id do Funcionario? ");
                            idFuncionario=scan.nextInt();
                            if (e.contemFuncionario(idFuncionario)){
                                System.out.println("Funcionario pertence a empresa");
                            } else {
                                System.out.println("Funcionario nao pertence a empresa");
                            }
                            break;
                        }
                    }

                    if(erro) {
                        System.out.println("Empresa não encontrada");
                    }

                    System.out.println("--------------------------------------------");
                    break;
                case 9:
                    System.out.println("FINALIZANDO PROGRAMA");
                    System.out.println("--------------------------------------------");

                    break;
                default:
                    System.out.println("Favor digitar um comando entre 1 e 9");
                    break;
            }
        }
    }
}
