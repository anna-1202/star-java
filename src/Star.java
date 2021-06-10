import java.io.IOException;

public class Star {
    static int width = 8;
    static int height = 8;
    static char symbol = '*';
    static char[][] arr = new char[height][width];

    public static void main(String[] args) throws InterruptedException, IOException {
        holdAndFlush();
        fillArray();

        forward(true);
        down(true);
        back(true);
        up(true);
        oblique(true);


    }

    public static void fillArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = '-';
            }
        }
    }


    public static void forward(boolean isClean) throws InterruptedException, IOException {
        for (int j = 0; j < arr[0].length; j++) {
            arr[0][j] = symbol;
            if ((isClean) && (j > 0)) {
                arr[0][j - 1] = ' ';
            }
            print();
            holdAndFlush();

        }
    }

    public static void down(boolean isClean) throws InterruptedException {
        for (int i = 1; i < arr.length; i++) {
            arr[i][width - 1] = symbol;
            if (isClean) {
                arr[i - 1][width - 1] = ' ';
            }
            print();
            holdAndFlush();
        }
    }

    public static void back(boolean isClean) throws InterruptedException {
        for (int j = width - 2; j >= 0; j--) {
            arr[height - 1][j] = symbol;
            if (isClean) {
                arr[height - 1][j + 1] = ' ';
            }
            print();
            holdAndFlush();
        }
    }

    public static void up(boolean isClean) throws InterruptedException {
        for (int i = height - 2; i >= 0; i--) {
            arr[i][0] = symbol;
            if (isClean) {
                arr[i + 1][0] = ' ';
            }
            print();
            holdAndFlush();
        }
    }

    public static void oblique(boolean isClean) throws InterruptedException {
        for (int i = 1; i < arr.length; i++) {
            arr[i][i] = symbol;
            if (isClean) {
                arr[i - 1][i - 1] = ' ';
            }
            print();
            holdAndFlush();
        }

    }

    public static void print() {

        String fullArr = "";
        for (int i = 0; i < arr.length; i++) {
            for (int f = 0; f < arr[i].length; f++) {
                fullArr = fullArr + (arr[i][f]);

            }
            System.out.println(fullArr);
            fullArr = "";
        }
    }

    public static void holdAndFlush() throws InterruptedException {
        Thread.sleep(1000);
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}


