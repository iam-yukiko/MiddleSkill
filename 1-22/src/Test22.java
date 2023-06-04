import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test22 {
	public static void main(String[] args) {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		System.out.println("問１");
		//問題1:現在の時刻を出力してください
		Date date = new Date();
		System.out.println(date.toString());
		
		
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		Calendar shinya = Calendar.getInstance();
		Calendar minami = Calendar.getInstance();
		
		shinya.set(1998, 3 - 1, 19); 
		minami.set(2000, 2 - 1, 14); 
		
		Date dateOld = shinya.getTime();
	    Date dateNew = minami.getTime();
	    
	    if(dateOld.before(dateNew)) {
	        System.out.println(sdf.format(dateOld));
	      }
		 
		
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		Calendar furuyama = Calendar.getInstance();
		furuyama.set( 1998 , 9 , 12 );
		
		furuyama.add(Calendar.YEAR, 5);
		furuyama.add(Calendar.MONTH, 1);
		
		Date add = furuyama.getTime();
		
        System.out.println(sdf.format(add));
		
		
	}
}
