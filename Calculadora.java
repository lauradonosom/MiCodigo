package com.metodos;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args)   
	{  
		int a = 19;  
		int b = 5;  
		
		//Llamo al metodo 
		int c = sumar(a, b);   //a y b son parametros
		
		System.out.println("La suma de a y b es = " + c);  
	}   
	
	
	//Metodo definido por el usuario
	public static int sumar(int n1, int n2)   //n1 y n2 son los parametros formales 
	{  
		int s;  
		s=n1+n2;  
		return s; //retorno el resultado de la suma 
	}  
}  


