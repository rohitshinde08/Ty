<html>
<head>
<title>Array search...!</title>
</head>
<h1>Array Search</h1>
<form method="post">
<label>Enter Array elements</label>
<input type="text" id="numbers"name="numbers">
<br>
<label>Enter a number to search
<input type="text" id="search" name="search">
</label>
<input type="submit" value="search">
</form>
<?php
	if(!empty($_POST["numbers"]) && !empty($_POST["search"]))
	{
	$inputnpo=$_POST["numbers"];
	$search=$_POST["search"];
	$no=explode(",",$inputno);
	if(array_key_exists($search,$no))
	{
	 echo "Element found";
	 }
	else
	{
	echo"Element not present";
	}	
        }
 ?>
 </body>
 </html>


