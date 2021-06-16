import java.io.IOException;

public class Board {
    int width;
    int height;
    char[][] arr;


    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.arr = new char[height][width];
        fillArray();
    }

    public void fillArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = '-';
            }
        }
    }



    public String toString() {
        return "Board includes: " + "Width = " + this.width + " Height = " + this.height + " Arr: " + "\n" + View.getArrayToString(arr);

    }

    public void forward(boolean isClean) throws InterruptedException, IOException {
        for (int j = 0; j < arr[0].length; j++) {
            arr[0][j] = View.symbol;
            if ((isClean) && (j > 0)) {
                arr[0][j - 1] = ' ';
            }
            System.out.println(View.getArrayToString(arr));
            View.holdAndFlush();

        }
    }


}
