public class ColorGrid {
    private String[][] pixels;
    private int rows;
    private int cols;

    public ColorGrid(String s, int numRows, int numCols){
        rows = numRows;
        cols = numCols;
        pixels = new String[numRows][numCols];

        int ind = 0;

        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                pixels[i][j] = s.substring(ind, ind+1);
                ind++;
            }
        }
    }

    public void paintRegion(int row, int col, String newColor){
        
    }

    public void display(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(pixels[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        ColorGrid myGrid = new ColorGrid("abcdefgh", 2, 4);
        myGrid.display();
    }
}
