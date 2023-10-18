
<?php
     $x=$_POST['x'];
     function len(string $x)
     {
              $i=0;
              while ($x[$i] != '') 
              {
                    $i++;
              }
          echo"length of $x : $i<br>";
     }      
     
     function vowels(string $x)
     {
              $k=0;
              while ($x[$i]!='')
              {
                    if ($x[$i]=='a' or $x[$i]=='e' or $x[$i]=='i' or $x[$i]=='o' or $x[$i]=='u' or $x[$i]=='A' or $x[$i]=='E' or $x[$i]=='I' or $x[$i]=='O' or $x[$i]=='U')
                    {
                       $k++;
                    } 
                    $i++;
              }
              echo"<br>total no. of Vowels are : $k<br>";
     }
    
     function LtoT(string $x)
     {        
     echo "LowerCase :-";
              echo strtolower("$x");
              $s = strtolower("$x");
              echo "<br>TitleCase :-";
              echo ucwords("$s");
     } 
     
     function padding(string $x)
     { 
              $t=str_pad($x,50,'!#*!',STR_PAD_BOTH);
              echo "<br>PADDING : $t<br>";
     }
     
     function wide($x)
     {
              $s=ltrim($x);
              echo "<br> REMOVED WIDE SPACES :- $s<br>";
              len($s);
     }
    
     function reverse(string $x)
     {
              echo "Reversed :";
              echo strrev($x);
     }
     
     
?>
