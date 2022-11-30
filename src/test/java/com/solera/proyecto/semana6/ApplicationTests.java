package com.solera.proyecto.semana6;

import com.solera.proyecto.semana6.oporClient.OporClient;
import com.solera.proyecto.semana6.oporClient.OporClientDAO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ApplicationTests {

	OporClientDAO oporClientDAO = new OporClientDAO();

	@Test
	void testgetClient() {
		List<OporClient> fakeOporClientList = new ArrayList<>();
		assertEquals(fakeOporClientList, oporClientDAO.getClientes());
	}

	@Test
	void testgetOpor() {
		List<OporClient> fakeOporClientList = new ArrayList<>();
		assertEquals(fakeOporClientList, oporClientDAO.getOportunidades());
	}//	Este test esta realizado para fallar ya que aqui se poblo la Lista de getOportunidades por lo tanto no seran iguales

	@Test
	void testCreacionOpor(){
		OporClient oportunidad = new OporClient(null, false,2,  "Prueba1", "pruebna1@gmail.com", "1685a8231356", false, "");
		assertEquals(oporClientDAO.crearOportunidad(oportunidad), oportunidad);
	}

	@Test
	void testOporToClient(){
		assertEquals(oporClientDAO.oporToCliente(2, "PruebaClaveFiscal").getClient(), true);
	}

	@Test
	void testBorrarCliente(){
		assertEquals(oporClientDAO.borrarCliente(2).isDelete(), true);
	}

	@Test
	void testBorrarOpor(){
		assertEquals(oporClientDAO.borrarOportunidad(1).isDelete(), true);
	}
}
