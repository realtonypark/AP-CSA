import chn.util.*;

public class ChnutilHW{
    public static void main(String[] args){
        FileInput inFile = new FileInput("inputHW.txt");
        FileOutput outFile = new FileOutput("outputHW.txt", "append");
        
        int num = Integer.parseInt(inFile.readLine());
        String[] name = new String[num];
        double[] score = new double[num];
        double midScore = 0.0;
        double finalScore = 0.0;
        double performScore = 0.0;
        double allScore = 0.0;
        double midSD = 0.0;
        double finalSD = 0.0;
        double performSD = 0.0;
        double allSD = 0.0;

        for(int i = 0; i < num; i++)    outFile.println("이름: ", name[i], ", 최종 점수: ", score[i]);
        outFile.println("중간고사 평균: ", midScore, "중간고사 표준편차: ", midSD);
        outFile.println("기말고사 평균: ", finalScore, "기말고사 표준편자: ", finalSD);
        outFile.println("수행평가 평균: ", performScore, "수행평가 표준편차: ", performSD);
        outFile.println("최종 점수 평균: ", allScore, "최종 점수 표준편차: ", allSD);

        String[] scoreArr = scoreCalc(inFile).split("\\s+");
        int score = Integer.parseInt(str[2])*3/10 + Integer.parseInt(str[3])*3/10 + Integer.parseInt(str[4])*4/10;     

        printScore(outFile, str, score);
        outFile.close();
        inFile.close();
    }

    public static String readFile(FileInput in){
        in 
        String scores = "";
        scores = inScores.readLine();
        return scores;

        int score = Integer.parseInt(str[2])*3/10 + Integer.parseInt(str[3])*3/10 + Integer.parseInt(str[4])*4/10;     

    }

    public static String scoreCalc(FileInput inScores){
        String scores = "";
        scores = inScores.readLine();
        return scores;

        int score = Integer.parseInt(str[2])*3/10 + Integer.parseInt(str[3])*3/10 + Integer.parseInt(str[4])*4/10;     

    }

    public static double scoreCalc(FileOutput outScores, String[] str, int score){
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