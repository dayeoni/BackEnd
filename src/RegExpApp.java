import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpApp {
    
    public static void main(String[] args) {
        /*
        정규표현식
        - 패턴을 정의하고 해당 패턴에 맞는 문자열 추출하거나, 치환과 같은 작업을 수행
        - java.util.regex(Pattern, Matcher) 
        */

        String txt = "저는 여자이고 제 인스타그램 계정은 jslim1234@naver.com이고 폰 번호는 010-1111-1111이다"; // 자연어
        Pattern pattern = Pattern.compile("\\d{3}-\\d{4}-\\d{4}"); // 전화번호
        Matcher match = pattern.matcher(txt);
        if (match.find()) {
            System.out.println(">>>> 전화번호 추출");
            System.out.println(match.group());
        }
        // 이메일
        String regex = "[a-zA-z0-9]+@[a-zA-z0-9]+\\.[a-z]{2,}";
        pattern = Pattern .compile(regex);
        match = pattern.matcher(txt);
        if (match.find()) {
            System.out.println(">>>> 이메일 추출");
            System.out.println(match.group());
        }

    }
}
