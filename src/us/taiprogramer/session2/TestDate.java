package us.taiprogramer.session2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDate {

	@Test
	void feb30IsNotValidDate() {
		Date d = new Date(30, 2, 2000);
		assertFalse(d.hopLe());
	}

	@Test
	void feb29OfLeapYearIsValidDate() {
		Date d = new Date(29, 2, 2000);
		assertTrue(d.hopLe());
	}

	@Test
	void Oct26IsValidDate() {
		Date d = new Date(26, 10, 1955);
		assertTrue(d.hopLe());
	}

	@Test
	void nextDayFeb28OfNotLeapYearIsMar1() {
		Date d = new Date(28, 2, 2021);
		assertTrue(d.ngayHomSau().equals(new Date(1, 3, 2021)));
	}

	@Test
	void next20DaysOfJun15Year2000IsJuly5() {
		Date d = new Date(15, 6, 2000);
		assertTrue(d.congNgay(20).equals(new Date(5, 7, 2000)));
	}
}
