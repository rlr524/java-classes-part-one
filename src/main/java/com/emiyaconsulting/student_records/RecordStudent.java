package com.emiyaconsulting.student_records;

// The () is the record header
// All record fields are private and final
public record RecordStudent(String id, String lastName, String firstName, String dateOfBirth, String classLevel) {
}
