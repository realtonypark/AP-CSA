public class MirrorImage {
    public static void main(String[] args){
        int[][] image = new int[][] {{2, 3, 4}, {5, 6, 7}, {8, 9, 0}, {1, 1, 1}};
        
        int height = image.length;
        int numCols = image[0].length;

        // Mirror on the middle of the image
        /*
        for(int i=0; i<numCols; i++){
            for(int j=0; j<height/2; j++){
                image[height-j-1][i] = image[j][i];
            }
        }
        */

        // Mirror on the bottom of the image
        for(int i=0; i<numCols; i++){
            for(int j=0; j<height; j++){
                image[height-j-1][i] = image[j][i];
            }
        }

        // Mirror on the left of the image
        for(int i=0; i<numCols; i++){
            for(int j=0; j<height; j++){
                image[height-j-1][i] = image[j][i];
            }
        }

        // Mirror on the right of the image
        for(int i=0; i<numCols; i++){
            for(int j=0; j<height; j++){
                image[height-j-1][i] = image[j][i];
            }
        }

        // Mirror on the top of the image
        for(int i=0; i<numCols; i++){
            for(int j=0; j<height; j++){
                image[height-j-1][i] = image[j][i];
            }
        }

        // Mirror on the middle(좌우) of the image
        for(int i=0; i<numCols; i++){
            for(int j=0; j<height; j++){
                image[height-j-1][i] = image[j][i];
            }
        }

        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
