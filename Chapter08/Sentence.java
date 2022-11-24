public class Sentence {
    private String sentence;
    private int numWords;

    public Sentence(String str){
        sentence = str;
        numWords = 1;
        int k = str.indexOf(" ");
        while (k!=-1){
            numWords++;
            str = str.substring(k+1);
            k = str.indexOf(" ");
        }
        //sentence = removeAll(sentence);
    }

    public int getNumWords(){
        return numWords;
    }

    public String getSentence(){
        return sentence;
    }

    private static String removeAll(String s){
        s = s.toLowerCase();
        String result = "";
        for(int i=0; i<s.length(); i++){  
            if(s.charAt(i)>='a' && s.charAt(i)<='z') result += s.substring(i, i+1);
        }

        return result;
    }

    public boolean isPalindrone(){
        String temp = removeAll(sentence);
        return isPalindrone(temp, 0, temp.length()-1);
    }

    public static boolean isPalindrone(String s, int start, int end){
        if(start>=end) return true;
        else{
            String first = s.substring(start, start+1);
            String last = s.substring(end, end+1);
            if (first.equals(last)) return isPalindrone(s, start+1, end-1);
            else return false;
        }
    }
}