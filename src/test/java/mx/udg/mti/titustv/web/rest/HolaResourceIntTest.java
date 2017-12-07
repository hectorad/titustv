package mx.udg.mti.titustv.web.rest;

import mx.udg.mti.titustv.TitustvApp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 * Test class for the Hola REST controller.
 *
 * @see HolaResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TitustvApp.class)
public class HolaResourceIntTest {

    private MockMvc restMockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        HolaResource holaResource = new HolaResource();
        restMockMvc = MockMvcBuilders
            .standaloneSetup(holaResource)
            .build();
    }

    /**
    * Test saludo
    */
    @Test
    public void testSaludo() throws Exception {
        restMockMvc.perform(get("/api/hola/saludo"))
            .andExpect(status().isOk());
    }

}
