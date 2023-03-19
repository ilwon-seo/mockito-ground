package com.vogella.junit5;
//https://www.vogella.com/tutorials/Mockito/article.html#prerequisites

/*
 * Static imports
 * Mockito provides a lot of static methods for mock and asserts. 
 * By adding the org.mockito.Mockito.*; static import, 
 * you can use these methods directly in your tests. 
 * Static imports allow you to call static members, i.e., methods 
 * and fields of a class directly without specifying the class.
 * Using static imports also greatly improves the readability of your test code.
 */
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.vogella.junit5.Database;
import com.vogella.junit5.Service;

@ExtendWith(MockitoExtension.class)
class ServiceTest {

	@Mock
	Database databaseMock;

	@Test
	public void testQuery() {
		assertNotNull(databaseMock);
		when(databaseMock.isAvailable()).thenReturn(true);
		Service svc = new Service(databaseMock);
		boolean check = svc.query("* from t");
		assertTrue(check);
	}
}