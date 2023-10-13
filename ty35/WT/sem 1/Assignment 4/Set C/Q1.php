<?php
$people=array("Sophia"=>"31","Jacob"=>"41","William"=>"39","Ramesh"=>"40");
echo"<br>The associative array is:</b>";
asort($people);
echo"<br>Ascending order sort by values:</b>";
foreach($people as $name=>$age)
{
	echo $name."=>".$age."<br>";
}
?>
<?php
$people=array("Sophia"=>"31","Jacob"=>"41","William"=>"39","Ramesh"=>"40");
echo"<br>The associative array is:</b>";
ksort($people);
echo"<br>Ascending order sort by key:</b>";
foreach($people as $name=>$age)
{
	echo $name."=>".$age."<br>";
}
?>
<?php
$people=array("Sophia"=>"31","Jacob"=>"41","William"=>"39","Ramesh"=>"40");
echo"<br>The associative array is:</b>";
arsort($people);
echo"<br>descending order sort by values:</b>";
foreach($people as $name=>$age)
{
	echo $name."=>".$age."<br>";
}
?>
<?php
$people=array("Sophia"=>"31","Jacob"=>"41","William"=>"39","Ramesh"=>"40");
echo"<br>The associative array is:</b>";
krsort($people);
echo"<br>descending order sort by key:</b>";
foreach($people as $name=>$age)
{
	echo $name."=>".$age."<br>";
}
?>


