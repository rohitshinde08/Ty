<?php
     $a=$_GET["n1"];
     $el=$_GET["n2"];
     $pos=$_GET["n3"];
     $s=$_GET["s"];
     $b=explode(" ",$a);
     
     echo "old array element are :";
     foreach ($b as $c)
             echo "$c\t";
     echo "<br>";
     $arr=array_splice($b,$pos,1,$el);
     
     echo "removed element from array is :";
     foreach($arr as $c)
            echo "$c\t";
     echo "<br>";
     
     echo "Updated array is :";
     foreach($b as $k)
            echo "$k\t";
     echo "<br>";
     
     $k=count($b);
     if (array_search($s,$b))
     {
        //$x=array_pos($s,$b);
        echo "Element $s is found ";
        return;
     }
     echo "element $s is not found";
?> 
