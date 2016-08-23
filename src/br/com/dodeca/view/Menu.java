package br.com.dodeca.view;

import java.util.Scanner;

/**
 * Classe Menu
 *
 * @author Ríder Cantuária <cantuaria@edu.univali.br>
 * @version beta
 * @since 08/2016
 */
public class Menu {

    /**
     * Exibição da tela de menu
     */
    public static void exibirMenu() {

        try {

            System.out.println("<------Primeiro Códigos------>");
            System.out.println("Seleciona a opção:");
            System.out.println("1) Cadstro de equipamento:");
            System.out.println("2) Listagem de equipamentos");
            System.out.println("O que você deseja fazer?");

            Scanner entrada = new Scanner(System.in);
            int opcao = entrada.nextInt();
            System.out.println("O usuário digitou " + opcao);

        } catch (Exception e) {
            System.out.println("Não deu certo pq: " + e.getMessage());
        }

    }
}
