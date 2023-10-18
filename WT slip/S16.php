<?php
    $x=$_GET['x'];
    $y=$_GET['y'];
    $op=$_GET['op'];

    
  
    function start($x,$y)
    {
        $pos=strpos($x,$y);
        if ($pos!==false)
           echo"small string appears at $pos of big string<br>";
        else
           echo"small string is not appears at start of big string<br>";
    }
    function Sml_Pos($x,$y)
    {
        $p=strpos($x,$y);
        if ($p!==false)
           echo"small string appears at $p of big string<br>";
        else
           echo"small string is not appears at start of big string<br>";
    }

    
    function Compare($x,$y)
    {
        $p=strncasecmp($x,$y,10);
        if ($p==0)
           echo"Both string are similar upto 10 char";
        else
           echo"Both string are not similar upto 10 char";
    }

    switch($op)
    {
        case 1:
            start($x,$y);
            break;
        case 2:
            sml_Pos($x,$y);
            break;
        case 3:
            Compare($x,$y);
            break;
    }  
  

?>