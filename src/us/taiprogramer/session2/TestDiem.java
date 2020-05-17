package us.taiprogramer.session2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDiem {

	@Test
	void distanceToO() {
		Diem p = new Diem(6, 8);
		assertEquals(p.khoangCach(), 10);
	}

	@Test
	void distanceFromAToB() {
		Diem p1 = new Diem(6, 8);
		Diem p2 = new Diem(5, 7);
		assertEquals(p1.khoangCach(p2), (float) Math.sqrt(2.0));
	}

}
