--Delete a lecturer:
DELETE FROM Lecturer WHERE lecturerid =3; 
--Remove a student's enrollment from a course:
DELETE FROM Enrollment WHERE studentid = 5 AND courseid =2;
--Delete a course and all its related lectures:
DELETE FROM Course WHERE courseid =8;
--Remove a specific lecture:
DELETE FROM Lecture WHERE lectureid =6;
--Delete a student's attendance record in a lecture:
DELETE FROM Attendance WHERE studentid = 7 AND lectureid =8;
