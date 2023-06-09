		<?php
		
		require_once "config.php";
		$PID = 1;
		$sql = 'SELECT * FROM lecturer';
		$result = pg_query($sql)  or die('Error message: ' . pg_last_error());
		if( pg_num_rows($result) > 0){ 
				echo "ID FOUND";
				session_start();  
                           $_SESSION['PID']=$PID;  
  
                             /* Redirect browser */ 
                              echo $result;
                        
		} else{
			echo "ERROR: ID not FOUND $sql. "
			. pg_last_error();
		}
		
		// Close connection
		pg_close($conn);
		?>