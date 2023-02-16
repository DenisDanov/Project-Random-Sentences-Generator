import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomSentencesGenerator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        names.add("Denis");
        names.add("Kristian");
        names.add("Martin");
        names.add("Svetlin");
        names.add("Venelin");
        names.add("Antoan");

        List<String> places = new ArrayList<>();

        places.add("Svidnya");
        places.add("Svoge");
        places.add("Sofia");
        places.add("Pernik");
        places.add("Plovdiv");
        places.add("Burgas");

        List<String> verbs = new ArrayList<>();

        verbs.add("eats");
        verbs.add("drives");
        verbs.add("trains");
        verbs.add("plays");
        verbs.add("watches");
        verbs.add("drinks");

        List<String> nouns = new ArrayList<>();

        nouns.add("kebab");
        nouns.add("League of Legends");
        nouns.add("car");
        nouns.add("TV");
        nouns.add("beer");


        List<String> adverbs = new ArrayList<>();

        adverbs.add("slowly");
        adverbs.add("rapidly");
        adverbs.add("fastly");
        adverbs.add("sadly");
        adverbs.add("rarely");
        adverbs.add("quickly");

        List<String> details = new ArrayList<>();

        details.add("near the river");
        details.add("at home");
        details.add("around the city");
        details.add("in the park");
        details.add("in the pub");
        details.add("in the gym");

        System.out.println("Hello, this is your first random-generated sentence: ");

        while (true){

            String randomName = getRandomWord(names);
            String randomPlaces = getRandomWord(places);
            String randomVerb = getRandomWord(verbs);
            String randomNoun = getRandomWord(nouns);
            String randomDetail = getRandomWord(details);

            System.out.printf("%s from %s %s %s %s%n",randomName,randomPlaces,randomVerb,randomNoun,randomDetail);
            System.out.println("Click [Enter] to generate a new one.");

        }

    }

    public static String getRandomWord (List<String> words){
        Random random = new Random();

        int randomIndex = random.nextInt(words.size());

        String word = words.get(randomIndex);

        return word;
    }
}