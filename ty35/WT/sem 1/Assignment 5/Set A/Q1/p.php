<?php
$fnm=$_GET["t1"];
echo "File name is:".$fnm."<br><br>";
$fp=fopen($fnm,"r");
if(!$fp){
	echo "File does not exist.....";
	}
else{
	$fs=filesize($fnm);
	echo"File size:".$fs."<br>";
	$content=fread($fp,$fs);
	echo"File contents: <br>".$content."<br>";
	
	
	}
?>

