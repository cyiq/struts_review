package cyiq.converter;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;




import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class DateConverter extends DefaultTypeConverter{
	@Override
	public Object convertValue(Object value, Class totype) {
		if(value==null || totype==null){
			return false;
		}
		if(totype != java.util.Date.class){
			return false;
		}
		if(value instanceof java.lang.String[]){
			String [] str = (String[]) value;
			if(str[0] != null && str[0].length() > 0){
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
					return sdf.parse(str[0]);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
		
	}
}
