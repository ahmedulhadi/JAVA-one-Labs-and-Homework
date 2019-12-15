public class Date {
	int year, month, day;

	public Date() {
		year = 1995;
		month = 1;
		day = 23;
	}

	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		return "Birthday :" + day + "/" + month + "/" + year + ".";
	}

	public static void main(String[] args) {
		Date birthday = new Date(1995, 3, 4);
		System.out.println(birthday);
	}

}
