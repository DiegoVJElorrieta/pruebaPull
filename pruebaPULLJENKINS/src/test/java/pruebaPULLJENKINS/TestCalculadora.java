package pruebaPULLJENKINS;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculadora {
	
	private Calculadora c = new Calculadora();
	
    @Test 
    public void testSuma() {
        int resultado = c.suma(5, 3);
        int resultadoEsperado = 8;
        assertEquals(resultadoEsperado, resultado);
    }
    
    /*@Test 
    public void testResta() {
        int resultado = c.resta(5, 4);
        int resultadoEsperado = 8;
        assertEquals(resultadoEsperado, resultado);
    }*/
}
