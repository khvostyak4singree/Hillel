import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class ReadTextFile {
    public static void main(String[] args){
        try {
            String filePath = "C:\\Users\\777\\IdeaProjects\\HillelProject\\src\\main\\java\\text.txt";

            totalLinesAndWords(filePath);
            numberOfEachWords(filePath);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void totalLinesAndWords(String filePath) throws FileNotFoundException {
        int countLines = 0;
        int countWords = 0;
        String line;
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                countLines++;
                String[] myWords = line.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
                countWords += myWords.length;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Total lines: " + countLines);
        System.out.println("Total words: " + countWords);
    }

    private static void numberOfEachWords(String filePath){
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filePath));
            String line = br.readLine();

            while (line != null) {
                String[] words = line.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");

                for (String word : words) {
                    if(wordCountMap.containsKey(word)) {
                        wordCountMap.put(word, wordCountMap.get(word)+1);
                    }
                    else {
                        wordCountMap.put(word, 1);
                    }
                }
                line = br.readLine();
            }

            Set<Map.Entry<String, Integer>> entrySet = wordCountMap.entrySet();
            List<Map.Entry<String, Integer>> list = new ArrayList<>(entrySet);

            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                    return (e2.getValue().compareTo(e1.getValue()));
                }
            });

            System.out.println("The number of each word: ");

            for (Map.Entry<String, Integer> entry : list) {
                if (entry.getValue() > 0) {
                    System.out.println(entry.getKey() + " : "+ entry.getValue());
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
