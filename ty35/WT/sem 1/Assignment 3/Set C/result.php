<?php
    if(!empty($_POST['ssn'])&&!empty($_POST['marks')){
	$ssn=$_POST['ssn'];
	$marks=$_POST['marks'];
	$total=0;
	foreach($marks as $mark)
	{
	 	$total+=(int)$mark;
	}
	
	$total_subject=count($marks);
	$percentage=($total/($total_subject*100))*100;
	
	$grade='';
	if($percentage>=90)
	{
	$grade='A';
	}
	elseif($percentage>=75)
	{
	$grade='B';
	}
	elseif($percentage>=60)
	{
	$grade='C';
	}
	elseif($percentage>=50)
	{
	$grade='D';
	}
	else
	{
	$grade='F';
	}
}
?>
<!DOCTYPE html>
<html>
<head>
<title>Student details</title>
</head>
<body>
<h1>Student Marks-Result</h1>
<?php if(!empty($ssn)&& !empty($marks)):?>
    <h2>Results</h2>
    <table border="1">
    <tr>
	<td>Student serial no:</th>
	<td>Total marks</th>
	<td>Percentage</th>
	<td>Grade</th>
    </tr>
    <tr>
	<td><?php echo $ssn; ?></th>
	<td><?php echo $total; ?></th>
	<td><?php number_format($percentage,2).'%'; ?></th>
	<td><?php echo $grade; ?></td>
    </tr>
</table>
<?php endif; ?>	
</body>
</html>

