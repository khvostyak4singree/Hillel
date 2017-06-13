import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) throws IOException {
        String line = "/home/hillel/IdeaProjects/Hillel/Hillel/src/main/log";



//        String input ="wfrgegerg:,.arg";
//        Pattern p=Pattern.compile("[.,:;]");
////        Pattern p= Pattern.compile("(.+)d");
////        Pattern.matches(".+d", "abcd");
////        m.split("ghsdf;h.dfgh,dfG:sdh;");
//        Matcher m=p.matcher(input);
//        m.matches();
//        m.replaceAll("\n");
//        m.replaceFirst("\n");
//
//        m.find();//применение матчера
//        m.groupCount();//сколько груп
//        m.group(1);//обращение к первому матчеру
//
//    String input = "Rober Valek";
//    Pattern p= Pattern.compile("([^ ])");
//    Matcher m = p.matcher(input);
//    if (m.find()){
//        System.out.println(m.group(1));

//  String input = "5000.56,5001,10000";
//    Pattern p = Pattern.compile("^(?:Numbers: )?(?:(?:[2-9]\\d{3}|10000)(?:\\.\\d{2})?(?:,|$))+$");
//   Matcher m =p.matcher(input);
//  if(m.find()){
//      System.out.println(m.find());
//  }
//    }

        BufferedReader br = new BufferedReader(new FileReader(line));
        line= br.readLine();
        Pattern.matches("^(?i)(?:(?:Jun [0-9])(.*?)(?:(?:Activity:)(.?)(?:\\[Login \\.com\\)\\)])" +
                "(?:\\[Data\\)(?:\\[Records\\))(?:\\[User Action:\\))" +
                "(?:\\[User Action Status:\\))(?:\\[Service\\))(?:Mapping\\))" +
                "(?:\\[URI\\))" +
                "(?:Jun |$))+$))", line);
        System.out.println(line);
    }
}



