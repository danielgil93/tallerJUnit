package com.everis.bootcamp.tallerjunit;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CarritoCompraServiceTest {
	
	//CarritoCompraService service;
	static CarritoCompraService service_;
	
	@BeforeClass
	public static void iniClass() {
		System.out.println("Inicializamos la clase");
		service_ = new CarritoCompraService();
	}
	
	@Before
	public void setUp() {
		System.out.println("Inicializamos el servicio");
		service = new CarritoCompraService();
	}
	
	/*
	@Test
	public void addArticleTest() {
		System.out.println("Probando addArticulo");
		Articulo article = new Articulo("Articulo 1", 3.99);
		assertTrue(service.getArticulos().isEmpty());
		service.addArticulo(article);
		assertFalse(service.getArticulos().isEmpty());
		assertSame(service.getArticulos().get(0), article);
		assertEquals("Descripcion distinta", service.getArticulos().get(0).getDescripcion(), article.getDescripcion());
		assertEquals("Precio distinto", service.getArticulos().get(0).getPrecio(), article.getPrecio());
	}
	
	@Test
	public void limpiarCestaTest() {
		System.out.println("Probando limpiarCesta");
		Articulo article = new Articulo("Articulo 1", 3.99);
		assertTrue(service.getArticulos().isEmpty());
		service.addArticulo(article);
		assertFalse(service.getArticulos().isEmpty());
		service.limpiarCesta();
		assertTrue(service.getArticulos().isEmpty());
	}
	
	@Test
	public void totalPriceTest() {
		System.out.println("Probando totalPrice");
		service.addArticulo(new Articulo("Articulo 1", 4.00));
		service.addArticulo(new Articulo("Articulo 2", 6.00));
		service.addArticulo(new Articulo("Articulo 3", 12.00));
		service.addArticulo(new Articulo("Articulo 4", 8.00));
		assertEquals(service.totalPrice(), new Double(30.00));
	}
	
	@Test
	public void calculaDescuentoTest() {
		System.out.println("Probando calcula descuento");
		assertEquals(service.calculadorDescuento(100d, 10d), new Double(90));
	}
	*/
	
	@Test
	public void addArticleTest() {
		System.out.println("Probando addArticulo");
		Articulo article = new Articulo("Articulo 1", 3.99);
		assertTrue(service_.getArticulos().isEmpty());
		service_.addArticulo(article);
		assertFalse(service_.getArticulos().isEmpty());
		assertSame(service_.getArticulos().get(0), article);
		assertEquals("Descripcion distinta", service_.getArticulos().get(0).getDescripcion(), article.getDescripcion());
		assertEquals("Precio distinto", service_.getArticulos().get(0).getPrecio(), article.getPrecio());
	}
	
	@Test
	public void limpiarCestaTest() {
		System.out.println("Probando limpiarCesta");
		Articulo article = new Articulo("Articulo 1", 3.99);
		service_.addArticulo(article);
		assertFalse(service_.getArticulos().isEmpty());
		service_.limpiarCesta();
		assertTrue(service_.getArticulos().isEmpty());
	}
	
	@Test
	public void totalPriceTest() {
		System.out.println("Probando totalPrice");
		service_.addArticulo(new Articulo("Articulo 1", 4.00));
		service_.addArticulo(new Articulo("Articulo 2", 6.00));
		service_.addArticulo(new Articulo("Articulo 3", 12.00));
		service_.addArticulo(new Articulo("Articulo 4", 8.00));
		assertEquals(service_.totalPrice(), new Double(30.00));
	}
	
}
