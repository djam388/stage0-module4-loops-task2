package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void main(String[] args) {
        buildPhrase('t', 'e', 's', 't', ' ', 'w', 'o', 'r', 'd');
    }
    public static void buildPhrase(char... chars) {
        int counter = 0;
        while (counter < chars.length) {
            System.out.print(chars[counter]);
            counter++;
        }

    }
}
