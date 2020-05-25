package um.persona;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PersonaTest {
    // test para verificar que el parentezco es correcto
    @Test
    public void testParentezcoCorrecto() {

        Persona ana = new Persona("Ana", 21);
        Persona maria = new Persona("Maria", 50);

        ana.setMadre(maria);
        String nombreMadre = ana.getMadre().getNombre();

        assertEquals(nombreMadre, maria.getNombre()); // verficando que 2 Strings sean iguales
        assertEquals(ana.getMadre(), maria); // verficando que 2 Objetos sean iguales
    }

    // test para verificar que si colocamos datos incorrectos, no pasa el test
    @Test
    public void testParentezcoIncorrecto() {

        Persona ana = new Persona("Ana", 21);
        Persona maria = new Persona("Maria", 50);
        Persona camila = new Persona("Camila", 48);

        ana.setMadre(maria);
        assertEquals(ana.getMadre(), camila); // verficando que 2 Objetos sean iguales
    }

    // test para verificar que determinada condicion booleana sea false
    @Test
    public void testMayoriaDeEdad() {

        Persona ana = new Persona("Ana", 17);
        // assertTrue(ana.mayorDeEdad()); Este assertTrue no pasa el test, porque no es mayor de edad
        assertFalse(ana.mayorDeEdad());

    }

    // test para verificar que una persona no sea nula
    @Test
    public void testNotNull() {
        Persona ana = new Persona("Ana", 21);
        assertNotNull("no deberia ser null", ana);
    }

    // test para verificar que dos listas sean lo mismo
    @Test
    public void testAssertSame() {
        Persona paula = new Persona("Paula", 21);
        Persona claudia = new Persona("Claudia", 50);
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(paula);
        lista.add(claudia);

        assertSame(lista, lista);
    }

    // test para verificar que dos personas no sean lo mismo
    @Test
    public void testAssertNotSame() {
        Persona ana = new Persona("Ana", 21);
        // Persona maria = new Persona("Maria", 50);
        // assertNotSame(ana, maria); // pasa el test
        assertNotSame(ana, ana); // no pasa el test
    }

    // test que espera una exception
    @Test(expected = NullPointerException.class)
    public void testException() throws NullPointerException {

        Persona[] personas = new Persona[4];

        Persona dos = personas[2];
        dos.getEdad();

    }

}