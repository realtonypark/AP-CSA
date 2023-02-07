public class Tile {
    private int x;
    private String n;

    Tile(int xa, String na){
        x = xa;
        n = na;
    }

    public String toString(){
        return(x+ " "+n);
    }
    public static void main(String[] args){
        Tile t1 = new Tile(4, "dfdf");
        System.out.print(t1);
    }
}
