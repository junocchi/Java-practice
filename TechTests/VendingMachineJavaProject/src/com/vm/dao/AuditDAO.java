package com.vm.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AuditDAO {

	private PrintWriter writer;

	public AuditDAO() {
		try {
			// Create a new FileWriter with the file path
			FileWriter fileWriter = new FileWriter("auditDAO", true);
			// Create a PrintWriter to write to the file
			writer = new PrintWriter(fileWriter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void logEvent(String event) {
		// Get the current timestamp
		LocalDateTime timestamp = LocalDateTime.now();
		// Format the timestamp as a string
		String formattedTimestamp = timestamp.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

		// Write the event and timestamp to the file
		writer.println(formattedTimestamp + ": " + event);
		writer.flush();
	}

	public void close() {
		// Close the PrintWriter
		writer.close();
	}
}
