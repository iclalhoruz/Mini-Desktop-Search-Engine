package searchengine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ReadFile {
    
    //Method that performs reading of selected files
    public static void readFile(String fileName, BST<String> bst, Set<String> bannedWords) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder textBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                textBuilder.append(line).append("\n");
            }
            String text = textBuilder.toString();
            processText(text, bst, bannedWords, fileName);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    //Method that reads the selected ignoreList file and creates a hash set of words
    public static Set<String> readBannedWord(String ignoreList) {
        Set<String> bannedWords = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(ignoreList))) {
            String line;

            while ((line = reader.readLine()) != null) {
                bannedWords.add(line.trim().toLowerCase());
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.println("Banned Words: " + bannedWords);
        
        return bannedWords;
    }

    //Separates the read file into words and adds it to the bst if it is not in the ignoreList
    private static void processText(String text, BST<String> bst, Set<String> bannedWords, String fileName) {     
        // Remove HTML tags
        text = text.replaceAll("<[^>]+>", "");

        // Split the text into words based on whitespace
        String[] words = text.split("\\s+");

        for (String word : words) {
            //remove non-alphanumeric characters
            word = word.replaceAll("[^a-zA-Z0-9']", " ").trim();
            
            if (!word.isEmpty() && !bannedWords.contains(word)) {
                bst.insert(word.toLowerCase(), fileName);
            }
        }
    }
}
