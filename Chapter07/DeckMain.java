public class DeckMain {
    public static void main(String[] args){
        Deck d = new Deck();
        d.writeDeck();
        d.shuffle();
        d.writeDeck();

        ManyDecks md = new ManyDecks();
        md.printDecks();
        md.shuffleAll();
        md.printDecks();
    }
}
