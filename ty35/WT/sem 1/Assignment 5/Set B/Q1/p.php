<?php
if(file_exists("item.dat"))
{
 $fp=fopen("item.dat","r");
 echo"<br><br>";
 echo "<table border=2 align=center cellpadding=10>";
 echo "<tr><td colspan=7 align=center color=pink><h3>Book Record</h3></td></tr>";
 echo "<tr><td align=center>Item code</td>";
 echo "<td align=center>Name</td>";
 echo "<td align=center>Qty</td>";
 echo "<td align=center>Rate</td>";
 echo "<td align=center>B_TT</td></tr>";
 while(!feof($fp))
 {
 	$d=fgets($fp);
 	$s=explode(" ",$d);
 	if(!empty($s[0]) && !empty($s[1]) && !empty($s[2]) && !empty($s[3]))
 	{
 		$m1=$s[2];
 		$m2=$s[3];
 		$total=$m1*$m2;
 		echo"<tr><td align=center>$s[0]</td>";
 		echo"<td align=center>$s[1]</td>";
 		echo"<td align=center>$m1</td>";
 		echo"<td align=center>$m2[0]</td>";
 		echo"<td align=center>$total</td>";
 	}
 }
 echo"</table>";
 }
 ?> 
 
