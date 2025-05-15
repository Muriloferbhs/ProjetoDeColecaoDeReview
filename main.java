package com.mycompany.colecaoenari;

import java.util.Scanner;

public class ColecaoEnari {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 1;

        while (x != 0) {    
            System.out.println("Selecione uma opcao: ");
            System.out.println("1- Cadastrar uma review de um jogo ");
            System.out.println("2- Ver uma review ja cadastrada ");
            System.out.println("3- Atualizar informacoes ");
            System.out.println("0- Sair ");
            
            x = sc.nextInt();
            int i = 0;
            String [] Jogos = new String[i];
            
            
            if (x == 1) {
                
            }
            
            
            
            
            if (x == 2) {
                System.out.println("Menu pra ver uma review");
            }
            
            
            
            
            if (x == 3) {
                System.out.println("Menu pra atualizar informacoes");
            }

            
            
            
            System.out.println("1- Realizar outra ação");
            System.out.println("0- Sair");
            
            
            
            
            x = sc.nextInt();
        }
    }
}
