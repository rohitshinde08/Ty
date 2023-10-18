<?php
$file=$_GET["f1"];
$fp=fopen($file,"r");
$ch=$_GET["op"];
switch($ch)
{
    case 1 :
    $ft=filetype($file);
    echo " The type of file is : ". $ft;
    break;
    case 2:
    $lt=fileatime($file);
    echo " The last accessed time of file  is : ". date("F D Y H:i:s",$lt);
    break;
    case 3:
    $fs=filesize($file);
    echo " The size of file is : ".$fs;
    break;
    case 4:
    $b=unlink($file);
    if($b==1)
       echo " File is deleted.....";
    else
        echo " File is not deleted....";
    
    //default:"invalid choice";
}
?>