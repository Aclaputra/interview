<?php
    function cariNilai($Nilai, $a, $b) {
        $Sum = 0;
        for($i = 0; $i <= sizeof($Nilai); $i++) {
            if($Nilai[$i] == $a) {
                $Sum = $Sum + $Nilai[$i];
            } else if ($Nilai[$i] == $b) {
                $Sum = $Sum + $Nilai[$i];
            }
        }
        echo $Sum;
        echo "\n";
    }

    cariNilai([1, 3, 6, 7, 2, 5, 8, 4, 9, 0], 1, 8);
    // cariNilai([1, 3, 6, 7, 2, 5, 8, 4, 9, 0], 5, 8);