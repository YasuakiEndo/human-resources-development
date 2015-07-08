public class List1_5 {
	public static void main(String... args) {
		final double TAX = 1.08;
		int fax = 5;
		System.out.println("5万円から4万円に値下げします");
		TAX = 4;
		System.out.println("FAXの新価格（税込み）");
		System.out.println(fax * TAX + "万円");
	}
}
