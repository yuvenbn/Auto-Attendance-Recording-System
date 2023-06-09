<?php

require_once "config.php";
$sql = 'SELECT * FROM student WHERE studentid=2';
$result = pg_query($sql)  or die('Error message: ' . pg_last_error());
$data = array();
while ($row = pg_fetch_assoc($result))
        {
          $data[] = $row;  
        }

if( pg_num_rows($result) > 0){ 
    echo "ID FOUND";
    session_start();  
                 /* Redirect browser */ 
                  echo $result;
            
} else{
echo "ERROR: ID not FOUND $sql. "
. pg_last_error();
}
pg_close($conn);
$response = array('Person' => $data);
$jsonData = json_encode($response);
header('Content-Type: application/json');
echo $jsonData;
?>