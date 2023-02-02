<?php
$handle = fopen("php://stdin","r");
fscanf($handle,"%d\n",$T);
for ($t=1; $t<=$T; $t++) {
    fscanf($handle,"%d%d\n",$n,$m);
    $c = explode(" ",fgets($handle));
    $sum = 0;
    for ($i=0; $i<$n; $i++) 
        $sum += (int)$c[$i];
    $ans = $sum % $m;
    printf("Case #%d: %d\n",$t,$ans);
}
?>