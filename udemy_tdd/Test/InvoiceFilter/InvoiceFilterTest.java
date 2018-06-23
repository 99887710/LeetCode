package InvoiceFilter;

import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


public class InvoiceFilterTest {

    @Test
    public void firstElement() {

        List list = mock(ArrayList.class);
        Mockito.when(list.get(0)).thenReturn("first");
        System.out.println("first element is " + list.get(0));
    }
}