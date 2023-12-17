package tests_echiquier;
import org.junit.jupiter.api.*;
import xiangqi.*;
import static org.junit.jupiter.api.Assertions.*;


public class TestDebut {
    Echiquier board;

    @BeforeEach
    public void EchiquierDebut(){
        board = new Echiquier();
        board.debuter();
    }

    @Test
    public void EchiquierVide(){
        assertEquals("Char",board.getJeu()[0][0].getPiece().getNom());
    }



}
