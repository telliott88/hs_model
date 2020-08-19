package com.elliott.hs;

import com.elliott.hs.game.Board;
import com.elliott.hs.game.Game;
import com.elliott.hs.game.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import static com.elliott.hs.generator.RandomBoardGenerator.generateRandomBoard;

public class Simulation {

    private static final Logger logger = LoggerFactory.getLogger(Game.class);

    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        simulation.run();
    }

    private void run() {

        Map<Board, Integer> results = new HashMap<>();

        logger.info("RUNNING SIM");

        for (int i = 0; i < 5_000_000; i++) {
            Game game = new Game();

            Board b1 = generateRandomBoard();
            Board b2 = generateRandomBoard();

            game.addPlayer(new Player("P1", b1));
            game.addPlayer(new Player("P2", b2));
            game.play();
            Player player = game.getWinner();

            if(player == null) {
                //draw, skip
                continue;
            }

            Board board = player.getBoard();

            if(results.containsKey(board)) {
                int current = results.get(board);
                current = current + 1;
                results.put(board, current);
            } else {
                results.put(board, 1);
            }
        }

        logger.info("RESULTS");

        results.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEach(System.out::println);


    }

}
