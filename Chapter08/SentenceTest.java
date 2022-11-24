public class SentenceTest{
    public static void main(String[] args){
        Sentence line = new Sentence("\"Hello there!\" she said.");
        System.out.println(line.getSentence());
        System.out.println(line.getNumWords());
        System.out.println(line.isPalindrone());
        //System.out.println(Sentence.removeAll("\"Hello there!\" she said"));
    }
}