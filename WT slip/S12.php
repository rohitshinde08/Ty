<?php
  
$n=$_GET['n'];
$c=$_GET['c'];
$g=$_GET['g'];
//echo "Name : $n , College Name : $c , Greeting : $g";

function Check($n,$c,$g)
{
         
         $a = func_get_args();
         if ($a[0]==NULL or $a[1]==NULL or $a[2]==NULL)
            echo "Parameter is Missing...<br><br>";
         else
            echo "Hello $n,<br>$g to $c";    
}
Check($n,$c,$g);


?>