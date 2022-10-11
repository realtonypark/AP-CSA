import chn.util.*;
import java.lang.Math;

/*
<How to run the Source Code using Chnutil.jar>
javac -cp chnutil.jar chnutil.java
java -cp chnutil.jar chnutil.java
*/

public class ChnutilHW{
    public static void main(String[] args){
        FileInput inFile = new FileInput("inputHW.txt");
        FileOutput outFile = new FileOutput("outputHW.txt", "append");
        int num = Integer.parseInt(inFile.readLine());

        calcScore(inFile, outFile, num);

        outFile.close();
        inFile.close();
    }

    public static void calcScore(FileInput in, FileOutput out, int num){
        String[] info = new String[num];
        String[] infoSplit =  new String[num];
        String[] indScore = new String[num];

        double midScore = 0.0;
        double finalScore = 0.0;
        double performScore = 0.0;
        double allScore = 0.0;
        double allScore_temp = 0.0;

        double[] mids = new double[num];
        double[] finals = new double[num];
        double[] performs = new double[num];
        double[] alls = new double[num];

        double midSD = 0.0;
        double finalSD = 0.0;
        double performSD = 0.0;
        double allSD = 0.0;

        for(int i=0; i<num; i++){
            info[i] = in.readLine();
            infoSplit = info[i].split("\\s+");

            allScore_temp = Integer.parseInt(infoSplit[3])*3.0/10 + Integer.parseInt(infoSplit[4])*3.0/10 + Integer.parseInt(infoSplit[4])*4.0/10;
            indScore[i] = infoSplit[0] + " 점수: " + Math.round(allScore_temp*100)/100.0;

            midScore += Integer.parseInt(infoSplit[3]);
            mids[i] = Integer.parseInt(infoSplit[3]);
            finalScore += Integer.parseInt(infoSplit[4]);
            finals[i] = Integer.parseInt(infoSplit[4]);
            performScore += Integer.parseInt(infoSplit[5]);
            performs[i] = Integer.parseInt(infoSplit[5]);
            allScore += Integer.parseInt(infoSplit[3])*3.0/10 + Integer.parseInt(infoSplit[4])*3.0/10 + Integer.parseInt(infoSplit[4])*4.0/10;
            alls[i] = Integer.parseInt(infoSplit[3])*3.0/10 + Integer.parseInt(infoSplit[4])*3.0/10 + Integer.parseInt(infoSplit[4])*4.0/10;
        }
        
        midScore/=num;
        finalScore/=num;
        performScore/=num;
        allScore/=num;

        for(int i = 0; i < num; i++) out.println(indScore[i]);
        out.println();
        out.println("중간고사 평균: "+ Math.round(midScore*100)/100.0);
        out.println("기말고사 평균: "+ Math.round(finalScore*100)/100.0);
        out.println("수행평가 평균: "+ Math.round(performScore*100)/100.0);
        out.println("최종 점수 평균: "+ Math.round(allScore*100)/100.0);
        out.println();

        for(int i = 0; i < num; i++){
            midSD += (mids[i] - midScore) * (mids[i] - midScore);
            finalSD += (finals[i] - finalScore) * (finals[i] - finalScore);
            performSD += (performs[i] - performScore) * (performs[i] - performScore);
            allSD += (alls[i] - allScore) * (alls[i] - allScore);
        }
        midSD = Math.sqrt(midSD/(num-1));
        finalSD = Math.sqrt(finalSD/(num-1));
        performSD = Math.sqrt(performSD/(num-1));
        allSD = Math.sqrt(allSD/(num-1));

        out.println("중간고사 표준편차: "+ Math.round(midSD*100)/100.0);
        out.println("기말고사 표준편차: "+ Math.round(finalSD*100)/100.0);
        out.println("수행평가 표준편차: "+ Math.round(performSD*100)/100.0);
        out.println("최종 점수 표준편차: "+ Math.round(allSD*100)/100.0);
    }
}
