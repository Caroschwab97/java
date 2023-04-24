package ar.edu.unlp.oo1.ej11_inversor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test2 {
	
    private Inversion inversion1;
	
    @BeforeEach
    public void setUp() {
	this.inversion1 = new plazoFijo(LocalDate.now().minusDays(10), 1000, 2);
    }

    @Test
    public void testValorActual() {
	assertEquals(1020, this.inversion1.valorActual());
    }
	
}


