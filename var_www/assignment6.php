<?php
	$op = $_POST["op"];
	if( $op == "uploadSchedule" ){
		$val = $_POST["val"];
		$cmd = "java -classpath /var/www/cgi-bin:/var/www/cgi-bin/mysql-connector-java-5.1.23-bin.jar assignment6.server $op $val";
		print($cmd);
	}
	else {
		$skill = $_POST["skill"];
		$day = $_POST["day"];
		$hour =$_POST["hour"];
		$cmd = "java -classpath /var/www/cgi-bin:/var/www/cgi-bin/mysql-connector-java-5.1.23-bin.jar assignment6.server $op $skill $day $hour";
		print($cmd);
	}	
	$str = shell_exec($cmd);
	print($str);
?>
