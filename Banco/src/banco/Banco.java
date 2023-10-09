
package banco;

import java.util.Scanner;
public class Banco {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        String[] dadosConta1 = myObj.nextLine().split(" ");
        int numeroConta1 = Integer.parseInt(dadosConta1[0]);
        int senhaConta1 = Integer.parseInt(dadosConta1[1]);
        String nomeClienteConta1 = dadosConta1[2];
        double saldoConta1 = Double.parseDouble(dadosConta1[3]);
        
        Conta conta1 = new Conta(numeroConta1, senhaConta1, nomeClienteConta1, saldoConta1);
        
        String[] dadosConta2 = myObj.nextLine().split(" ");
        int numeroConta2 = Integer.parseInt(dadosConta2[0]);
        int senhaConta2 = Integer.parseInt(dadosConta2[1]);
        String nomeClienteConta2 = dadosConta2[2];
        double saldoConta2 = Double.parseDouble(dadosConta2[3]);
        
        Conta conta2 = new Conta(numeroConta2, senhaConta2, nomeClienteConta2, saldoConta2);
        
        
        while(true){
            
            int opcao = myObj.nextInt();
            if(opcao == 1){
                int senhaVerificacao = myObj.nextInt();
                double saldo = conta1.getSaldo(senhaVerificacao);
                if(saldo >= 0){
                    System.out.printf("%.2f", saldo);
                }else{
                    System.out.println("senha incorreta");
                }
            }else if(opcao == 2){
                double valor_saque = myObj.nextDouble();
                int senhaVerificacao = myObj.nextInt();
                boolean saqueRealizado = conta1.sacar(valor_saque, senhaVerificacao);
                if(saqueRealizado){
                    System.out.println("saque realizado");
                }else{
                    System.out.println("saque não realizado");
                }
            }else if(opcao == 3){
                double valor_deposito = myObj.nextDouble();
                int senhaVerificacao = myObj.nextInt();
                boolean depositoRealizado = conta1.depositar(valor_deposito, senhaVerificacao);
                if(depositoRealizado){
                    System.out.println("depósito realizado");
                }else{
                    System.out.println("depósito não realizado");
                }
            }else if(opcao == 4){
                myObj.nextLine();
                String nomeTransferencia = myObj.nextLine();
                if(nomeTransferencia.equals(conta2.getNomeCliente())){
                    double valor_trans = myObj.nextDouble();
                    int senhaVerificacao = myObj.nextInt();
                    boolean transRealizada = conta1.tranferir(valor_trans, senhaVerificacao, conta2);
                    if(transRealizada){
                        System.out.println("transferência realizada");
                    }else{
                        System.out.println("transferência não realizada");
                    }
                    
                }else{
                    System.out.println("nenhum usuário encontrado");
                }
                
            }else{
                break;
            }
            
            
        
        }
        
    }
    
}
