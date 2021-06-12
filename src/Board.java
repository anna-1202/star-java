public class Board {
     int width = 8;
     int height = 8;
     char[][] arr = new char[height][width];

     public Board(int width, int height ){
         this.width = width;
         this.height = height;
     }

    public  void fillArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = '-';
            }
        }
    }
}
