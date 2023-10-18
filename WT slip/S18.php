<?php
// Given associative array
$data = array("Sophia" => 31, "Jacob" => 41, "William" => 39, "Ramesh" => 40);

// a) Ascending order sort by value
asort($data);
echo "a) Ascending order sort by value:\n";
print_r($data);

// b) Ascending order sort by key
ksort($data);
echo "b) Ascending order sort by key:\n";
print_r($data);

// c) Descending order sort by value
arsort($data);
echo "c) Descending order sorting by value:\n";
print_r($data);

// d) Descending order sort by key
krsort($data);
echo "d) Descending order sorting by key:\n";
print_r($data);
?>