import java.util.Scanner;
import java.io.*;
public class Map {
    private static char[][] gameBoard;
    private static int N;
    private static int wumpusCount;
    private static int arrowCount;
    private static int heroRow;
    private static int heroCol;
    private static char heroDirection;

    private static void printGameBoard() {
        System.out.println("Játékterület:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            readGameBoardFromFile("wumpusinput.txt");
            printGameBoard();

        } catch (IOException e) {
            System.err.println("Hiba a fájl beolvasásakor: " + e.getMessage());
        }
    }

    private static void readGameBoardFromFile(String fileName) throws IOException {
        Scanner scanner = new Scanner(new File(fileName));
        N = scanner.nextInt();
        heroCol = scanner.next().charAt(0) - 'a';
        heroRow = scanner.nextInt() - 1;
        heroDirection = scanner.next().charAt(0);
        wumpusCount = 0;

        gameBoard = new char[N][N];
        for (int i = 0; i < N; i++) {
            String row = scanner.next();
            if (row.length() != N) {
                throw new IllegalArgumentException("A pálya sorainak hossza nem megfelelő.");
            }
            for (int j = 0; j < N; j++) {
                char cell = row.charAt(j);
                if (cell == 'U') {
                    wumpusCount++;
                }
                gameBoard[i][j] = cell;
            }
        }

        if (wumpusCount < 1 && wumpusCount > 3) {
            throw new IllegalArgumentException("Wumpusok számának nem megfelelő.");
        }
    }

    public static char[][] getGameBoard() {
        return gameBoard;
    }

    public static int getN() {
        return N;
    }

    public static int getWumpusCount() {
        return wumpusCount;
    }

    public static int getArrowCount() {
        return arrowCount;
    }

    public static int getHeroRow() {
        return heroRow;
    }

    public static int getHeroCol() {
        return heroCol;
    }

    public static char getHeroDirection() {
        return heroDirection;
    }


    public static void setHeroDirection(char heroDirection) {
        Map.heroDirection = heroDirection;
    }
}



