package com.syeeuns.answer.returnsmartnulls;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Answers.RETURNS_DEFAULTS;
import static org.mockito.Answers.RETURNS_SMART_NULLS;
import static org.mockito.Mockito.mock;

import com.syeeuns.answer.returndefaults.YenyService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.exceptions.verification.SmartNullPointerException;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class YenyServiceTest {
	@Mock(answer = RETURNS_SMART_NULLS)
	private YenyService yenyService;

	@Test
	void saveyenyWithStaticMockTest() {
		YenyService yenyService = mock(YenyService.class, RETURNS_SMART_NULLS);
		String yenyName = yenyService.saveYeny("Macintosh");
		System.out.println("saveYenyWithStaticMockTest yenyName = " + yenyName);
		System.out.println("saveYenyWithStaticMockTest yenyName = " + yenyName.toUpperCase());

		assertEquals("", yenyName);
		assertNotEquals(null, yenyName);
	}

	@Test
	void saveyenyWithAnnotationMockTest() {
		String yenyName = yenyService.saveYeny("Macintosh");
		System.out.println("saveYenyWithAnnotationMockTest yenyName = " + yenyName);
		System.out.println("saveYenyWithStaticMockTest yenyName = " + yenyName.toUpperCase());
		assertEquals("", yenyName);
		assertNotEquals(null, yenyName);
	}
}