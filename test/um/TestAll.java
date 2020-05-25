package um;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import um.calculadora.CalculadoraTest;
import um.persona.PersonaTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({ PersonaTest.class, CalculadoraTest.class })
public class TestAll {
    // se deja vacia, solamente sirve para colocar las anotaciones
}

