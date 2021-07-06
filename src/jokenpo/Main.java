package jokenpo;

import java.util.Scanner;

public class Main{
    public static final Scanner reader = new Scanner(System.in);
    public static boolean play = true;
    public static int hintUser;

    public static void main(String[] args) {
        game();
    }

    public static void game() {
        do {
            System.out.println("\n# Seja bem vindo ao Jogo Jokenpo #");
            System.out.println("Informe o seu palpite (1 - Pedra; 2 - Papel; 3 - Tesoura)\n");
            System.out.print("Seu palpite: ");
            hintUser = (int) reader.nextInt();

            if(hintUser != 1 && hintUser != 2 && hintUser != 3){
                System.out.println("\nResposta informada inválida!");
                play = false;
            } else {
                sort();
                play = false;
            }
            
        } while (play);
    }

    public static void sort() {
    	String resUser, resCpu;
        int hintCpu = (int) Math.round(Math.random() * 2) + 1;
        
        switch(hintUser) {
        case 1:
        	resUser = "Pedra";
        	break;
        case 2:
        	resUser = "Papel";
        	break;
        case 3:
        	resUser = "Tesoura";
        	break;
    	default:
        	resUser = null;
        	break;
        }
        
        switch(hintCpu) {
        case 1:
        	resCpu = "Pedra";
        	break;
        case 2:
        	resCpu = "Papel";
        	break;
        case 3:
        	resCpu = "Tesoura";
        	break;
    	default:
        	resCpu = null;
        	break;        
        }
        
        if(hintUser == hintCpu) {
        	System.out.println("Seu palpite: " + resUser);
        	System.out.println("Palpite adversário: " + resCpu);
        	System.out.println("\nEmpate técnico!");
        } else if (hintUser == 1 && hintCpu == 2) {
        	System.out.println("Seu palpite: " + resUser);
        	System.out.println("Palpite adversário: " + resCpu);
        	System.out.println("\nVitória da CPU");
        } else if (hintUser == 2 && hintCpu == 3) {
        	System.out.println("Seu palpite: " + resUser);
        	System.out.println("Palpite adversário: " + resCpu);
        	System.out.println("\nVitória da CPU");
        } else if (hintUser == 3 && hintCpu == 1) {
        	System.out.println("Seu palpite: " + resUser);
        	System.out.println("Palpite adversário: " + resCpu);
        	System.out.println("\nVitória da CPU");
        } else {
        	System.out.println("Seu palpite: " + resUser);
        	System.out.println("Palpite adversário: " + resCpu);
        	System.out.println("\nVitória do Jogador!");
        }
    }
}
