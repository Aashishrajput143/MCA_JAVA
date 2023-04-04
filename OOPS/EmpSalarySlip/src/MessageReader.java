import java.util.ResourceBundle;

public class MessageReader {
	ResourceBundle rb;
	public MessageReader() {
		rb = ResourceBundle.getBundle("message");
	}
	public String getMessages(String key) {
		return rb.getString(key);
	}
}
