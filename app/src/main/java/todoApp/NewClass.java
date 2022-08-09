/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todoApp;

import java.util.Scanner;

/**
 *
 * @author Aldernei
 */
class myClass {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

//Criando as variáveis de desconto e preço
double desconto = scanner.nextDouble();
double precoAntigo = scanner.nextDouble();

//Calculando o valor do desconto sem ser em porcentagem
double descontoValor = precoAntigo * (desconto/100);

//Subtraindo o valor antigo menos o desconto aplicado
double valorFinal = precoAntigo - descontoValor;

System.out.println(valorFinal);

    }
}
