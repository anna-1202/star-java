public class Test {
    public static void main(String[] args){

        Pole pole = new Pole(15, 20);
        System.out.println(pole);
        Pole pole1 = new Pole();
        System.out.println(pole1);

        System.out.println(pole.width + " " + pole.height);
        System.out.println(pole1.width + " " + pole1.height);


    }
}

 class Pole{
    int width;
    int height;
    public Pole(int width, int height){
     this.width = width;
     this.height =height;
    }
     public Pole(){

     }

}

