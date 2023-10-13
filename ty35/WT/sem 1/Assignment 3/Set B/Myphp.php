<?php
 function gt($sno,$cname,$greet)
  {
  if(!empty($cname) || !empty($sno) || !empty($greet))
   {
    echo"$greet to Student Number $sno in $cname"; 
    return 0;
   }
 else
 { 
   echo"One of the parameters are missing!";
  }
  }          
  $studentno=$_POST["sno"];
  $collegename=$_POST["cname"];
  $msg=$_POST["greet"];
  gt( $studentno,$collegename,$msg);
?>

