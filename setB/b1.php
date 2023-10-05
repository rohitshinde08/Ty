<?php
      $a=$_GET["n1"];
      $el=$_GET["n2"];
      $pos=$_GET["n3"];
      $s=$_GET["s"];
      $b=explode(" ",$a); 
      echo " Array elements are :";
      foreach ($b as $c)
              echo "$c\t";
      echo "<br>";      
      $arr=array_splice($b,$pos,1,$el);
      echo "removed element from array is : ";
      foreach($arr as $c)
              echo "$c\t";
      echo "<br>";    
      echo "Updated Array: ";
      foreach ($b as $k)
             echo "$k\t";
      echo "<br>";
      if (array_search($s,$b))      
         echo "Element found at $x pos ";    
      else 
        echo"Element not found";       
?>  
