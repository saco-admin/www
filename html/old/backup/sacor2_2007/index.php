<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
"http://www.w3.org/TR/html4/strict.dtd">
<html>
    <head>
        <title>South Africa Computer Olympiad Second Round Solutions 2007</title>
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
        <h1>SACO Second Round Solutions 2007</h1>
        <p><a href="../sacor2_2001/">2001 Solutions</a></p>
        
        <ol>
            <li><a href="#q1">Tee</a></li>
            <li><a href="#q2">Triangle</a></li>
            <li><a href="#q3">Digit Sums</a></li>
            <li><a href="#q4">Dominoes</a></li>
            <li><a href="#q5">Hidden Strings</a></li>
            <li><a href="#q6">Cards</a></li>
            <li><a href="#q7">Rooms</a></li>
        </ol>
        
        <p><a href="../sacor2_2008/">2008 Solutions</a></p>
        
        <h2><a name="q1">Tee</a></h2>
        <h3>Python</h3>
        <?php display('tee.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('tee.java', 'java'); ?>
        <h3>Pascal</h3>
        <?php display('tee.pas', 'pascal'); ?>
        <h3>C++</h3>
        <?php display('tee.cpp', 'cpp'); ?>

        <h2><a name="q2">Triangle</a></h2>
        <h3>Python</h3>
        <?php display('triangle.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('triangle.java', 'java'); ?>
        <h3>Pascal</h3>
        <?php display('triangle.pas', 'pascal'); ?>
        <h3>C++</h3>
        <?php display('triangle.cpp', 'cpp'); ?>

        <h2><a name="q3">Digit Sums</a></h2>
        <h3>Python</h3>
        <?php display('digitsums.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('digitsums.java', 'java'); ?>
        <h3>Pascal</h3>
        <?php display('digitsums.pas', 'pascal'); ?>
        <h3>C++</h3>
        <?php display('digitsums.cpp', 'cpp'); ?>

        <h2><a name="q4">Dominoes</a></h2>
        <h3>Python</h3>
        <?php display('dominoes.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('dominoes.java', 'java'); ?>
        <h3>Pascal</h3>
        <?php display('dominoes.pas', 'pascal'); ?>
        <h3>C++</h3>
        <?php display('dominoes.cpp', 'cpp'); ?>

        <h2><a name="q5">Hidden Strings</a></h2>
        <h3>Python</h3>
        <?php display('hidden.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('hidden.java', 'java'); ?>
        <h3>Pascal</h3>
        <p>Might be coming soon...</p>
        <h3>C++</h3>
        <?php display('hidden.cpp', 'cpp'); ?>

        <h2><a name="q6">Cards</a></h2>
        <h3>Python</h3>
        <?php display('cards.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('cards.java', 'java'); ?>
        <h3>Pascal</h3>
        <p>Might be coming soon...</p>
        <h3>C++</h3>
        <?php display('cards.cpp', 'cpp'); ?>

        <h2><a name="q7">Rooms</a></h2>
        <h3>Python</h3>
        <?php display('rooms.py', 'python'); ?>
        <h3>Java</h3>
        <?php display('rooms.java', 'java'); ?>
        <h3>Pascal</h3>
        <p>Might be coming soon...</p>
        <h3>C++</h3>
        <?php display('rooms.cpp', 'cpp'); ?>

    </body>
</html>
