package com.example.backend;


import com.example.backend.domain.Game;
import com.example.backend.domain.Player;
import org.junit.jupiter.api.Test;

class MovementTest {

    @Test
    void canMovePlayer() {
        Game game = new Game();
        game.initializeGame();


        Player p1 = game.getPlayer();
        System.out.print(p1);
        p1.move();
        System.out.print(p1);
    }
}