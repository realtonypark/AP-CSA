public class Sentence {
    private String sentence;
    private int numWords;

    public Sentence(String str){
        sentence = str;
        numWords = 0;
        int index = 0;

        for(int i=0; i<sentence.length(); i++){
            String temp = sentence.substring(index, index+1);
            if(temp.equals(" ")){
                numWords++;
            }
            index++;
        }

        numWords++;
    }

    public int getNumWords(){
        return numWords;
    }

    public String getSentence(){
        return sentence;
    }

    private static String removeAll(String s){
        String result = "";
    
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){  
            if(s.charAt(i)>='a' && s.charAt(i)<='z') 
                result += s.substring(i, i+1);
        }

        return result;
    }

    public boolean isPalindrone(){
        String temp = removeAll(sentence);
        return isPalindrone(temp, 0, temp.length()-1);
    }

    public static boolean isPalindrone(String s, int start, int end){
        if(start < end){
            if((s.substring(start, start+1)).equals(s.substring(end, end+1)))
                return isPalindrone(s, start+1, end-1);
            else
                return false;
        }
        else 
            return true;
    }
}
