<?php
     $n=$_GET['n'];
     $s=$_GET['s'];
     $m=$_GET['m'];
     $total=0;
     for ($i=0;$i<5;$i++)
     {
         $total=$total+$m[$i];
     }
     $per=$total/5;
     echo "$per";
     
     echo "TABLE";
     echo "<table border=1>";
     //echo "<table>";
     echo "<th>";
     echo "serial number";
     echo "</th>";
     echo "<th>";
     echo "subject";
     echo "</th>";
     echo "<th>";
     echo "marks";
     echo "</th>";
     
     for ($i=0;$i<count($n);$i++)
     {
     
         echo "<tr>";
         echo "<td>";
         echo "$n[$i]";
         echo "</td>";
         echo "<td>";
         echo "$s[$i]";
         echo "</td>";
         echo "<td>";
         echo "$m[$i]";
         echo "</td>";
         echo "</tr>";
     }
     echo "<tr ><td colspan=3 align=right>Total:$total</td></tr>";
     echo "<tr><td colspan=3 align=right>Percentage:$per</td></tr>";
     if ($per>=90)
     {
        echo "<tr><td colspan=3 align=right>Grade: A</td></tr>";
     }
     else if ($per>=80 && $per<90)
     {
        echo "<tr><td colspan=3 align=right>Grade: B</td></tr>";
     }
     else if ($per>=60 && $per<80)
     {
        echo "<tr><td colspan=3 align=right>Grade: C</td></tr>";
     }
     else if ($per>=35 && $per<60)
     {
        echo "<tr><td colspan=3 align=right>Grade: D</td></tr>";
     }
     else
     {
        echo "<tr><td colspan=3 align=right>Grade: fail</td></tr>";
     }
     echo "</table>";
?>
