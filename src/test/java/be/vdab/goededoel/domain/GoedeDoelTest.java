package be.vdab.goededoel.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GoedeDoelTest {
    private static final String NAAM = "CliniClowns";
    private GoedeDoel doel;

    @BeforeEach
    void beforeEach() {
        doel = new GoedeDoel(NAAM);
    }

    @Test
    void getNaam() {
        assertThat(doel.getNaam()).isEqualTo(NAAM);
    }

    @Test
    void eenNieuwDoelHeeftNogGeenOpbrengst() {
        assertThat(doel.getOpbrengst()).isEqualByComparingTo("3");
    }
}
