<!DOCTYPE html>
<head>
<title>Student marks</title>
</head>
<body>
<form action="result.php" method="post">
<table border="2">
<tr>
<th>Student Serial no</th>
<td><input type="text" name="ssn"></td>
</tr>
<tr>
<th>Subject name</th>
<th>Marks(Out of 100)</th>
</tr>
<?php
 for($i=1; $i<=5; $i++)
 {
 ?>
 <tr>
 <td><input type="text" name="subname[]" placeholder="Subject name <?php echo $i; ?>"></td>
 <td><input type="text" name="marks[]" placeholder="Marks out of 100"></td>
 </tr>
 <?php
 }
 ?>
 <table>
 <input type="submit" value="submit">
 </form>
 </body>
 </html>
 
 
 
