package us.taiprogramer.session3;

import us.taiprogramer.session1.Keyboard;
import us.taiprogramer.session2.Date;

public class SinhVien {
	public static final int SO_HOC_PHAN_TOI_DA = 10;
	private String mssv, hoTen;
	private Date ngaySinh;
	private int soHocPhan;
	private String tenHocPhan[];
	private String diemHocPhan[];

	public SinhVien() {
		mssv = new String("b1234567");
		hoTen = new String("Alice");
		ngaySinh = new Date(1, 1, 1980);
		soHocPhan = 0;
		tenHocPhan = new String[SO_HOC_PHAN_TOI_DA];
		diemHocPhan = new String[SO_HOC_PHAN_TOI_DA];
	}

	public SinhVien(SinhVien sv) {
		mssv = new String(sv.mssv);
		hoTen = new String(sv.hoTen);
		ngaySinh = new Date(sv.ngaySinh);
		soHocPhan = sv.soHocPhan;
		tenHocPhan = new String[SO_HOC_PHAN_TOI_DA];
		diemHocPhan = new String[SO_HOC_PHAN_TOI_DA];
		// copy data
		for (int i = 0; i < soHocPhan; ++i) {
			tenHocPhan[i] = new String(sv.tenHocPhan[i]);
			diemHocPhan[i] = new String(sv.diemHocPhan[i]);
		}
	}

	public void nhapThongTin() {
		System.out.println("[nhap thong tin cho sinh vien]");
		mssv = Keyboard.getString("mssv: ");
		hoTen = Keyboard.getString("ho ten: ");
		ngaySinh.nhapNgay();
		System.out.println("|#|");
	}

	public void nhapDiem() {
		System.out.println("[nhap diem cho cac hoc phan]");
		for (int i = 0; i < soHocPhan; ++i) {
			diemHocPhan[i] = Keyboard.getString(tenHocPhan[i] + ": ");
		}
		System.out.println("|#|");
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("[thong tin sinh vien]\n");
		stringBuilder.append("mssv      : " + mssv + "\n");
		stringBuilder.append("ho ten    : " + hoTen + "\n");
		stringBuilder.append("ngay sinh : " + ngaySinh.toString() + "\n");
		stringBuilder.append("[tinh hinh hoc tap]\n");
		stringBuilder.append("Mon hoc\t|\tDiem\n");
		for (int i = 0; i < soHocPhan; ++i) {
			stringBuilder.append(tenHocPhan[i] + "\t|\t" + diemHocPhan[i] + "\n");
		}
		stringBuilder.append("|#|\n");
		return stringBuilder.toString();
	}

	public void dangKiHocPhan() {
		System.out.println("[dang ki hoc phan]");
		if (soHocPhan == SO_HOC_PHAN_TOI_DA) {
			System.out.println("Khong the dang ki them hoc phan");
			return;
		}
		tenHocPhan[soHocPhan++] = Keyboard.getString("ten hoc phan: ");
		System.out.println("|#|");
	}

	public void xoaHocPhan() {
		System.out.println("[xoa hoc phan]");

		String tenHocPhanCanXoa = Keyboard.getString("ten hoc phan muon xoa: ");
		int location = -1;
		for (int i = 0; i < soHocPhan; ++i) {
			if (tenHocPhanCanXoa.equals(tenHocPhan[i])) {
				location = i;
				break;
			}
		}

		if (location == -1) {
			System.out.println("Khong tim thay hoc phan");
			return;
		}

		for (int i = location; i < soHocPhan - 1; ++i) {
			tenHocPhan[i] = tenHocPhan[i + 1];
		}
		--soHocPhan;

		System.out.println("|#|");
	}

	public float diemTrungBinh() {
		/* lazy, you can implement it by yourself :)) */
		return 1.0f;
	}
}
