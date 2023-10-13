<?php
	if(!empty($_POST["numbers"]) && !empty($_POST["newElement"]) && !empty($_POST["position"]))
	{
		$inputno=$_POST["numbers"];
		$newitem=$_POST["newElement"];
		$position=$_POST["position"];
		$orignalarray=explode(",",$inputno);
		array_splice($orignalarray,$position,0,$newitem);
		echo "updated Array is:";
		print_r($orignalarray);
	}
	else
	{
		echo"process failed";
	}
?>
	
