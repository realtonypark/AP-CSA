import chn.util.*;

public class Chnutil {
    public static void main(String[] args){
        FileInput inFile = new FileInput("input.txt");
        FileOutput outFile = new FileOutput("output.txt", "append");
        
        int num = Integer.parseInt(inFile.readLine());
        double midScore = 0.0;
        double finalScore = 0.0;
        double performScore = 0.0;

        String[] str = scoreCalc(inFile).split("\\s+");
        int score = Integer.parseInt(str[2])*3/10 + Integer.parseInt(str[3])*3/10 + Integer.parseInt(str[4])*4/10;     

        printScore(outFile, str, score);
        outFile.close();
        inFile.close();
    }

    public static String scoreCalc(FileInput inScores){
        String scores = "";
        scores = inScores.readLine();
        return scores;
    }

    public static void printScore(FileOutput outScores, String[] str, int score){
        outScores.println("이름: " + str[0]);
        outScores.println("나이: " + str[1]);
        outScores.println("점수: " + score);
    }
}

/*
 How to run the Chnutil:

 javac -cp chnutil.jar chnutil.java
 java -cp chnutil.jar chnutil.java
 */