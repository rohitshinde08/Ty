<?php
        $arr1=$_GET["n1"];
        $arr2=$_GET["n2"];
        $ch=$_GET["op"];
         
        switch ($ch) {
                     case 1:
                     $merged = $arr1 + $arr2;
                     echo"Merged Array is : $merged";
                      
                     break;                 
                           
                    case 2:
                    $result = array_intersect_assoc($arr1, $arr2);
                    echo"intersection of Array is : $result";
                    break;
        }
?>