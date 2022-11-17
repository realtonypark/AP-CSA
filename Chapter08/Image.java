public class Image{
    private final int BLACK = 1;
    private final int WHITE = 0;
    private int[][] image; // square grid
    private int size; // number of rows and columns

    public Image(){
        image = new int[][]{    {0, 0, 1, 0, 0, 0, 0, 0},    
                                {0, 1, 1, 1, 1, 1, 1, 0},
                                {0, 1, 0, 0, 0, 0, 1, 1},
                                {0, 1, 0, 0, 0, 0, 1, 0},
                                {0, 1, 0, 0, 0, 0, 1, 0},
                                {0, 1, 1, 1, 1, 1, 1 ,0},
                                {1, 1, 1, 1, 0, 0, 1, 0},
                                {0, 0, 0, 1, 1, 0, 0, 0}    };
        size = 8;
    }

    public void cellOrd(){}

    public void colChangeOrd(){}

    public void display(){
        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image[i].length; j++){
                System.out.print(image[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void eraseBlob(int row, int col){
        if(row >= 0 && row < size && col >= 0 && col < size)
            if(image[row][col] == BLACK)
            {
                image[row][col] = WHITE;
                eraseBlob(row-1, col);
                eraseBlob(row+1, col);
                eraseBlob(row, col-1);
                eraseBlob(row, col+1);
            }
    }

    public static void main(String[] args){
        Image img = new Image();
        img.eraseBlob(1, 2);
        img.display();
    }
}
