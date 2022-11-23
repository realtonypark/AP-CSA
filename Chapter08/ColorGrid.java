public class ColorGrid {
    private String[][] pixels;
    private int rows;
    private int cols;

    // Creates numRows x numCols ColorGrid from String s.
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

    public void paintRegion(int row, int col, String newColor, String oldColor){
        if (row>=0 && row < rows && col >= 0 && col<cols){
            if(!pixels[row][col].equals(newColor) && pixels[row][cols].equals(oldColor)){
                pixels[row][col] = newColor;
                paintRegion(row-1, col, newColor, oldColor);
                paintRegion(row+1, col, newColor, oldColor);
                paintRegion(row, col+1, newColor, oldColor);
                paintRegion(row, col-1, newColor, oldColor);
            }
        }
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
        ColorGrid myGrid = new ColorGrid("rrbgyybrbyrrggrrrbyrryrb", 4, 6);
        myGrid.display();
        myGrid.paintRegion(2, 3, "b", "r");
        myGrid.display();
    }
}
