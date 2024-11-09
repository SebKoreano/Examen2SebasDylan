package com.example.examen2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class EncuentraListaTest {

    @Test
    public void testEncuentraLista() {

        List<Integer> listilla = Arrays.asList(1, 2, 3, 4, 5);

        assertTrue(EncuentraLista.EncuentraLista(listilla, 3));
    }

}
