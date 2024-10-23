package nl.tudelft.jpacman.npc.ghost;

import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.level.LevelFactory;
import nl.tudelft.jpacman.level.MapParser;
import nl.tudelft.jpacman.npc.Ghost;

import java.util.List;

import static org.mockito.Mockito.mock;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.level.LevelFactory;
import nl.tudelft.jpacman.level.MapParser;
import nl.tudelft.jpacman.level.Pellet;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.sprite.PacManSprites;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * Tests the various methods provided by the {@link Clyde} class.
 *
 *
 *
 */
public class ClydeTest {

    private GhostMapParser parser;

    private Ghost clyde;

    @BeforeEach
    void setup() {
        PacManSprites sprites = new PacManSprites();
        GhostFactory ghostFactory = new GhostFactory(sprites);
        parser = new GhostMapParser(new LevelFactory(sprites, ghostFactory), new BoardFactory(sprites)
            , ghostFactory);

    }

    @Test
    void testClydeFar(){
        Board b = parser
            .parseMap(Lists.newArrayList("############", "#P        C#", "############"))
            .getBoard();




    }
}
