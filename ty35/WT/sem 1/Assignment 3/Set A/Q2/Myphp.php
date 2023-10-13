<?php
	function findlen($str)
	{
		$length=0;
		while(isset($str[length]))
		{
			$length++;
		}
		return $length;
	}
	function vow($str)
	{
		$vow=['a','e','i','o','u'];
		$cnt=0;
		foreach($vow as $vow)
		{
			$count+=substr_count($str,$vow);
		}
		return $count;	
	
	}
	function f3($str)
	{
		$stx=ucwords(strtolower($str));
		return $stx;
	}
	function rev($str)
	{
		return strrev($str);
	}
	function white($str)
	{
		return ltrim($str);
	}
	function pad($str)
	{
		str_pad($str,strlen($str),'*',STR_PAD_BOTH);
	}
	if($_POST)
	{
		$str=$_POST["str"];
		$choice=$_POST["choice"];
		$count=0;
		switch($choice)
		{
		case 1:
		{
		 $i=strlen($str);
		 echo"Length is $i";
		 break;
		 }
		case 2:
		{
		 $x=vow($str);
		 echo " no of vowels is $x";
		 break;
		}
		case 3:
		{
		 $str2=f3($str);
		 echo"String is:$str2";
		 break;
		}
		case 4:
		{
		pad($str);
		echo "$str";
		break;
		}
		case 5:
		{
		$strrr=white($str);
		echo"After Removing white spces:$strrr";
		break;
		}
		case 6:
		{
		$revstr=strrev($str)
		echo"Reversed string is:$revstr";
		break;
		}
	}
		
		
}
?>

