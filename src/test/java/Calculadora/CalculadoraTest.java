package Calculadora;

import org.junit.Assert;
import org.junit.Test;


public class CalculadoraTest {
	
	@Test
	public void deveSomarDoisNumeros() {
		//cenario
		int a = 10;
		int b = 20;
		Calculadora calc = new Calculadora();
		
		//acao
		int res = calc.somar(a,b);
		
		//verificacao
		Assert.assertEquals(30, res);
		
	}
	@Test
	public void deveSubtrairDoisNumeros() {
		//cenario
		int a = 30;
		int b = 5;
		Calculadora calc = new Calculadora();
		
		//acao
		int res = calc.subtrair(a,b);
		
		//verificacao
		Assert.assertEquals(25, res);
		
	}
	@Test
	public void deveMultiplicarDoisNumeros() {
		//cenario
		int a = 9;
		int b = 14;
		Calculadora calc = new Calculadora();
		
		//acao
		int res = calc.multiplicar(a,b);
		
		//verificacao
		Assert.assertEquals(126, res);
	}
	@Test
	public void deveDividirDoisNumeros() {
		//cenario
		int a = 45;
		int b = 5;
		Calculadora calc = new Calculadora();
		
		//acao
		int res = calc.dividir(a,b);
		
		//verificacao
		Assert.assertEquals(9, res);
		
	}

}
