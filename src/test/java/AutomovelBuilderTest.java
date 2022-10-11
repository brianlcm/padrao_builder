import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomovelBuilderTest {

    @Test
    void deveRetornarExcecaoParaAlunoSemMatricula() {
        try {
            AutomovelBuilder automovelBuilder = new AutomovelBuilder();
            Automovel automovel = automovelBuilder
                    .setModelo("Fiat Uno")
                    .setMarca("Fiat")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Registro inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAlunoSemNome() {
        try {
            AutomovelBuilder automovelBuilder = new AutomovelBuilder();
            Automovel automovel = automovelBuilder
                    .setCodigo(2113)
                    .setModelo("Fiat Strada Endurance")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarAlunoValido() {
        AutomovelBuilder automovelBuilder = new AutomovelBuilder();
        Automovel automovel = automovelBuilder
                .setCodigo(2113)
                .setModelo("Fiat Strada Endurance")
                .setMarca("Fiat")
                .build();

        assertNotNull(automovel);
    }

}