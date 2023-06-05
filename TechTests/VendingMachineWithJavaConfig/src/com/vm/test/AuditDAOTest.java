package com.vm.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vm.dao.AuditDAO;

class AuditDAOTest {
	private static final String FILE_PATH = "auditDAO";

    private AuditDAO auditDAO;

    @BeforeEach
    public void setUp() {
        auditDAO = new AuditDAO();
    }

    @AfterEach
    public void tearDown() {
        auditDAO.close();
    }

	@Test
    public void testLogEvent() throws IOException {
        // Create an instance of AuditDAO
        AuditDAO auditDAO = new AuditDAO();

        // Log an event
        String event = "Event 1";
        auditDAO.logEvent(event);

        // Close the AuditDAO
        auditDAO.close();

        // Read the contents of the audit file
        BufferedReader reader = new BufferedReader(new FileReader("auditDAO"));
        String line = reader.readLine();

        // Assert that the logged event is present in the file
        Assertions.assertTrue(line.contains(event));

        // Close the reader
        reader.close();
    }

    @Test
    public void testLogMultipleEvents() throws IOException {
        // Create an instance of AuditDAO
        AuditDAO auditDAO = new AuditDAO();

        // Log multiple events
        String event1 = "Event 1";
        String event2 = "Event 2";
        auditDAO.logEvent(event1);
        auditDAO.logEvent(event2);

        // Close the AuditDAO
        auditDAO.close();

        // Read the contents of the audit file
        BufferedReader reader = new BufferedReader(new FileReader("auditDAO"));
        String line1 = reader.readLine();
        String line2 = reader.readLine();

        // Assert that the logged events are present in the file
        Assertions.assertTrue(line1.contains(event1));
        Assertions.assertTrue(line2.contains(event2));

        // Close the reader
        reader.close();
    }
}