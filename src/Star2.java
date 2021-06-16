import java.io.IOException;

public class Star2 {

    public static void main(String[] args) throws IOException, InterruptedException {
        Board board = new Board(5, 5);
        System.out.println(board.height + " " + board.width);
        System.out.println(board.toString());
        board.forward(true);


    }

    }


