<?php
     
     function length(string $s)
     {
       $i=0;
       while ($s[$i]!='')
       {
             $i++;
       }
       echo "<br>$s : $i";
     }
     function vowels(string $s)
     {
              $k=0;
              while ($s[$i]!='')
              {
                    if ($s[$i]=='a' or $s[$i]=='e' or $s[$i]=='i' or $s[$i]=='o' or $s[$i]=='u' or $s[$i]=='A' or $s[$i]=='E' or $s[$i]=='I' or $s[$i]=='O' or $s[$i]=='U')
                    {
                       $k++;
                    }
                    $i++;
              }
              echo "<br>vowels : $k<br>";
     }
     function title(string $s)
     {
              $l=strtolower($s);
              echo "string in loweracse :$l";
              echo "<br>string in titlecase :";
              echo ucwords($l);              
     }
     function padding(string $s)
     {
              $t=str_pad($s,50,'<||>',STR_PAD_BOTH);
              echo "<br>padding<br>$t";
     }
     function  white($s)
     {
               $a=ltrim($s);
               echo "<br>Removed white spaces<br>$a";
               length($a);
     }
     function reverse($s)
     {
              $r=strrev($s);
              echo "<br>Reverse string is : $r";
     }
?>
