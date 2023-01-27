<?php
function solve($handle) {
    fscanf($handle,"%d%d\n",$n,$m);
    $C_array = explode(" ",fgets($handle));
    $sum = 0;
    for ($i=0; $i<$n; $i++) 
        $sum += (int) $C_array[$i];
    return $sum % $m;
}

$handle = fopen("php://stdin","r");
fscanf($handle,"%d\n",$t);
for ($tt=1; $tt<=$t; $tt++) 
    printf("Case #%d: %d\n", $tt, solve($handle));
?>