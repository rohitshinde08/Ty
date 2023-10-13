<html>
<head>
<title>High tempereture Array</title>
</head>
<body bgcolor="skyblue">
<h1>High temperature for spring month</h1>
<?php
$hightemps=array(68,76,87,67,75,87,76,76,76,87,83,75,84,84,78,77,66,88,68,68,67,66,77,76,78,88,87,86,70);
$count=count($hightemp);
$total=0;
foreach($hightemps as $h)
{
	$total+=$h;
	$avg=round($total/$count);
	echo "<p>the average high tempereture for the month was $avg &deg;</p>\n";
	rsort($hightemps);
	$tottemp=array_slice($hightemps,0,5);
	echo"<p>The warmest five temperature were:<br>"                                                                                              
	
}

