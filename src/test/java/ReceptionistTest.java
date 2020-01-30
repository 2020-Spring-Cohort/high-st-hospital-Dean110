import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReceptionistTest {

    private Receptionist underTest;

    @BeforeEach
    void setUp() {
        underTest = new Receptionist("Fred", 101);
    }

    @Test
    public void shouldBeAnEmployee() {
        Employee underTest = new Receptionist("Fred", 101);
    }

    @Test
    public void shouldAnswerPhones() {
        underTest.answerPhones();
        assertTrue(underTest.isAnsweringPhones());
    }

    @Test
    public void shouldGiveStatus() {
        assertThat(underTest.getStatus()).isEqualTo(
                "Name:         Fred | ID:  101 | Pay: $45000 | Has been paid: false | Is answering phones: false");
    }
}

