<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
"http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
        <title>South Africa Computer Olympiad Second Round Solutions 2001</title>
    </head>
    <body>
<?php
require_once('../../geshi/geshi.php');
function display($filename, $language) {
    $source = implode('', file($filename));
    $geshi =& new GeSHi($source, $language);
    $geshi->enable_line_numbers(GESHI_NORMAL_LINE_NUMBERS);
    print $geshi->parse_code();
    print "<p><a href='$filename'>Download</a></p>\n";
}
?>
        <h1>SACO Second Round Solutions 2001</h1>
        <p><a href="r2_2001.doc">Question Paper</a></p>
        
        <ol>
            <li><a href="#q1">Wondrous</a></li>
            <li><a href="#q2">Tent</a></li>
            <li><a href="#q3">Primes</a></li>
            <li><a href="#q4">Noughts and Crosses</a></li>
            <li><a href="#q5">Alphametric</a></li>
        </ol>

        <p><a href="../sacor2_2007/">2007 Solutions</a></p>
        
        <h2><a name="q1">Wondrous</a></h2>
        <h3>Python</h3>
        <?php display('wondrous.py', 'python'); ?>

        <h2><a name="q2">Tent</a></h2>
        <h3>Python</h3>
        <?php display('tent.py', 'python'); ?>

        <h2><a name="q3">Primes</a></h2>
        <h3>Python</h3>
        <?php display('primes.py', 'python'); ?>

        <h2><a name="q4">Noughts and Crosses</a></h2>
        <h3>Python</h3>
        <?php display('noughts_and_crosses.py', 'python'); ?>

        <h2><a name="q5">Alphametric</a></h2>
        <h3>Python</h3>
        <?php display('alphametric.py', 'python'); ?>

    </body>
</html>
