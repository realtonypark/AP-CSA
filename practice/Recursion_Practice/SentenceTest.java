public class SentenceTest {
    public static void main(String[] args){
        Sentence sent = new Sentence("A Santa Lived as a devil at Nasa.");
        System.out.println(sent.getNumWords());
        System.out.println(sent.getSentence());
        System.out.println(sent.isPalindrone());
    }
}