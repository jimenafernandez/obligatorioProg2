package um.calculadora;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.*;
public class CalculadoraTest {

        @Test
        public void testSumar() {

            Calculadora oCalculadora = new Calculadora();

            int nResultado = oCalculadora.sumar(2, 3);

            if (nResultado < 0) {
                fail();
            }

            assertEquals(5, nResultado);

        }

    }
