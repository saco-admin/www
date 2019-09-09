<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
"http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
        <title>South Africa Computer Olympiad Second Round Solutions 2010</title>
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
        <h1>SACO Second Round Solutions 2010</h1>

        <ol>
            <li><a href="#q1">Palin</a></li>
            <li><a href="#q2">Fizzbuzz</a></li>
            <li><a href="#q3">133t</a></li>
            <li><a href="#q4">Mansion</a></li>
            <li><a href="#q5">Messages</a></li>
        </ol>

        <h2><a name="q1">Palin</a></h2>
        <h3>Python</h3>
        <?php display('palin.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('Palin.java', 'java'); ?>

        <h2><a name="q2">Fizzbuzz</a></h2>
        <h3>Python</h3>
        <?php display('fizzbuzz.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('Fizzbuzz.java', 'java'); ?>

        <h2><a name="q3">133t</a></h2>
        <h3>Python</h3>
        <?php display('1337.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('L33t.java', 'java'); ?>

        <h2><a name="q4">Mansion</a></h2>
        <h3>Python</h3>
        <?php display('mansion.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('Mansion.java', 'java'); ?>

        <h2><a name="q5">Messages</a></h2>
        <h3>Python</h3>
        <?php display('unaran.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('Unaran.java', 'java'); ?>

    </body>
</html>
