public class WordPlay {
    public static void stackWords(){
        String word = ".";
        if(word.equals("."))
            System.out.println();
        else
            stackWords();
        System.out.println(word);
    }
    
    public static void main(String[] args){
        System.out.println("Enter list of words, one per line.");
        System.out.println("Final word should be a period");
        stackWords();
    }

}
