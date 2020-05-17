package us.taiprogramer.session2;

import us.taiprogramer.session1.Keyboard;

public class Diem {
	private int x, y;

	public Diem() {
		x = y = 0;
	}

	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void nhapPoint2D() {
		x = Keyboard.getInt("Nhap x: ");
		y = Keyboard.getInt("Nhap y: ");
	}

	public void hienThi() {
		System.out.println("(" + x + ", " + y + ")");
	}

	public void doiPoint2D(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public int giaTriX() {
		return x;
	}

	public int giaTriY() {
		return y;
	}

	public float khoangCach() {
		return (float) Math.sqrt(x * x + y * y);
	}

	public float khoangCach(Diem d) {
		return (float) Math.sqrt(Math.pow((double) (d.giaTriX() - x), 2) + Math.pow((double) (d.giaTriY() - y), 2));
	}

}
