package com.everis.bootcamp.tallerjunit;

import org.junit.*;

public class CarritoCompraServiceTest {
	
	CarritoCompraService service;
	
	@Before
	public void setUp() {
		System.out.println("Inicializamos el servicio");
		service = new CarritoCompraService();
	}
	
	@Test
	public void primerTest() {
		System.out.println("Primer Test");
	}
	
}
