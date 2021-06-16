public class View {
    static char symbol = '*';

    public static void holdAndFlush() throws InterruptedException {
        Thread.sleep(1000);
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static String getArrayToString(char [][] arr) {

        String fullArr = "";
        for (int i = 0; i < arr.length; i++) {
            for (int f = 0; f < arr[i].length; f++) {
                fullArr = fullArr + (arr[i][f]);

            }
            fullArr = fullArr + "\n";
            //System.out.println(fullArr);
            //fullArr = "";
        }
        return fullArr;
    }
}
