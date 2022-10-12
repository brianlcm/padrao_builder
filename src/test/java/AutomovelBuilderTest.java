import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomovelBuilderTest {

    @Test
    void deveRetornarExcecaoParaAutomovelSemModelo() {
        try {
            AutomovelBuilder automovel = new AutomovelBuilder();
            automovel.setModelo("")
                    .setCodigo(221)
                    .setPlaca("1111EEE")
                    .setMecanicoResponsavel("Fulano")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Modelo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAutomovelComCodigoErrado() {
        try {
            AutomovelBuilder automovel = new AutomovelBuilder();
            automovel.setCodigo(0)
                    .setModelo("Fiat Strada Endurance")
                    .setPlaca("1111EEE")
                    .setMecanicoResponsavel("Fulano")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarAlunoValido() {
        AutomovelBuilder automovel = new AutomovelBuilder();
        automovel.setCodigo(2221)
                .setModelo("Fiat Strada Endurance")
                .setPlaca("1111EEE")
                .setMecanicoResponsavel("Fulano")
                .build();

        assertNotNull(automovel);
    }

    @Test
    void deveRetornarPlacaInvalida() {
        try {
            AutomovelBuilder automovel = new AutomovelBuilder();
            automovel.setCodigo(2221)
                    .setModelo("Fiat Strada Endurance")
                    .setPlaca("1111E")
                    .setMecanicoResponsavel("Fulano")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Placa inválida", e.getMessage());
        }
    }

}