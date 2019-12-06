package generators;

import java.util.ArrayList;

public interface Generate {
    public void generateAlphabet();
    public char generateChar();
    public String generateWord(int min, int max);
    public ArrayList generateSentence(ArrayList parameters);
}