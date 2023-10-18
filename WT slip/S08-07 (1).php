
<?php
     $x=$_POST['x'];
     $y=$_POST['y'];
     $n=$_POST['n'];
     function mod(int $x,int $y)
     {
       $op = $x % $y;
       echo "$x % $y = $op<br>";
     }
    
     function power(int $x,int $y)
     {
          $z=$x**$y;
          echo"$x^$y=$z<br>";
     }
     function sum(int $n)
     {
          $z=($n*($n+1))/2;
          echo"sum of $n natural nos. = $z<br>";
          
     }
     function fact(int $y)
     {
             
             $factorial = 1;  
             for ($x=$y; $x>=1; $x--)   
             {  
                    $factorial = $factorial * $x;  
             }  
             echo "Factorial of $num is $factorial";       
     }
     
?>
