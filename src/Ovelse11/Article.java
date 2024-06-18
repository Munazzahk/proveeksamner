package Ovelse11;

import java.util.ArrayList;

public class Article {
    private String heading;
    private String body;
    private String author;

    public Article(String heading, String body, String author) {
        setAuthor(author);
        setBody(body);
        setHeading(heading);
    }

    public String getLongestWord() {
        ArrayList<String> listOfWords = getWord();
        String theWord = "";

        for (String word : listOfWords) {
            if (word.length() >= theWord.length()) {
                theWord = word;
            }
        }
        return theWord;
    }

    public ArrayList<String> getWord() {
        ArrayList<String> allwords = new ArrayList<>();
        String[] splitBody = this.body.split(" ");

        for (String word : splitBody) {
            String newWord = word.toLowerCase();
            if (!allwords.contains(newWord)) {
                allwords.add(newWord);
            }
        }
        return allwords;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    @Override
    public String toString() {
        return "Heading: " + heading + "\n" + "Body: " + body + "\n" + "Author: " + author;
    }
}

