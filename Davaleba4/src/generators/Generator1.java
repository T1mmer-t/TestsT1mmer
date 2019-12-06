package generators;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;


public class Generator1 implements Generate {
    private  Hashtable alphabet;
    private String language;
    private ArrayList parameters;
    private Random random;



    public Generator1(String language, ArrayList parameters) {
        alphabet = new Hashtable();
        random = new Random();
        this.language = language;
        this.parameters = parameters;
    }

    @Override
    public void generateAlphabet() {


        alphabet.put("ge", alphabet('ა', 'ჰ'));
        alphabet.put("ru", alphabet('а', 'я'));
        alphabet.put("en", alphabet('a', 'z'));

    }


    public String alphabet(char starter, char ender){
        String alpha = "";
        for(int i=(int)starter; i<=(int)ender; i++){
            alpha += (char)i;
        }
        return alpha;
    }

    @Override

    public String generateWord(int min, int max) {
        String word = "";
        int rand = random.nextInt(max-min+1)+min;
        for(int i=0; i<rand; i++){
            word += generateChar();
        }
        return word;
    }

    @Override
    public ArrayList generateSentence(ArrayList parameters) {
        ArrayList Sentences = new ArrayList();

        int p =  (int) parameters.get(0);
        int g =  (int) parameters.get(1);
        int Min = (int) parameters.get(2);
        int Max = (int) parameters.get(3);
        int Min2 = (int) parameters.get(4);
        int Max2 = (int) parameters.get(5);
        int rand = random.nextInt((int) g - p +1)+ p;
        int rand2 = random.nextInt((int) Max2 - Min2 +1)+ Min2;
        for(int i=0;i < rand; i++){
            String vid = new String();
            if(i > 0){
                vid+="    ";
            }
            for(int s=0; s < rand2; s++){
                vid+=generateWord(Min,Max)+" ";

            }
            Sentences.add(vid);
        }

        return Sentences;
    }

    @Override

    public char generateChar() {
        String  symbols =  alphabet.get(language).toString();
        char symbol = symbols.charAt(random.nextInt(symbols.length()));
        return symbol;
    }




}