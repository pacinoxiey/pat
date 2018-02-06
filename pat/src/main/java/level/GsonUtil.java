package level;

import com.google.gson.Gson;

/**
 * @author xiey
 * @version 2017年11月27日 下午9:59:30
 * @describe
 */
public class GsonUtil {
	
	private static Gson gson = new Gson();

	private GsonUtil() {
		// TODO Auto-generated constructor stub
	}
	
	public static Gson getInstance() {
		return gson;
	}
}
