import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class CuentaTest {
        @Test
        void testGetNumero() {
            Cuenta cuenta1 = new Cuenta("ES2109987656243424352345235", 100);
            assertEquals("ES2109987656243424352345235",cuenta1.getNumero());
        }

        @Test
        @BeforeEach
        void testGetSaldo() {
            Cuenta cuenta1 = new Cuenta("ES2109987656243424352345235", 100);
            float saldo = cuenta1.getSaldo();
            assertEquals (100,saldo);
        }

        @Test
        void testSetNumero() {
            Cuenta cuenta1 = new Cuenta("ES2109987656243424352345235", 100);
            cuenta1.ingresarDinero(400);
            assertEquals(500, cuenta1.getSaldo());
        }


        @Test
        void testExtraerDinero() {
            Cuenta cuenta1 = new Cuenta("ES2109987656243424352345235", 100);
            cuenta1.extraerDinero(20);
            assertEquals(80, cuenta1.getSaldo());
            cuenta1.extraerDinero(100);
            fail("Error, no debería haber dejado quitar saldo");
        }
    }

