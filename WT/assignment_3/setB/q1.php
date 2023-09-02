<?php
     $x=$_POST['x'];
     $y=$_POST['y'];
     /*function cnt($x,$y)
     {
              $c=substr_count($x,$y);
              echo "$y appears $c times in $x";
     }
     cnt($x,$y);*/
     function pos(string $x,string $y)
     {
              $c=0;
              $z=strlen($y);
              while($y[$i]!='')
              {
                   if ($y[$i]==$x[$i])
                   {
                      $c++;
                   }
                   $i++;
              }
              if ($z==$c)
                 echo "$y is present in $x at the start";
              else
                 echo "$y is not present in $x at the start";
     }
     pos($x,$y);
?>
