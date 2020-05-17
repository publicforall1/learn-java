package us.taiprogramer.session2;

import us.taiprogramer.session1.Keyboard;

public class Date {
	private int ngay, thang, nam;

	public Date() {
		ngay = 26;
		thang = 10;
		nam = 1955;
	}

	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public void hienThi() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}

	public boolean laNamNhuan() {
		boolean output = false;
		if (nam % 400 == 0) {
			output = true;
		} else if (nam % 4 == 0 && nam % 100 != 0) {
			output = true;
		} else {
			output = false;
		}
		return output;
	}

	public boolean hopLe() {
		if (ngay <= 0) {
			return false;
		}
		int daysInMonths[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// check all months except Feb
		if (thang != 2) {
			return ngay <= daysInMonths[thang];
		}
		// check Feb
		if (laNamNhuan()) {
			return ngay <= 29;
		}
		return ngay <= 28;
	}

	public void nhapNgay() {
		boolean valid = false;
		while (!valid) {
			ngay = Keyboard.getInt("Nhap ngay: ");
			thang = Keyboard.getInt("Nhap thang: ");
			nam = Keyboard.getInt("Nhap nam: ");
			valid = hopLe();
		}
	}

	public Date ngayHomSau() {
		int daysInMonths[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int month = thang;
		int year = nam;
		int day = ngay;

		if (month == 2) {
			daysInMonths[2] = laNamNhuan() ? 29 : 28;
		}

		++day;
		if (day > daysInMonths[month]) {
			day = 1;
			++month;
			if (month > 12) {
				month = 1;
				++year;
			}
		}
		return new Date(day, month, year);
	}

	public Date congNgay(int n) {
		Date d = new Date(ngay, thang, nam);
		for (int i = 0; i < n; ++i) {
			d = d.ngayHomSau();
		}
		return d;
	}

	@Override
	public boolean equals(Object obj) {
		Date d = (Date)obj;
		if (ngay == d.ngay && thang == d.thang && nam == d.nam) {
			return true;
		}
		return false;
	}

}
