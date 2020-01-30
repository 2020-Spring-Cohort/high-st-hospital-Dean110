import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JanitorTest {

    private Janitor underTest;

    @BeforeEach
    void setUp() {
        underTest = new Janitor("Ben", 101);
    }

    @Test
    public void janitorShouldBeAnEmployeeSubclass() {
        Employee underTest = new Janitor("Ben", 101);
    }
    @Test
    public void janitorShouldBeSweeping(){
        underTest.sweep();
        assertTrue(underTest.isSweeping());
    }
    @Test
    public void janitorShouldGiveStatus(){
        assertThat(underTest.getStatus()).isEqualTo(
                "Name:          Ben | ID:  101 | Pay: $40000 | Has been paid: false | Is sweeping: false");
    }
}
