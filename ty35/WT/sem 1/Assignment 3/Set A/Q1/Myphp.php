<?php
	if($_GET)
	{
		$no1=$_GET["no1"];
		$no2=$_GET["no2"];
		$op=$_GET["op"];
		switch($op)
		{
		case 1:
		{
		   $md=$no1%$no2;
		   echo "Mod of 2 numbers is:$md";
		   break;
		 }
		case 2:
		{
		  $pw=1;
		  $counter=$no2;
		  $a=$no1;
		  $b=$no2;
		  while($counter>0)
		  {
		  $pw=$pw*$a;
		  $counter--;
		  }
		  echo"power is:$pw";
		  break;
		}
		case 3:
		{
		 $ctr=0;
		 $max=$no1;
		 $sum=0;
		 while($ctr<$no1)
		 {
		 	$sum+=$ctr;
		 	$ctr++;
		 }
		 echo "Sum of first $no1 numbers is:$sum";
		 break;
		}
		case 4:
		{
			$fact=1;
			$N=$no2;
			$x=1;
			while($N>$x)
			{
				$fact*=$x;
				$x++;
			}
			echo"Factrorial of $no2 is: $fact";
		break;
		}
	}
		
		
}
?>

