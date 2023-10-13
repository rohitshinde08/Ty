<?php
$event=$_GET['e1'];
var_dump($_GET);
$con=pg_connect("host=192.168.1.254 dbname=ty35 user=ty35 password=ty35");
var_dump($con);
if($con)
{
	echo"Database connected<br>";
}
else
{
	echo"Unable to connect to DataBase<br>";
}
$sql=<<<EOF
INSERT INTO EVENT(ENO,TITLE,DATE) VALUES (1,'genesis','2/12/2022');
INSERT INTO EVENT(ENO,TITLE,DATE) VALUES (2,'Freshes','2/12/2022');
INSERT INTO EVENT(ENO,TITLE,DATE) VALUES (4,'Sendoff','2/12/2022');
INSERT INTO COMMITTEE(CNO,NAME,HEAD,FROM_TIME,TO_TIME,STATUS) VALUES (23,'APPLEINC','DHARMADHIKARI','10PM','12PM','COMPLETE');
INSERT INTO COMMITTEE(CNO,NAME,HEAD,FROM_TIME,TO_TIME,STATUS) VALUES (22,'GOOGLE','TATA','3PM','1AM','PENDING');
INSERT INTO COMMITTEE(CNO,NAME,HEAD,FROM_TIME,TO_TIME,STATUS) VALUES (25,'XIOMI','GADKARI','3PM','4PM','COMPLETE ');
INSERT INTO COMMITTEE(ENO,CNO) VALUES (1,23);
INSERT INTO COMMITTEE(ENO,CNO) VALUES (4,22);
INSERT INTO COMMITTEE(ENO,CNO) VALUES (2,25);
EOF;

$ret=pg_query($con,$sql);
if(!$ret)
{
	echo pg_last_error($con);
}
else
{
	echo "<br>done<br>";
}
$updsql="UPDATE COMMITTEE SET STATUS='Working' WHERE CNO IN(SELECT CNO FROM EC WHERE ENO IN(SELECT ENO FROM EVENT WHERE TITLE ='$event'));";
$ret=pg_query($con,$updsql);
if(!$ret)
{
	echo "Error:".pg_last_error($con);
}
else
{
	else "<br>Updated<br>";
} 
pg_close($con);
?>
