import java.util.Scanner;

public class class_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		System.out.print("請輸入發票建立張數: ");
		int math=scn.nextInt();
		int x=0;
		
		while(x<math){
		System.out.println("請輸入次數");
		int s = scn.nextInt();
		item user[] = new item[s];
		System.out.println("請輸入名稱數量價格");
		for (int i = 0; i < s; i++) {
			String a = scn.next();
			int b = scn.nextInt();
			int c = scn.nextInt();
			user[i] = new item(a, b, c);
		}
		// invoice store = new invoice("台中市霧峰區柳豐路500號", "04-23323456 #6101",
		// "04-23233876");
		System.out.println("請輸入 地址 電話 傳真");
		invoice store = new invoice(scn.next(), scn.next(), scn.next());
		if ((store.tel).matches("[0-9]{2}-[0-9]{8}")) {
			System.out.println("電話格式正確");
		} else
			System.out.println("電話格式錯誤");

		if (store.fax.matches("[0-9]{2}-[0-9]{8}"))
			System.out.println("傳真格式正確");
		else
			System.out.println("傳真格式錯誤");

		System.out.println("             發票(亞洲資工站)");
		System.out.println("地址:" + store.address);
		System.out.println("電話:" + store.tel);
		System.out.println("傳真:" + store.fax);
		System.out.println("商品項目\t數量\t單價\t小計");
		for (int i = 0; i < s; i++) {
			System.out.println(user[i].name + "\t" + user[i].number + "\t"
					+ user[i].prise + "\t" + user[i].number * user[i].prise);
		}

		float total = 0;
		for (int i = 0; i < s; i++) {
			total = total + user[i].number * user[i].prise;
		}
		System.out.println("合計" + total);
		
		x++;
		}
	}
}

class invoice {
	public String address;
	public String tel;
	public String fax;

	public invoice(String add1, String tel1, String fax1) {
		address = add1;
		tel = tel1;
		fax = fax1;
	}
}

class item {
	public int number;
	public String name;
	public float prise;
	public item(String name1, int num, float pri) {
		number = num;
		name = name1;
		prise = pri;
	
	}

}
