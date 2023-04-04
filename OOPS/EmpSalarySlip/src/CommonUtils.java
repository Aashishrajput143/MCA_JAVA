import java.time.LocalDate;
import java.time.LocalDateTime;  
public class CommonUtils {
	public String FormatDate() {
		return java.time.LocalDate.now().toString();
	}
	public String FormatName(String name) {
		//convert name into proper/title case
		//where first letter of each word is capital
		String fullName = "";
        String words[] = name.split(" ");
        for(String s : words) {
            if(s.equals("")) {
                continue;
            }
            char firstChar = s.charAt(0);
            String firstLetter = String.valueOf(firstChar).toUpperCase();
            fullName += firstLetter + s.substring(1).toLowerCase() + " ";
        }
        return fullName;
	}
}
