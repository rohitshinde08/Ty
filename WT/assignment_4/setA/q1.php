<?php
        $a = $_GET["n1"];
        $ht = $b = explode(" ",$a);
        echo"Array of High Temp is : ";
        foreach ($b as $c)
                     echo $c."\t";
        echo"<br>";
        $sum=0;
        $cn=count($b);
        foreach ($b as $c)
                      $sum+=$c;
        $avg = $sum/$cn;
        rsort($b);
        $k = array_Slice($b,0,5);
        sort($ht);
       $n = array_Slice($ht,0,5);
        
       echo "Average High Temperature is : $avg &deg c";
       echo "<br>";
       echo "Five Warmest high temp is : ";
       foreach ($k as $k1)
                    echo $k1."\t\t";
                    
       echo "<br>";
       echo "Five coolest high temp : ";
       
       foreach ($n as $n1)
                    echo $n1."\t\t";
?>
