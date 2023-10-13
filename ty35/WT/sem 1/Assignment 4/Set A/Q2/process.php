<?php
$a=$_GET['v'];
$b=array(1,2,3,4,5,6,,8,9,10);
switch($a)
{
	case 1:
	      print_r($b);
	      array_push($b,10);
	      echo"<br>";
	      echo"After insert an element in stack:<br>";
	      print_r($b);
	      break;
	case 2:
	      print_r($b);
	      array_pop($b);
	      echo"<br>";
	      echo"After poping an element from stack:<br>";
	      print_r($b);
	      break;
	case 3:
	      echo"Contents of stack<br>";
	      print_r($b);
	      break;
        case 4:
              print_r($b);
	      array_unshift($b,45);
	      echo"<br>";
	      echo"After insert an element in queue:<br>";
	      print_r($b);
	      break;
	case 5:
	      print_r($b);
	      array_shift($b);
	      echo"<br>";
	      echo"After deleting an element from queue:<br>";
	      print_r($b);
	      break;
        case 6:
              print_r($b);
              break;
        	}
?>
