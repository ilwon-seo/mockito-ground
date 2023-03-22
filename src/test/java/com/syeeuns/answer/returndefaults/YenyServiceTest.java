package com.syeeuns.answer.returndefaults;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Answers.RETURNS_DEFAULTS;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class YenyServiceTest {
	@Mock(answer = RETURNS_DEFAULTS)
	private YenyService yenyService;

	@Test
	void saveyenyWithStaticMockTest() {
		YenyService yenyService = mock(YenyService.class, RETURNS_DEFAULTS);
		String yenyName = yenyService.saveYeny("Macintosh");
		System.out.println("saveyenyWithStaticMockTest yenyName = " + yenyName);
		assertEquals(null, yenyName);
	}

	@Test
	void saveyenyWithAnnotationMockTest() {
		String yenyName = yenyService.saveYeny("Macintosh");
		System.out.println("saveyenyWithAnnotationMockTest yenyName = " + yenyName);
		assertEquals(null, yenyName);
	}
}