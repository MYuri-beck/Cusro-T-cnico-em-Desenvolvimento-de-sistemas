package com.mycompany.valida_senha;

import java.util.Scanner;

public class Valida_senha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //decalração do scanner

        //declaração das variaveis que servem como criterio de verificação
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean symbol = false;
        boolean number = false;

        //solicitação de input
        System.out.println("""
                           Insira uma senha que contenha 
                           pelo menos 8 caracteres 
                           pelo menos 1 letra maiuscula 
                           pelo menos 1 letra minuscula 
                           pelo menos um caractere especial: """);

        String password = scan.nextLine();

        // verifica se a senha tem 8+ caracteres, caso não envia mensagem e encerra o programa
        if (password.length() < 8) {
            System.out.println("A senha deve ter pelo menos 8 caracteres");
            return;
        }

        //for each (for in) ---- senha.toCharArray(), esta convertando minha string senha em char []
        
        /*Usando como base para verificação os valores da tabela ASCII,
        é um padrão de codificação que associa um número único a cada caractere, 
        permitindo que computadores e outros dispositivos eletrônicos troquem informações de texto*/
        for (char c : password.toCharArray()) {
            if (c >= 65 && c <= 90) {
                upperCase = true;
            } else if (c >= 97 && c <= 122) {
                lowerCase = true;
            } else if (c >= 48 && c <= 57) {
                number = true;
            } else if ((c >= 33 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 && c <= 126)){
                symbol = true;
            }
        } if (upperCase && lowerCase && number && symbol){
            System.out.println("Senha aprovada");
        }else {
             if (!upperCase) {
                System.out.println("- Deve conter pelo menos uma letra MAIÚSCULA.");
            } 
            if (!lowerCase) {
                System.out.println("- Deve conter pelo menos uma letra minúscula.");
            }
            if (!number) {
                System.out.println("- Deve conter pelo menos um número.");
            }
            if (!symbol) {
                System.out.println("- Deve conter pelo menos um caractere especial.");
            }
        }

    }
}
