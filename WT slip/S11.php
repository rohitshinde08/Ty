<?php
  
$x=$_GET['x'];
$s=$_GET['s'];
$r=$_GET['r'];
$str_arr = explode ("$s", $x); 
print_r($str_arr);
echo"<br>";
$os = str_replace($s, $r, $x);
print_r($os);
echo"<br>";
$strr = strrchr($x,"$s");
echo "Last Word is $strr";
?>