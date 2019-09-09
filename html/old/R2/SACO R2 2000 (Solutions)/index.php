<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
"http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
        <title>South Africa Computer Olympiad Second Round Solutions 2000</title>
    </head>
    <body>
<?php
require_once('../../../geshi/geshi.php');
function display($filename, $language) {
    $source = implode('', file($filename));
    $geshi =& new GeSHi($source, $language);
    $geshi->enable_line_numbers(GESHI_NORMAL_LINE_NUMBERS);
    print $geshi->parse_code();
    print "<p><a href='$filename'>Download</a></p>\n";
}
?>
        <h1>SACO Second Round Solutions 2000</h1>
        <p><a href="../SACO R2 2000.pdf">Question Paper</a></p>
        
        <ol>
            <li><a href="#q1">Tables</a></li>
            <li><a href="#q2">Two Keys</a></li>
            <li><a href="#q3">OE-Primes</a></li>
            <li><a href="#q4">Digits</a></li>
            <li><a href="#q5">Fractions</a></li>
        </ol>

      
        <h2><a name="q1">Tables</a></h2>
        <h3>Python</h3>
        <?php display('Tables.py', 'python'); ?>

        <h2><a name="q2">Two Keys (a)</a></h2>
        <h3>Python</h3>
        <?php display('Two_Keys.py', 'python'); ?>
        
        <h2>Two Keys (b)</h2>
        <h3>Python</h3>
        <?php display('Two_Keys2.py', 'python'); ?>
        
        <h2><a name="q3">OE-Primes</a></h2>
        <h3>Python</h3>
        <?php display('OE-Primes.py', 'python'); ?>

        <h2><a name="q4">Digits</a></h2>
        <h3>Python</h3>
        <?php display('Digits.py', 'python'); ?>

        <h2><a name="q5">Fractions</a></h2>
        <h3>Python</h3>
        <?php display('Fractions.py', 'python'); ?>

    </body>
</html>
