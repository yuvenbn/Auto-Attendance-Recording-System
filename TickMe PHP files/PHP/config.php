<?php
	//	$conn = pg_connect("localhost", "postgre", "blinky", "Attendance");
	$conn = pg_connect("host=localhost dbname=Attendance user=postgres password=blinky");
		// Check connection
		if($conn === false){
			die("ERROR: Could not connect. "
				. pg_last_error());
		}
?>