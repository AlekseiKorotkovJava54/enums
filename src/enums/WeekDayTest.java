package enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WeekDayTest {

	@Test
	void testSwitchExpression() {
		String expected = "Weekend";
		assertEquals(expected, getDayDiscriptionSwitchStatement(WeekDay.SAT));
	}
	void testSwitchStatement() {
		String expected = "Working day";
		assertEquals(expected, getDayDiscriptionSwitchExpression(WeekDay.MON));
	}

	private Object getDayDiscriptionSwitchStatement(WeekDay day) {
		String res = "Working day";
		switch(day) {
		case SUN: res = "Weekend if you live not in Israel"; break;
		case FRI: res = "Weekend if you live in Israel"; break;
		case SAT: res = "Weekend"; break;
		default: res = "Working day";
		}
		return res;
	}
	private Object getDayDiscriptionSwitchExpression(WeekDay day) {
		String res = switch(day) {
		case SUN -> "Weekend if you live not in Israel";
		case FRI -> "Weekend if you live in Israel";
		case SAT -> "Weekend";
		default  -> "Working day";
		};
		return res;
	}

}
