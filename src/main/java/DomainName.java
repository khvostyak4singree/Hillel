import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class DomainName {
        public static void main(String args[]) throws Exception {
            Scanner x= new Scanner(System.in);
            System.out.println("The host part is " + getDomainName(x.next()));
        }
            public static String getDomainName(String url) throws  URISyntaxException {
                URI u = new URI(url);
                String domain = u.getHost();
                return domain.startsWith("www.") ? domain.substring(4) : domain;
            }
        }
