<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
"http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
        <title>South Africa Computer Olympiad Second Round Solutions 2008</title>
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
        <h1>SACO Second Round Solutions 2008</h1>
        
        <ol>
            <li><a href="#q1">Triangle</a></li>
            <li><a href="#q2">Heron's Formula</a></li>
            <li><a href="#q3">Checksums</a></li>
            <li><a href="#q4">Parkside's Triangle</a></li>
            <li><a href="#q5">Palindrome</a></li>
            <li><a href="#q6">Tiles</a></li>
            <li><a href="#q7">Path through the Primes</a></li>
        </ol>

        <h2><a name="q1">Triangle</a></h2>
        <h3>Python</h3>
        <?php display('triangle.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('triangle.java', 'java'); ?>
        <h3>Pascal</h3>
        <?php display('triangle.pas', 'pascal'); ?>
        <h3>C++</h3>
        <?php display('triangle.cpp', 'cpp'); ?>

        <h2><a name="q2">Heron's Formula</a></h2>
        <h3>Python</h3>
        <?php display('heron.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('heron.java', 'java'); ?>
        <h3>Pascal</h3>
        <?php display('heron.pas', 'pascal'); ?>
        <h3>C++</h3>
        <?php display('heron.cpp', 'cpp'); ?>

        <h2><a name="q3">Checksums</a></h2>
        <h3>Python</h3>
        <?php display('checksums.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('checksums.java', 'java'); ?>
        <h3>Pascal</h3>
        <?php display('checksums.pas', 'pascal'); ?>
        <h3>C++</h3>
        <?php display('checksums.cpp', 'cpp'); ?>

        <h2><a name="q4">Parkside's Triangle</a></h2>
        <h3>Python</h3>
        <?php display('parksides.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('parksides.java', 'java'); ?>
        <h3>Pascal</h3>
        <?php display('parksides.pas', 'pascal'); ?>
        <h3>C++</h3>
        <?php display('parksides.cpp', 'cpp'); ?>

        <h2><a name="q5">Palindrome</a></h2>
        <h3>Python</h3>
        <?php display('palindrome.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('palindrome.java', 'java'); ?>
        <h3>Pascal</h3>
        <?php display('palindrome.pas', 'pascal'); ?>
        <h3>C++</h3>
        <?php display('palindrome.cpp', 'cpp'); ?>

        <h2><a name="q6">Tiles</a></h2>
        <h3>Solution</h3>
        <?php include('tiles.html'); ?>
        <h3>Python</h3>
        <?php display('tiles.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('tiles.java', 'java'); ?>
        <h3>Pascal</h3>
        <?php display('tiles.pas', 'pascal'); ?>
        <h3>C++</h3>
        <?php display('tiles.cpp', 'cpp'); ?>

        <h2><a name="q7">Path through the Primes</a></h2>
        <h3>Solution</h3>
        <?php include('primes.html'); ?>
        <h3>Python</h3>
        <?php display('primes.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('primes.java', 'java'); ?>
        <h3>Pascal</h3>
        <p>Might be coming soon...</p>
        <h3>C++</h3>
        <?php display('primes.cpp', 'cpp'); ?>

    </body>
</html>
